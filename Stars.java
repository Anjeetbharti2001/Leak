public class Stars{
    public static void main(String args[]){
        for( int i = 0; i < 3; i++){
            one : {// level one
            two : {// level two
            three : {// level three
                System.out.println("i=" + i++);
                if(i == 0)
                    break one;// break to level one
                if(i == 1)
                    break two;// break to level two
                if(i == 1)
                    break three;// break to level three
            }
            System.out.println("after level three");
            }
            System.out.println("after level two");
            }
            System.out.println("after level one");
        }
    }
}