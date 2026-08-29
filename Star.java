// public class Star{
//     public static void main(String args[]){
//         int [] arr = {5,2,8,1};

//         int key = arr[i];

//         int j = i - 1;
//         while (j >= 0 && arr[j] > key){
//             arr[j + 1] = arr[i];
//             j--;
//         }
//         arr[j + 1] = key;
//     }
//     for(int num : arr){
//         System.out.println(num + " ");
//     }
// }

public class Star { 
    public static void main(String[] args) { 
        int[] arr = {5, 2, 8, 1}; 

        // Fixed: Added the outer loop to iterate through the array
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; 
            int j = i - 1; 

            // Shifts elements that are greater than the key
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; // Fixed: Changed '==' to '=' and 'arr[i]' to 'arr[j]'
                j--; 
            } 
            arr[j + 1] = key; 
        } 

        // Prints the sorted array
        for (int num : arr) { 
            System.out.print(num + " "); // Fixed: Changed println to print for a single line
        } 
    } 
}
