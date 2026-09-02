public class Stars{
    public static void main(String args[]){
        int [] arr = {5,7,83,2,4,5,6};
    
        int key = 2;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.print(i + " ");
            }
        }
    }
}