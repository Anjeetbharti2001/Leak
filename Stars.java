public class Stars{
    public static void main(String args[]){
        int arr[] = {4, 8, 9, 2,6,3};

        // Updating first element 
        arr[0] = 90;
        System.out.println(arr[0]);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}