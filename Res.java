class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class Res{
    static int countNode(Node root) {
    if (root == null) {
        return 0;
    }

    return 1 + countNode(root.left) + countNode(root.right);
}
    public static void main(String args[]){
        Node root = new Node(15);
        root.left = new Node(16);
        root.right = new Node(17);

        root.left.left = new Node(18);
        root.left.right = new Node(19);

        root.right.left = new Node(20);
        root.right.right = new Node(21);

        // Counting npdes
        int total = countNode(root);

        System.out.println("Total Nodes: " + total);


    }
}