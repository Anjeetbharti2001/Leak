abstract class StarsHelp{
    abstract void check(String name); // abstract method
}
public class Stars extends StarsHelp{
    @Override 
    void check(String name){
        System.out.println(name);
    }
    
    public static void main(String args[]){
        Stars obj = new Stars();//subclass object
        obj.check("StarsForStars");
    }
}