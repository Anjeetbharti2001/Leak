public class Res{
    public static void main(String args[]){
        int arr[] = { 4, 5,6 , 6, 7};

        // update element 
        arr[3] = 7;
        arr[4] = 8;

        // delete element
        
        int index = 2;

        int[] newArr = new int[arr.length - 1];
        for( int i = 0;   i< arr.length; i++){
            if( i == index){
               continue;
            }
            newArr[i] = arr[i];
            i++;
        }

        for(int i = 0 ; i<newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
    }
}