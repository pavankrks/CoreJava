package Multithreading.Priority;

public class MyThread extends Thread{

    public void run(){
        System.out.println("Thread Name: "+currentThread().getName());
        System.out.println("Thread Priority: "+currentThread().getPriority());
        System.out.println();
    }

}
