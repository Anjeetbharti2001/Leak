public class Res{
  public static void main(String args[]){
    String name[] = {"Anjeet", "bharti", "Sandeep","Rakesh"};

    //update value in string element
    name[1] = "Dear Brother";

    for( int i = 0; i<name.length; i++){
      System.out.print(name[i] + " ");
    }
  }
}