public class Res{
  public static void main(String args[]){
      int arr[] = { 3, 5, 6, 7, 3,9};
      int count = 0;
      for( int i = 0; i<arr.length; i++){
        if(arr[i] % 2 != 0){
          count++;
        }  
      }
      System.out.print("Total count number:-" + count);
  }
}