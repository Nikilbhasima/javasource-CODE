package MultiThreading.ExtendingThread;

public class MyThread2 extends Thread{
    public void run() {
        int i=0;
        while(i<4000){
            System.out.println("thread2 is chatting");
            i++;
        }
    }
}
