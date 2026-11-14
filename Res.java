import java.util.*;
public class Res{
    public static void main(String args[]){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "hi");
        map.put(102, "Anjeet");
        map.put(103, "kaise ho");

        System.out.println(map);

        System.out.println(map.get(101));
    }
}