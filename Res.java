import java.util.*;
public class Res{
    public static void main(String args[]){
        HashMap<Integer, String > map = new HashMap<>();

        map.put(101, "Anjeet");
        map.put(102, "Rahul");
        map.put(103, "Amit");

        System.out.print(map);

        //Access value S
        System.out.println(map.get(101));
    }
}