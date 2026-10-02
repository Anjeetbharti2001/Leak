import java.io.*;
import java.util.Scanner;
public class Stars{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        // Number of Rows
        int n = s.nextInt();

        // Initialize a 2d Arrays
        int[][] arr= new int[n][];
        int t = 0;

        // Input for each row

        for(int i = 0; i < n ; i++){
            int m = s.nextInt();

            // Assuming all rows have the same column count
            t = m;
            arr[i] = new int[m];

            for(int j = 0; i < m; j++){
                arr[i][j] = s.nextInt();
            }
        }
        int odd = 0, even = 0;
        
        System.out.println("Rows " + n + " with " + t + " Columns");
        System.out.println("Element of Arrays : ");

        // Print the entire array and count even / odd numbers
        for(int i = 0; i< n ; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j] + " ");

                // Count even and odd numbers
                if(arr[i][j] % 2 == 2){
                    even++;
                } else{
                    odd++;
                }
                
            }
            System.out.println();
        }
        System.out.println("Even : " + even + ", odd : " + odd);
        s.close();
    }
}