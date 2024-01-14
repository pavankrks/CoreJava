package Multithreading.Lock;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Count c = new Count();
        Increment t1 = new Increment(c);
        Increment t2 = new Increment(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count : "+c.count);
    }
}
