package me.neu;

/**
 * Created by pramod on 10/25/2016.
 */
public class ValidBST {

    static boolean valid(Node root){
        return valid(root, Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY);
    }

    static boolean valid(Node root, double min, double max){
        if(root == null){
            return true;
        }

        if(root.data >= min || root.data <= max){
            return false;
        }

        return valid(root.left,min,root.data) && valid(root.right,root.data,max);
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
        System.out.println(valid(root1));




    }

}
