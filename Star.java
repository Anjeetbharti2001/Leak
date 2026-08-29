public class Star{
    public static void main(String args[]){
        int [] arr = {5,2,8,1};

        for(int i = 0; i<arr.length-1; i++){
            int minIndex = i;

            for(int j = i; j<arr.length; j++){
                if(arr[i] <arr[minIndex]);
                minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}