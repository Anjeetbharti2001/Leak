class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Res{
    public static void main(String args[]){
        Node first = new Node(4);
        Node second = new Node(5);
        Node third = new Node(6);

        first.next = second;
        second.next = third;

        //all element is print
        Node temp = first;

        while(temp != null){
            System.out.print(temp.data + " ");
             temp = temp.next;
        }
        System.out.print("null");
    }
}