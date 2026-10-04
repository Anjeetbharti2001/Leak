import java.util.Arrays;

public class Stars{
  
    public static void main(String[] args) 
    {
        // Initialize two float array with element
        float[] arr1={5.12f, 8.3f, 9.17f, 2.5f, 8.8f, 5.17f, 4.2f, 7.37f};
        float[] arr2={7.12f, 9.3f, 6.17f, 7.5f, 5.8f, 7.17f, 3.2f, 6.37f};
      
        // compare two float array using compare method and finally print result
        System.out.println("" + Arrays.compare(arr1, arr2));
    }
}