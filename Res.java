import java.util.*;
public class Res{
    public static void main(String args[]){
        final int[]  numbers = { 1, 2, 3, 4, 5};

        // Assigning new element into the arrays 
        numbers[0] = 10;
        System.out.println(
            "Array after modifying first element : "
         + Arrays.toString(numbers));
    }
}