import java.util.*;

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    SinglyLinkedListNode head;

    public void insertNode(int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            SinglyLinkedListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}

class LL {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();
        int llistCount = scanner.nextInt();
        scanner.nextLine(); // Consumes the newline character

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.nextLine();
            llist.insertNode(llistItem);
        }

        int data = scanner.nextInt();
        scanner.nextLine();

        int position = scanner.nextInt();
        scanner.nextLine();

        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);

        printSinglyLinkedList(llist_head, " ");
    }

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (position == 0 || llist == null) {
            newNode.next = llist;
            return newNode;
        }

        SinglyLinkedListNode current = llist;
        for (int i = 0; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        return llist;
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String separator) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
            if (node != null) {
                System.out.print(separator);
            }
        }
        System.out.println();
    }
}
