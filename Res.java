public class Res{
  public static void main(String args[]){
    String name[] = {"Anjeet", "bharti", "Sandeep","Rakesh"};

    //update value in string element
    name[1] = "Dear Brother";

    // New arrays with + 1 size
    String []name1 = new String[name.length + 1];

    ///old element copy
    for( int i = 0; i<name.length; i++){
      name1[i] = name[i];
    }

    //Add new Value
    name1[name.length] = "Sarjun";
    
    // print
    for( int i = 0; i<name1.length; i++){
      System.out.print(name1[i] + " ");
    }
  }
}