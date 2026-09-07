interface Animal {
    void sound();
}
class Dog implements Animal {
    public void sound(){
        System.out.println("Anjeet");
    }
}
public class Stars{
    public static void main(String args[]){
        Animal dog =  new Dog();
        dog.sound();
    }
}