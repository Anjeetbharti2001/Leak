import java.util.*;

public class Res{
    public static void main(String args[]){
        String[] arr = { "Anjeet" , "Bharti", "Sohan", "Sarjun", "Amit" };

        // sorting the String arrays
        Arrays.sort(arr);

        for(String i : arr){
            System.out.print( i + " ");
        }
    }
}