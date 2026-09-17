public class Stars{
    private int balance = 100;

    // Mutator method(setter)
    public void setBalance(int amount){
        balance += amount;
    }
    public int getBalance(){
        return balance;
    }
    public static void main(String args[]){
        Stars acc = new Stars();// Updating balance
        acc.setBalance(50);
        System.out.println(
            "Balance :" + acc.getBalance());
    }
}