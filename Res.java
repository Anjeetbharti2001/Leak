public class Res{
    public static void main(String args[]){
        int arr[] = { 4, 5,6 , 6, 7};

        // update element 
        arr[3] = 7;
        arr[4] = 8;

        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}