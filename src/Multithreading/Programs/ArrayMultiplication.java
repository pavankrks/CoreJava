package Multithreading.Programs;

public class ArrayMultiplication extends Thread{

    int start;
    int end;

    int[] arr;
    public ArrayMultiplication(int[] arr,int start,int end){
        this.start = start;
        this.end = end;
        this.arr = arr;
    }

    public void run(){
        for(int i = start;i<=end;i++){
            arr[i] = i;
        }
    }
}
