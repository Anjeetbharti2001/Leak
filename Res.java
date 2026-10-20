public class Res{
  static void reverse(String str){
    if(str.length() == 0){
      return;
    }
    // recursive call 
    reverse(str.substring(1));
    //print first character at last
    System.out.println(str.charAt(0));
  }
  public static void main(String args[]){
    String str = "Hello";
    reverse(str);
  }
}