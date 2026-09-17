public class Stars{
    private int balance = 100;

    // Accessor method(getter)
    public int getBalance(){
        return balance;
    }
    public static void main(String args[]){
       Stars acc = new Stars();
       System.out.println(
        "balance : " + acc.getBalance());
    }
}