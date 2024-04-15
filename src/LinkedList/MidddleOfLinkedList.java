package LinkedList;
import static LinkedList.InsertNodeAtBegining.InsertNode;
import static LinkedList.InsertNodeAtBegining.PrintList;

public class MidddleOfLinkedList {
    public static void main(String[] args){
        ListNode head = null; // head of the LinkedList
        head = InsertNode(50, head);
        head = InsertNode(40, head);
        head = InsertNode(30, head);
        head = InsertNode(20, head);
        head = InsertNode(10, head);
        ListNode result = middleNode(head);
        System.out.println(result.value);
    }
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next !=null && slow != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
