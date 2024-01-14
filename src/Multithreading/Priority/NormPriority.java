package Multithreading.Priority;

public class NormPriority {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        t1.setName("Pavan");
        t1.setPriority(Thread.NORM_PRIORITY);
        t1.start();
    }
}
