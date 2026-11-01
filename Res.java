public class Res{
  public static void main(String args[]){
      int arr[] = { 3, 5, 6, 7, 3,9};
      int min = arr[0];
      for( int i = 0; i<arr.length; i++){
        if(arr[i] < min){
          min = arr[i];
        }
      }
      System.out.print("Total count number:-" + min);
  }
}