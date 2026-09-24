
public class Stars {
    public static void main(String args[]) {

        int arr[][] = new int[2][];

        // Making the above arrays jagged
        arr[0] = new int[3];
        arr[1] = new int[2];

        int count = 0;

        // Fill the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }

        // Print the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
