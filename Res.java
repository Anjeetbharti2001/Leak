class Node {
    int data;
    Node next;
    Node ( int data){
        this.data = data;
        this.next = null;
    }
}

public class Res{
    public static void main( String args[]){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        Node temp = first;

        while (temp != null){
            System.out.print(temp.next + " ");
            temp = temp.next;
        }
    }
}