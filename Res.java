import java.util.*;
public class Res{
    public static void main(String args[]){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "I am read.");
        map.put(102, "Yes, I can Do this work");
        map.put(103, "I believe my self");


        //Access maps
        System.out.println(map);

        System.out.println(map.get(101));


    }
}