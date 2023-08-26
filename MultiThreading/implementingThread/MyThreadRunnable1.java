package MultiThreading.implementingThread;

public class MyThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while (i<4000){
            System.out.println("i am thread 1,not thread 2");
            i++;
        }
    }
}
