public class Stars{
    public static void main(String args[]){
        String Str = "Anjeet";
        char Target = 'j';

        boolean found = false;
        for(int i = 0; i<Str.length(); i++){
            if(Str.charAt(i) == Target){
                found = true;
                break;
            }
        }
        System.out.println(found);

    }
}