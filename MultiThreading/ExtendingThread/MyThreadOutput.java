package MultiThreading.ExtendingThread;

public class MyThreadOutput {
    public static void main(String[] args) {
        MyThread obj=new MyThread();
        MyThread2 obj2=new MyThread2();
        obj.start();
        obj2.start();
    }
}
