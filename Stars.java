public class Stars{
    public static void D(){
        float D = 40.5f;
        System.out.println("In method D ");
    }

    public static void C(){
        double C = 30.5;
        System.out.println("In method C ");
    }
    
     public static void B(){
        int B = 20;
        C();// Calling c 
        System.out.println("In Method B");

     }
     
     public static void A() {
        int A = 10;
        B(); // Calling B
        System.out.println("In Method A ");
     }

    public static void main(String args[]){
        A();// Stars with function A
        D();// Then call D
    }
}