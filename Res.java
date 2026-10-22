public class Res{
    public static void main(String args[]){
        int arr[] = { 2, 7, 9, 4 ,5 , 6};
       
        arr[2] = 1;
        
        for(int i = 0; i < arr.length; i++){
            System.out.print( arr[i] + " ");
        }
    }
}