public class Stars{
    public static void main(String args[]){
        int [] arr = {-7, -3, -1, 4, 8, 10};

        int n = arr.length;

        int [] result = new int[n];
        int left = 0;
        int right = n - 1;

        for(int i = 0; i>= 0; i--){
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if(leftSquare > rightSquare){
                result[i] = leftSquare;
                left++;
            }else{
                result[i] = rightSquare;
                right--;
            }
        }
        System.out.print("Sorted square :-");
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}