public class Basics {
    static class Node {
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    private static void printNode(Node root){
        if(root == null) return;
        System.out.println(root.val);
        printNode(root.left);
        printNode(root.right);
    }

    private static int size(Node root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    private static int maxNode(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(maxNode(root.left), maxNode(root.right)));
    }

    private static int minNode(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(minNode(root.left), minNode(root.right)));
    }

    private static int sumOfAllNodes(Node root){
        if(root == null) return 0;
        return root.val + sumOfAllNodes(root.left) + sumOfAllNodes(root.right);
    }

    private static int productOfAllNodes(Node root){
        if(root == null) return 1;
        if(root.val == 0) return 1;
        return root.val * productOfAllNodes(root.left) * productOfAllNodes(root.right);
    }

    private static int levelsOfTree(Node root){
        if(root == null) return 0;
        return 1 + Math.max(levelsOfTree(root.left), levelsOfTree(root.right));
    }

    private static int heightOfTree(Node root){
        if(root == null) return 0;
        int length = 1 + Math.max(levelsOfTree(root.left), levelsOfTree(root.right));
        return length - 1;
    }

    public static void  main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
 
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        printNode(a);
        System.out.println(size(a));
        System.out.println(maxNode(a)); 
        System.out.println(minNode(a));
        System.out.println(sumOfAllNodes(a));
        System.out.println(productOfAllNodes(a));
        System.out.println(levelsOfTree(a));
        System.out.println(heightOfTree(a));
    }
}