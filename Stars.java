public class Stars{
    public static void main(String args[]){
        // creating object 
        Stars obj = new Stars();

        // calling instance method by passing value
        obj.add(2,3);
        System.out.println("Stars!");
    }
    // Instance method with parameter
    void add(int a, int b){
        // local variables
        int x = a;
        int y = b;
        int z = x + y;

        System.out.println("Sum : " + z);
    }
}