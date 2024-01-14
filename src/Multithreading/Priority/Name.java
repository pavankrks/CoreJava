package Multithreading.Priority;
public class Name {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        t1.setName("Pavan");

        t1.start();
    }
}
