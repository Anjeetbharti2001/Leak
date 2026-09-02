public class Stars{
    public static void main(String args[]){
        int [] arr = {5,7,83,2,4,5,6};
        
        int min = arr[0];

        for(int num : arr){
            if(num < min){
                min = num;
            }
        }
        System.out.println( "minimum element:-" + min);
    }
}