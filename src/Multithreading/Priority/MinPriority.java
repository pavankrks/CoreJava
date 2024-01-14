package Multithreading.Priority;

public class MinPriority {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        t1.setName("Pavan");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
    }
}
