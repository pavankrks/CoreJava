package Multithreading.Priority;

public class MaxPrority {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        t1.setName("Pavan");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
    }
}
