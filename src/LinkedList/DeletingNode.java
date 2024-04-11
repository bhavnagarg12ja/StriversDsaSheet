package LinkedList;

public class DeletingNode {
    public static void main(String[]args){
        Node head = null;
        head = InsertNode(40, head);
        head = InsertNode(30, head);
        head = InsertNode(20, head);
        head = InsertNode(10, head);
        PrintList(head);
        head = DelNode(head);
        System.out.println("LinkedList after deleting node : ");
        PrintList(head);

    }
    static Node InsertNode(int data, Node head) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    static Node DelNode(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    static void PrintList(Node head){
        while(head!=null){
            System.out.print(head.data + "-->");
            head = head.next;
        }
        System.out.print("null");
    }
}
class Node{
    int data;
    Node next;
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
