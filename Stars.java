import java.io.*;

class Test{
    // static variable in Test class 
    static int var = 10;
}
public class Stars{
    public static void main(String args[]){
        System.out.println("Static variable : " + Test.var);
    }
}