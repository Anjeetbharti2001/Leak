class MultithreadingDemo extends Thread{
    public void run(){
        try {
            // Display the thread that is running 
            System.out.println("Thread " + Thread.currentThread().getId() + " is runnig");
        }catch (Exception e ){
            // Throwing an Exception
            System.out.println("Exception is Caught");
        }
    }
}

public class Stars{
    public static void main(String args[]){
       int n = 8;
       for(int i = 0; i < n ; i++){
        MultithreadingDemo object = new MultithreadingDemo();
        object.start();
       }
    }
}