public class Star{

    int a ;
    int b;

    // Prameterized constructor
    Star(int a, int b){
        this.a = a;
        this.b = b;
    }
    void display(){
        // Displaying value of variables a and b
        System.out.println("a = " + a + " b = " + b);
    }
    public static void main(String args[]){
        Star object = new Star(10, 20);
        object.display();
    }
}