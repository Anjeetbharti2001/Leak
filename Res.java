public class Res{
    public static void main(String args[]){
        String [] fruits = { "APPLE", "BANANA", "CHERRY", "DATE"};

        int index = 0;

        while(index < fruits.length){
            System.out.println("Fruit at index " + index + " : " + fruits[index]);
            index++;
        }
    }
}