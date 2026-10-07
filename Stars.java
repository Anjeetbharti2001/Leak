import java.util.*;

public class Stars {

    // Main driver method
    public static void main(String[] argv) throws Exception
    {
        // Try block to check for exceptions
        try {

            // Creating Arrays of Integer type
            Integer a[] = new Integer[] { 10, 20, 30, 40 };

            // Getting the list view of Array
            List<Integer> l = Arrays.asList(a);

            // Printing all the elements inside list object
            System.out.println("" + l);
        }

        // Catch block to handle exceptions
        catch (NullPointerException e) {

            System.out.println("Exception thrown: " + e);
        }
    }
}