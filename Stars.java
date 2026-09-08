import java.util.*;

public class Stars{
    public static void main(String args[]){
        // Arrays example
        int [] nums = {5, 3, 8, 1};
        Arrays.sort(nums);
        System.out.println("Sorted arrays : " + Arrays.toString(nums));

        // List Example

        List<Integer> list = new ArrayList<>(Arrays.asList(5,3,8,1));
        Collections.sort(list);
        System.out.println("Sorted list :" + list);
    }
}