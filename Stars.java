public class Stars{

    static int x = 11;
    private int y = 23;

    public void testFunc(int x){
        Stars t = new Stars();
        this.x = 22;

        y = 44;

        System.out.println("Stars.x : " + Stars.x);
        System.out.println("T.x" + t.x);
        System.out.println("t.x " + t.x);
        System.out.println("t.y" + y);
    }
    public static void main(String args[]){
       Stars t = new Stars();
       t.testFunc(5);
    }
}