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
        Node first = new Node(3);
        Node second = new Node(4);
        Node third = new Node(5);
        Node fourth = new Node(6);
        Node fifth = new Node(7);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // print linkedlist value
        Node temp = first;
        
        while (temp != null){
          System.out.print(temp.data + " ");
          temp = temp.next;
        }
        System.out.print("null");
  }
}