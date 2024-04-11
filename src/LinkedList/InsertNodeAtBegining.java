package LinkedList;

public class InsertNodeAtBegining {
    public static void main(String[] args){
        ListNode head = null; // head of the LinkedList
        head = InsertNode(40, head);
        head = InsertNode(30, head);
        head = InsertNode(20, head);
        head = InsertNode(10, head);
        System.out.println("LinkedList before inserting 0 at beginning : ");
        PrintList(head);
        head = InsertNode(0, head);
        System.out.println("LinkedList after inserting 0 at beginning : ");
        PrintList(head);
    }
    static ListNode InsertNode(int value, ListNode head) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
        return head;
    }
    static void PrintList(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.value + "-->");
            curr = curr.next;
        }
        System.out.print("null");
    }
}
class ListNode {
    int value;
    ListNode next;
    ListNode(int x) {
        value = x;
        next = null;
    }
}
