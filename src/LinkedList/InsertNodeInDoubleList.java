package LinkedList;

import static LinkedList.InsertNodeAtBegining.InsertNode;
import static LinkedList.InsertNodeAtBegining.PrintList;

public class InsertNodeInDoubleList {
    public static void main(String[] args){
        ListNode head = null; // head of the LinkedList
        head = InsertNode(40, head);
        head = InsertNode(30, head);
        head = InsertNode(20, head);
        head = InsertNode(10, head);
        System.out.println("LinkedList before inserting at tail : ");
        PrintList(head);
        head = insertAtTail(head,50);
        System.out.println("LinkedList after inserting at tail : ");
        PrintList(head);
    }

    static ListNode insertAtTail(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            return newNode;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.back = current;
    return head;
    }
}

