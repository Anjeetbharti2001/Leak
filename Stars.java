public class Stars{
    public static void main(String args[]){
        int arr[] = {3,5, 5, 6, 59, 6};

        int key = 23;

        int index = -1;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println("Element found at index !" + index);
        }else{
            System.out.println("Element is not found:");
        }
    }
}