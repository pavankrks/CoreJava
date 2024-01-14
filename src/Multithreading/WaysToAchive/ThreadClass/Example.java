/*
    >>Implemented multithreading by exteending thread class
    >>Thread class implements runnable interface
    >>We overrided the run method present in runnable interface
    >>With the help of start() method, we run the threads
    >>We cant extend another class if we extend thread,
        due to multiple inheritance
    >>So, there is another option like implementing inteface
*/


package Multithreading.WaysToAchive.ThreadClass;
class Test1 extends Thread{

    public void run(){
        System.out.println("Test1 Thread class");

        for(int i = 0;i<6;i++){
            System.out.println("test 1 : "+i);
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Test2 extends Thread{

    public void run(){
        System.out.println("Test2 Thread class");
        for(int i = 0;i<6;i++){
            System.out.println("test 2 : "+i);
        }
    }
}

public class Example {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Test2 test2 = new Test2();

        test1.start();
        test2.start();

    }
}

//output:
/*      test 1 : 0
        test 2 : 0
        test 2 : 1
        test 2 : 2
        test 2 : 3
        test 2 : 4
        test 2 : 5
        test 1 : 1
        test 1 : 2
        test 1 : 3
        test 1 : 4
        test 1 : 5
*/

