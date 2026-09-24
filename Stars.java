public class Stars{
     public static int[] a1(){
        return new int [] { 1, 5, 9};
    }

    public static void main(String args[]){

        int arr[] = a1();

        for(int i = 0; i< arr.length; i++)
            System.out.println(arr[i] + " ");
       
    }
   
}