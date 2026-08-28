import java.util.*;
import java.util.Collections;

public class Star{
    public static void main(String args[]){
        Integer [] arr = {5,7,8,0,12,4,5,7};
        
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}