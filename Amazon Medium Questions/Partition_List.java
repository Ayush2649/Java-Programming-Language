public class Partition_List { // O(n)
    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node partition(Node head, int x){
        Node before_head = new Node(0);
        Node before = before_head;
        Node after_head = new Node(0);
        Node after = after_head;

        while(head != null){
            if(head.data < x){
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        
        after.next = null;
        before.next = after_head.next;
        return before_head.next;
    }
    

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);

        // 1 -> 4 -> 3 -> 2 -> 5 -> 2 -> null

        System.out.println("Original List:");
        printList(head);

        int x = 3;
        head = partition(head, x);

        System.out.println("Partitioned List:");
        printList(head);
    }
}
