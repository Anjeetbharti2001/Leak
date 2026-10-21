public class Res{
  public static void main(String args[]){
    String arr[] = {"Pawan", "Sohan", "Sarjun","Santan"};

     arr[3] = "Anjeet";

    for(int i = 0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }
}