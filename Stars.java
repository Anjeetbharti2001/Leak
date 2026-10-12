public class Stars{
    // data members of the class 
    String name;
    int id;

    // Parameterized Constructors
    Stars(String name, int id){
        this.name = name;
        this.id = id;
    }

    // method to display object data
    void display(){
        System.out.println("StarsName : " + name + " and StarsId : " + id);
    }
    // Main()method - placed inside the same class for 

    public static void main(String args[]){
        // This will invoke the parameterized constructors
        Stars star1 = new Stars("Anjeet", 25);
        star1.display();
    }
}