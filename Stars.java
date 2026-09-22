public class Stars{
    public static void main(String args[]){
        int arr[] = {3, 1, 2, 5, 4};

        // passing arrays to method m1
        sum(arr);
    }
    public static void sum(int[]arr){
        // getting sum of arrays values
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

            System.out.println("Sum of arrays values : " + sum );
        }
    }
}