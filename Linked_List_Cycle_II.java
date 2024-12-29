import java.util.*;
public class Linked_List_Cycle_II {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node detectCycle(Node head){
        Set<Node> set = new HashSet<>();
        while(head != null && set.add(head)){
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args){
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        // Link nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Introduce a cycle: fourth node points back to second node
        fourth.next = second;

        // Detect cycle
        Node cycleNode = detectCycle(head);

        if (cycleNode != null) {
            System.out.println("Cycle detected at node with data: " + cycleNode.data);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
