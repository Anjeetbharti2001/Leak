public class Star{
    static int sumArray(int[] arr, int n){
        if(n == 0)
            return arr[0];

        return arr[n] + sumArray(arr, n - 1);
    }
    public static void main(String args[]){
        int [] arr = {1, 2, 3, 4, 5};
        int sum = sumArray(arr, arr.length - 1);

        System.out.println("Sum of the elements int the arrays:-" + sum);

    }
}