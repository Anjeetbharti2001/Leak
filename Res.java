class Person {
    // private variable 
    private String name;

    public void setName(String name){
        this.name = name; //accessible within class 
    }
    public String getName(){ return name; }
}
public class Res{
    public static void main(String args[]){
         Person p = new Person();
         p.setName("Alice");

         System.out.println(p.getName());
    }
}