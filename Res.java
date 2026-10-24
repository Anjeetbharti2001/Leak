// Java program to perform the searching 
// operation on a string arrays
public class Res{
    public static void main(String args[]){
       //Initialize a String array with some elements

       String[] arr = { "Apple", "Banana", "Orange" };

       // Key to search in the arrays
       String k = "Banana";

       // Flag to track if the key is found 
       boolean f = false;

       // Iterate over the array to search for the key
       for(int i = 0; i < arr.length; i++){
        //check if the current element matches the key
        if(arr[i] == k){
            //If found, print the index and set the flag to true
            System.out.println("Available at index " + i);
            f = true;
        }
       }
       // If the key is not found, print "Not found"
       if( f == false){
        System.out.println("Not found");
       }
    }
}