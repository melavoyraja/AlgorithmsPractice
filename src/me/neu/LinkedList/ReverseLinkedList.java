package me.neu.LinkedList;

/**
 * Created by pramod on 10/22/2016.
 */
public class ReverseLinkedList {

    static Node reverseLinedList(Node head){
        Node previous = null;
        Node current = head;
        Node next = head.next;
        while(next != null){
            current.next = previous;
            previous = current;
            current = next;
            next = current.next;
        }

        return previous;
    }

    public static void main(String[] args){
        Node node = new Node();
        node.data = 1;
        Node node1 = new Node();
        node1.data = 2;
        Node node2 = new Node();
        node2.data = 3;
        Node node3 = new Node();
        node3.data = 4;
        Node node4 = new Node();
        node4.data = 5;
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        Node output = reverseLinedList(node);
        System.out.println(output);
    }
}
