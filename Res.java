class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        Node left ,right = null;
    }
}
public class Res{
    public static void main(String args[]){
        
        Node root = new Node(5);
        root.left = new Node(6);
        root.right = new Node(7);

        System.out.print(root.data);
    }
}