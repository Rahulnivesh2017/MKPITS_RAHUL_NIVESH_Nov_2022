

// Performing single task to single thread (Thread class)

public class Test implements Runnable{

    public void run(){
        System.out.println("thread task");
    }
    public static void main(String[] args){
        Test t=new Test();
        Thread th=new Thread(t);
        th.start();
    }
}