package Multithreading.Lock;

public class Count extends Thread {

    int count = 1;
    synchronized public void increment(){
        count++;
    }
}
