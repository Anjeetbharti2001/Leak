public class Stars{
    String name ;

    // Constructor
    Stars(String name){
        this.name = name ;
    }
    void display(){
        System.out.println("Name : " + name);
    }
    public static void main(String args[]){
        Stars s1 = new Stars("Anjeet");
        s1.display();
    }
}