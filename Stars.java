import java.util.Arrays;
import java.util.List;

public class Stars {
    public static void main(String[] args) {
        
        // Creating an array of Integer type
        Integer[] a = {1, 2, 3, 4, 5};

        // Getting the list view of the array
        List<Integer> l = Arrays.asList(a);
        
        // Printing the list
        System.out.println("" + l);
        
        // A change made in the array would also
        // reflect in the list    
        a[2] = 20;
        System.out.println("" + l.get(2));
    }
}