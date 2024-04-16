package LinkedList;

import static LinkedList.InsertNodeAtBegining.InsertNode;
import static LinkedList.InsertNodeAtBegining.PrintList;

public class ReverseSingleList {
    public static void main(String[] args){
        ListNode head = null; // head of the LinkedList
        head = InsertNode(40, head);
        head = InsertNode(30, head);
        head = InsertNode(20, head);
        head = InsertNode(10, head);
        System.out.println("Original LinkedList: ");
        PrintList(head);
        head = reverse(head);
        System.out.println("Reversed LinkedList: ");
        PrintList(head);
    }
    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        return prev;
    }
}
