/*
    >>This helps to achieve the usage of both extending and implementing
    >>We need to create the thred object for different objects
    >>We have to pass the obj reference in the thread obj constructor
    >>Asusuall we can start the thread using the start method.

 */


package Multithreading.WaysToAchive.RunnableInterface;
class Test1 extends Thread{

    public void run(){
        for(int i = 0;i<6;i++){
            System.out.println("test 1");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Test2 extends Thread{

    public void run(){
        for(int i = 0;i<6;i++){
            System.out.println("test 2");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Example {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Test2 test2 = new Test2();

        System.out.println("Main Thread started");
        Thread t1 = new Thread(test1);
        Thread t2 = new Thread(test2);
        System.out.println("Main Thread ended");
        t2.start();
        t1.start();
    }
}
