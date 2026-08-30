public class Stars{

    int a ;
    int b;

    // Default constructor 
    Stars(){
        this(10, 20){
            System.out.println("Inside default constructor \n");
        }
    }

    // Prameterized constructor
    Stars(int a, int b){
        this.a = a;
        this.b = b;

        System.out.println("Inside parameterized constructor");
    }
    
    public static void main(String args[]){
        Stars object = new Stars();
    }
}