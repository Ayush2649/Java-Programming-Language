public class Add_Two_Numbers {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node addTwoNumbers(Node l1, Node l2){
        Node result = new Node(0);
        Node ptr = result;

        int carry = 0;

        while(l1 != null || l2 != null){
            int sum = 0 + carry;

            if(l1 != null){
                sum += l1.data;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum = sum % 10;
            ptr.next = new Node(sum);
            ptr = ptr.next;
        }

        if(carry == 1){
            ptr.next = new Node(1);
        }

        return result.next;
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
        Node l1 = new Node(3);
        l1.next = new Node(4);
        l1.next.next = new Node(2);

        Node l2 = new Node(4);
        l2.next = new Node(6);
        l2.next.next = new Node(5);

        System.out.print("First List : ");
        printList(l1);

        System.out.print("Second List : ");
        printList(l2);

        Node result = addTwoNumbers(l1, l2);

        System.out.print("Final List after Addition : ");
        printList(result);
    }
}