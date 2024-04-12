package LinkedList;

import static LinkedList.InsertNodeAtBegining.InsertNode;
import static LinkedList.InsertNodeAtBegining.PrintList;

public class DelInDoubleList {
    public static void main(String[] args){
        ListNode head = null; // head of the LinkedList
        head = InsertNode(40, head);
        head = InsertNode(30, head);
        head = InsertNode(20, head);
        head = InsertNode(10, head);
        System.out.println("LinkedList before deleting at tail : ");
        PrintList(head);
        head = delAtTail(head);
        System.out.println("LinkedList after deleting at tail : ");
        PrintList(head);
    }
    static ListNode delAtTail(ListNode head){
        if(head == null || head.next == null){
            return null;
        }
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        ListNode newTail = tail.back;
        newTail.next = null;
        tail.back = null;
        return head;
    }
}
