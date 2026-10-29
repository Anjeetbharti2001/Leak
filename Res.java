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
         Node first = new Node(6);
         Node second = new Node(7);
         Node third = new Node(8);
         Node fourth = new Node(9);
         Node fifth = new Node(10);

         first.next = second;
         second.next = third;
         third.next = fourth;
         fourth.next = fifth;

         // all print Linked List
         Node temp = first;

         while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
         }
         System.out.println("null");
    }
}