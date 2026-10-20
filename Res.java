// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// public class Res {
//     public static void main(String args[]) {

//         Node first = new Node(1);
//         Node second = new Node(2);
//         Node third = new Node(3);

//         first.next = second;
//         second.next = third;
//         third.next = null;

//         Node temp = first;

//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//     }
// }

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
   Node first = new Node(1);
   Node second = new Node(2);
   Node third = new Node (3);
Node fourth = new Node(4);
   Node fifth = new Node(5);
   Node sixth = new Node (6);
   

   first.next = second;
   second.next = third;
   third.next = fourth;
   fourth.next = fifth;
   fifth.next = sixth;
   sixth.next = null;
   
   Node temp = first;

   while (temp != null){
    System.out.print(temp.data + " ");
    temp = temp.next;
   }
  }
}