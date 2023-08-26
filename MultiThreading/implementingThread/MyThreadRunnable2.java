package MultiThreading.implementingThread;

public class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while (i<4000){
            System.out.println("i am thread 2,not thread 1");
            i++;
        }
    }
}
