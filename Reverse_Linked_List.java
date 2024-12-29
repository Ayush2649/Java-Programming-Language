public class Reverse_Linked_List {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseList(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        
        Node last = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return last;
    }

    public static void printNode(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node result = reverseList(head);

        System.out.println("Reversed List is: ");
        printNode(result);
    }
}

