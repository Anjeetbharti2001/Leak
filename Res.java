class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        Node left, right = null;
    }
}
public class Res{
    public static void main(String args[]){
        Node root = new Node(90);
        root.left = new Node(91);
        root.right = new Node(92);

        printLeft(root);

    }
    static void printLeft(Node root){
        if( root == null){
            return;
        }
        if(root.left == null && root.right == null);
        System.out.print(root.data + " ");

        printLeft(root.left);
        printLeft(root.right);
    }
}