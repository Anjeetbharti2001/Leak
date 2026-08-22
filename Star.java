public class Star{
    static void print_squaredi(int k){
        int a, b;
        for(a = 1; a <= k; a++){
            for(b = 1; b <= k; b++){
                if(a == 1 || a == k || b == 1 || b == k)
                    System.out.print("*");
                else
                    System.out.print(" ");
                
               
            }
              System.out.println();
        }
    }
    public static void main(String args[]){
        int rows = 12;

        print_squaredi(rows);

    }
}