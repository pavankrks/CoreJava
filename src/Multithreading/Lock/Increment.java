package Multithreading.Lock;

public class Increment extends Thread{
    Count c;
    public Increment(Count c){
        this.c = c;
    }
    public void run(){

        for(int i = 1;i<=1000;i++){
            c.increment();
        }
    }
}
