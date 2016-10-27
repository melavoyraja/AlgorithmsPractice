package me.neu;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by pramod on 10/20/2016.
 */
public class LeastCommonAncestor {


    static Stack<Node> path1;
    static Stack<Node> path2;
 //Node is defined as :

   // */

    public static Node lca(Node root,int v1,int v2)
    {
        returnPath(root,v1,path1);
        returnPath(root,v2,path2);
        Node commonNode = null;
        boolean check = path1.isEmpty();
        while(!(path1.isEmpty()) || !(path2.isEmpty())){
            if(path1.peek().data == path2.peek().data){
                commonNode = path1.peek();
            }

            path1.pop();
            path2.pop();
        }


        return commonNode;
    }

    public static boolean returnPath(Node root, int v1,Stack<Node> path1)
    {
        if(root == null){
            return false;
        }else if(root.data == v1 || returnPath(root.left,v1,path1) || returnPath(root.right,v1,path1)){
            path1.push(root);
            return true;
        }

        return false;

    }






    public static void main(String[] args){
        path1 = new Stack<>();
        path2 = new Stack<>();
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
        Node output = lca(root1,6,7);
        System.out.print(output.data);

    }
}
