public class Res{
    public static void main(String args[]){
        int[] marks = { 125, 132, 95, 116, 110};
        int max = findMax(marks);

        System.out.println(max);
    }

    static int findMax(int[] arr){
        int maximum = arr[0];

        for ( int value :arr){
            if(value > maximum){
                maximum = value;
            }
        }
        return maximum;
    }
}