package me.neu.LinkedList;

/**
 * Created by pramod on 10/27/2016.
 */
public class LinkedListTraversals {

    /* -- Merge two sorted Linked Lists --*/
    static Node merge(Node node1, Node node2){
        Node newNode = new Node();

        Node firstNode = node1;
        Node secondNode = node2;

        if(node1 == null){
            return node2;
        }else if(node2 == null){
            return node1;
        }

        if(firstNode.data <= secondNode.data){
            newNode = firstNode;
            firstNode = firstNode.next;
        }else{
            newNode = secondNode;
            secondNode = secondNode.next;
        }

        Node tail = newNode;


        while(firstNode !=null & secondNode != null){
            if(firstNode.data <= secondNode.data){
                tail.next = firstNode;
                firstNode =firstNode.next;
            }else{
                tail.next = secondNode;
                secondNode = secondNode.next;
            }

            tail = tail.next;
        }

        if(firstNode == null){
            tail.next = secondNode;
        }else if(secondNode == null){
            tail.next = firstNode;
        }


        return newNode;
    }

    /*-- Intersction in Two Linked Lists --*/


    public static void main(String[] args){
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();
        Node n6 = new Node();

        n1.data = 3;
        n2.data = 7;
        n3.data = 9;
        n4.data = 11;
        n5.data = 17;
        n6.data = 19;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        Node a1 = new Node();
        Node a2 = new Node();
        Node a3 = new Node();
        Node a4 = new Node();
        Node a5 = new Node();
        Node a6 = new Node();
        Node a7 = new Node();

        a1.data = 1;
        a2.data = 2;
        a3.data = 3;
        a4.data = 4;
        a5.data = 5;
        a6.data = 6;
        a7.data = 7;

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;

        Node merged = merge(a1,n1);
        System.out.print(merged.data);
    }


}
