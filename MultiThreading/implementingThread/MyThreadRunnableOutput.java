package MultiThreading.implementingThread;

public class MyThreadRunnableOutput {
    public static void main(String[] args) {
        MyThreadRunnable1 t1=new MyThreadRunnable1();
        MyThreadRunnable2 t2=new MyThreadRunnable2();
        Thread obj=new Thread(t1);
        Thread obj2=new Thread(t2);
        obj.start();
        obj2.start();

    }
}
