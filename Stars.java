class Person{
    Person(){
        System.out.println("Person class Constructor");
    }
}

class Student extends Person{
    Student(){
        super();

        System.out.println("Stident class Constructor");
    }
}
public class Stars{
    public static void main(String args[]){
        Student s = new Student();
    }
}