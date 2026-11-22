public class Res{
    public static void main(String args[]){
        int arr[] = { 4, 6, 7, 9, 20};

        arr[2] = 8;
        
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}