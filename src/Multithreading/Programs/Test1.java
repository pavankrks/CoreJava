package Multithreading.Programs;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        ArrayMultiplication first = new ArrayMultiplication(arr,0,250000);
        ArrayMultiplication second = new ArrayMultiplication(arr,250001,500000);
        ArrayMultiplication third = new ArrayMultiplication(arr,500001,750000);
        ArrayMultiplication fourth = new ArrayMultiplication(arr,750001,1000000);

        first.start();
        second.start();
        third.start();
        fourth.start();
//
//        for(int i = 0;i<arr.length;i++){
//            arr[i] = i;
//        }
        for(int i:arr){
            System.out.println(i);
        }


    }
}
