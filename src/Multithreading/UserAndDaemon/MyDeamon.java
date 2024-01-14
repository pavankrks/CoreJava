package Multithreading.UserAndDaemon;

public class MyDeamon extends Thread {

    public void run() {

        for (;;) {
            System.out.println("Saving...!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
