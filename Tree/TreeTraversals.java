package me.neu.Tree;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by pramod on 10/27/2016.
 */
public class TreeTraversals {

    /*-- Inorder Traversal Recursive --*/
    static void inOrder(TreeNode root){
        if(root == null){
            return;
        }else{
            inOrder(root.left);
            System.out.print(root.data);
            inOrder(root.right);
        }
    }

    /*-- Pre order Traversal Recursive --*/
    static void preOrder(TreeNode root){
        if(root == null){
            return;
        }else{
            System.out.print(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }


    /*-- Post order Traversal Recursive --*/
    static void postOrder(TreeNode root){
        if(root == null){
            return;
        }else{
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data);
        }
    }

    /*-- Height of Tree --*/
    static int heightOfTree(TreeNode root){
        if(root == null){
            return 0;
        }else{
            return Math.max(heightOfTree(root.left),heightOfTree(root.right))+1;
        }
    }

    /*-- Level Order Iterative--*/
    static void levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode out = queue.poll();
            System.out.print(out.data);
            if(out.left != null){
                queue.add(out.left);
            }

            if(out.right != null){
                queue.add(out.right);
            }
        }

    }

    /*-- LCA --*/

    static TreeNode lca(TreeNode root, int value1, int value2){
        TreeNode commonNode = null;
        Stack<TreeNode> path1 = new Stack<>();
        Stack<TreeNode> path2 = new Stack<>();
        returnPath(root,value1,path1);
        returnPath(root,value2,path2);

        while(path1.peek().data != path2.peek().data && !path1.isEmpty() && !path2.isEmpty()){
            path1.pop();
            path2.pop();
        }

        if(path1.peek().data == path2.peek().data){
            commonNode = path1.pop();
        }
        return commonNode;
    }

    static boolean returnPath(TreeNode root, int value, Stack<TreeNode> path){
        if(root == null){
            return false;
        }else if(root.data == value || returnPath(root.left,value,path) || returnPath(root.right,value,path)){
            path.push(root);
            return true;
        }
        return false;
    }


    /*-- Spiral Order Traversal--*/
    static void spiralOrder(TreeNode root){
        Stack<TreeNode> evenStack = new Stack<>();
        Stack<TreeNode> oddStack = new Stack<>();

        boolean isEvenStack = true;
        evenStack.push(root);
        while ( (isEvenStack && !evenStack.isEmpty()) || !oddStack.isEmpty() ){
            if(isEvenStack){
                while(!evenStack.isEmpty()){
                    TreeNode currentNode = evenStack.pop();
                    System.out.print(currentNode.data);
                    if(currentNode.right != null){
                        oddStack.push(currentNode.right);
                    }

                    if(currentNode.left !=null){
                        oddStack.push(currentNode.left);
                    }


                }
            }else{
                while(!oddStack.isEmpty()){
                    TreeNode currentNode = oddStack.pop();
                    System.out.print(currentNode.data);
                    if(currentNode.left != null){
                        evenStack.push(currentNode.left);
                    }
                    if(currentNode.right != null){
                        evenStack.push(currentNode.right);
                    }

                }

            }

            isEvenStack = !isEvenStack;

        }


    }


    /*-- Pre Order Iterative--*/

    /*-- In Order Iterative--*/

    /*-- Post Order Iterative--*/

    /*-- Mirror a Tree --*/

    /*-- Copy a Tree --*/



    public static void main(String[] args){
        TreeNode root1 = new TreeNode();
        TreeNode root2 = new TreeNode();
        TreeNode root3 = new TreeNode();
        TreeNode root4 = new TreeNode();
        TreeNode root5 = new TreeNode();
        TreeNode root6 = new TreeNode();
        TreeNode root7 = new TreeNode();

        root1.data = 4;
        root2.data = 2;
        root3.data = 6;
        root4.data = 1;
        root5.data = 3;
        root6.data = 5;
        root7.data = 7;

        root1.left = root2;
        root1.right = root3;
        root2.left = root4;
        root2.right = root5;
        root3.left = root6;
        root3.right = root7;

        System.out.println("Pre Order Traversal Output");
        preOrder(root1);
        System.out.println();
        System.out.println("In Order Traversal Output");
        inOrder(root1);
        System.out.println();
        System.out.println("Post Order Traversal Output");
        postOrder(root1);
        System.out.println();
        System.out.println("Height of Tree");
        System.out.println(heightOfTree(root1));
        System.out.println("Level order Traversal of Tree Output");
        levelOrder(root1);
        System.out.println();
        System.out.println("LCA");
        TreeNode commonNode = lca(root1,3,7);
        System.out.println(commonNode.data);
        System.out.println("Spiral Level Order");
        spiralOrder(root1);
        System.out.println();
        System.out.println("Is a valid BST");
//        System.out.println(isValidBST(root1));
    }
}
