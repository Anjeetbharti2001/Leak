public class Stars{
    public static void main(String args[]){
        int [] arr = {4, 7,8,3, 6, 9};

        int key = 6;

        boolean found = false;

        for(int num : arr){
            if(num == key){
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}