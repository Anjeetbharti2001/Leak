public class Res{
    public static void main(String args[]){
        int arr[] = { 4, 8, 9, 7};

        arr[1] = 5;

        int i = 0;

        while( i <arr.length){
            System.out.println("Element at index: " + arr[i]);
            i++;
        }
    }
}