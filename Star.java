import java.util.*;
public class Star{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Arrays:- ");

        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter arrys elements:-");

        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Arrays elements :-");

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}