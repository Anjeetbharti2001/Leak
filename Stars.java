import java.util.*;

class ABC{
    public int sum(int x, int y){
        return x + y;
    }
    public double sum(double x , double y){
        return x + y;
    }
}

public class Stars{
    public static void main(String args[]){
        ABC temp = new ABC();

        System.out.println(temp.sum(1, 2));
        System.out.println(temp.sum(3.14, 4.23));
    }
}