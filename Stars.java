import java.util.*;
public class Stars{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // taking number f rows and colunm from user
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();

        System.out.println("Enter number of columns:");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter element of arrays :");
        for(int i = 0; i< row; i++){
            for(int j = 0; j < col ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
     System.out.println("Element of arrays are : ");
     // printing Element of arrays
     for(int i < 0 i< col; i++){
        for(int j = 0; i< row; i++){
            System.out.println(arr[i][j] + " ");
        }
        System.out.println();
     }
     sc.close();
    }
}