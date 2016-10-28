package me.neu;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by pramod on 10/25/2016.
 */
public class MirrorBinaryTree {

    static void inOrder(Node root){
        if(root == null){
            return;
        }else{
            inOrder(root.left);
            System.out.print(root.data);
            inOrder(root.right);
        }
    }

    static void mirror(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node n = q.poll();
            Node temp = n.left;
            n.left = n.right;
            n.right = temp;
            if(n.right != null){
                q.add(n.right);
            }
            if(n.left != null){
                q.add(n.left);
            }
        }
    }

    static int depth(Node root){
        if(root == null){
            return 0;
        }else{
            return Math.max(depth(root.left),depth(root.left))+1;
        }
    }

    public static void main(String[] args){
        Node root1 = new Node();
        root1.data = 1;
        Node root2 = new Node();
        root2.data = 2;
        Node root3 = new Node();
        root3.data = 3;
        Node root4 = new Node();
        root4.data = 4;
        Node root5 = new Node();
        root5.data = 5;
        Node root6 = new Node();
        root6.data = 6;
        Node root7 = new Node();
        root7.data = 7;
        root1.left = root2;
        root1.right = root3;
        root2.left = root4;
        root2.right = root5;
        root3.left = root6;
        root3.right = root7;
        inOrder(root1);
        System.out.println("");
        mirror(root1);
        inOrder(root1);

    }

}
