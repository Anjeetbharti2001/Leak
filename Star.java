import java.util.Scanner;

public class Star{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arrays:-");

        int n = sc.nextInt();
        
        int [] arr = new int[n];

        System.out.print("Enter arrays element:- ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Total of arrays element:-");

        for(int i = 0; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}