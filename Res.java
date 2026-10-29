class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        Node left ,right = null;
    }
}
public class Res{

    static void printLeft(Node root){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null);
        System.out.print(root.data + " ");

        printLeft(root.left);
        printLeft(root.right);
    }
    public static void main(String args[]){
        
        Node root = new Node(5);
        root.left = new Node(6);
        root.right = new Node(7);

        printLeft(root);
    }
}