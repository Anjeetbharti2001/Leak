public class Stars{
    public static int sum(int i, int j){
        return i + j;
    }

    // main method 
    public static void main(String args[]){
        int n = 3, m = 3;

        for(int i = 0; i < n ; i++){
            for(int j = 0; j < m; j++){
                System.out.println(sum(i, j) + " ");
            }
            System.out.println();
        }
    }
}