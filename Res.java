// Create a linked List 
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Res{
    static Node head;

    //Insert a Beginning
    static void insertAtBeginning(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

        }
        //print linkedList
        static void printList(){
            Node temp = head;

            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    public static void main(String args[]){
        insertAtBeginning(30);
        insertAtBeginning(20);
        insertAtBeginning(10);

        printList();
       printList();
    }
}