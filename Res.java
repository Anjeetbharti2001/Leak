// java program to demonstrate the 
// conversion of String arrays to String 

public class Res{
    public static void main(String args[]){
        // Initialize a String arrays with some elements

        String[] arr = { "She", "is", "a", "good", "girl"};

        // Create a StringBuilder to build the resulting string 
        StringBuilder sb = new StringBuilder();

        // Append the first element of the arrays to the StringBuilder

        sb.append(arr[0]);
        // Loop through the remaining elements in the array

        for(int i = 1; i < arr.length; i++){
            //Append the StringBuilder content into a String
          sb.append(" " + arr[i]);
           
        }
        String s = sb.toString();
         System.out.println(s);
    }
}