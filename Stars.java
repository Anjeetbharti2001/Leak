public class Stars{
    public static void main(String args[]){
        // Rows and columns in arrays
        int n = 2;
        int m = 2;

        // Arrays declared and initialized
        int[][] arr = new int[n][m];

        int it = 1;

        // Assigning the values to arrays
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = it;
                it++;
            }
        }

        // printing the arrays
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

    }
}