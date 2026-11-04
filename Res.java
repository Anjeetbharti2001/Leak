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
        Node first = new Node(7);
        Node second = new Node(8);
        Node third = new Node(9);

        first.next = second;
        second.next = third;

        // print linmkedlist element 

        Node temp = first;

        while( temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("Null");
    }
}