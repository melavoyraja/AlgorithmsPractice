package me.neu.LinkedList;

/**
 * Created by pramod on 10/23/2016.
 */
public class ReverseLinkedList_Recursive {

    static Node output;
    static Node curr;
    static Node reverseLinedList(Node head){
        Node output = null;
//        reverse(head);
//        return first;
        reverseN(head);
        return output;
    }

    static Node reverse(Node head){
        if(head != null){
            while(head.next!=null){
                reverse(head.next).next = head;
                head.next = null;

            }

            if(head.next==null) {
//                first = head;
                return head;
            }
        }

        return head;
    }

    static void reverseN(Node head){
        if(head.next == null){
            return;
        }else{
            reverseN(head.next);
            if(output == null) {
                output = head.next;
                output.next = head;
                curr = output.next;
                curr.next = null;
            }else{
                curr.next = head;
                head.next = null;
                curr = curr.next;
            }

            return;
        }



    }

    public static void main(String[] args){
        Node node = new Node();
        node.data = 1;
        Node node1 = new Node();
        node1.data = 2;
        Node node2 = new Node();
        node2.data = 3;
        Node node3 = new Node();
        node3.data = 7;
        Node node4 = new Node();
        node4.data = 8;
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        reverseLinedList(node);
//        System.out.println(output);
    }
}
