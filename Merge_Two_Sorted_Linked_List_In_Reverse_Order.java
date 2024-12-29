public class Merge_Two_Sorted_Linked_List_In_Reverse_Order {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node mergeTwoLists(Node list1, Node list2){
        if(list1 == null){
            return list2;
        }

        if(list2 == null){
            return list1;
        }

        Node result;

        if(list1.data < list2.data){
            result = list1;
            result.next = mergeTwoLists(list1.next, list2);
        } else {
            result = list2;
            result.next = mergeTwoLists(list1, list2.next);
        }

        return result;
    }

    public static Node reverseList(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node last = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return last;
    }

    public static Node mergeresultLists(Node list1, Node list2){
        Node result = mergeTwoLists(list1, list2);
        result = reverseList(result);
        return result;
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(4);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        Node result = mergeresultLists(list1, list2);

        System.out.println("Merged Lists in Reverse Order are: ");
        printList(result);
    }
}