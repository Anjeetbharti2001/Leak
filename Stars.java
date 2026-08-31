public class Stars{
    static int LinearSearch(int [] arr, int key){
        for(int i = 0; i<arr.length; i++){
            if(arr [i] == key){
                return i;
            }
        }
        return - 1;
    }
    public static void main(String args[]){
        int []arr = {5,10, 15,20, 25};

        int result = LinearSearch(arr, 20);
        if(result != -1){
            System.out.println("Found at index :- " + result);
        }else{
            System.out.println("Not found");
        }
    }
}