class Node{
    int data;
    Node next;
    Node( int data){
        this.data = data;
        this.next = null;
    }
}

public class Res{
    public static void main(String args[]){
         
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);
        Node fourth = new Node(5);

        first.next = second;
        second.next = third;
        third.next = fourth;

        // print all element in linked list 
        Node temp = first ;

        while( temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}