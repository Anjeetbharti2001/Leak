public class Stars{
    public static int ctr = 0;
    public Stars(){ ctr++;}
    public static void main(String args[]){
        Stars obj1 = new Stars();
        Stars obj2 = new Stars();
        Stars obj3= new Stars();

        System.out.println("Number of objects created are " + Stars.ctr);
    }
}