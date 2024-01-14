package Multithreading.UserAndDaemon;

public class MyUser extends Thread {

    public void run() {
        for(int i = 1;i<=10;i++){
            System.out.println("Typing...!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
