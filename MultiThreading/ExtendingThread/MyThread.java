package MultiThreading.ExtendingThread;

public class MyThread extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<4000){
            System.out.println("thread1 is cooking");
            i++;
        }
    }
}
