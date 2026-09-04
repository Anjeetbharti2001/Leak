 public class Stars{
    public static int removeDuplicates(int [] arr){
        int i = 0;

        for(int j = 0; j<arr.length; j++){
            if(arr[i] != arr[j]){
                j++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
    public static void main(String args[]){
        int [] arr = {1,1,2,2,3,4,4};

        System.out.println(removeDuplicates(arr));
    }
 }