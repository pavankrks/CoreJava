package Multithreading.UserAndDaemon;

public class Test {
    public static void main(String[] args) {
        MyUser mu = new MyUser();
        MyDeamon md = new MyDeamon();
        md.setDaemon(true);//setting up daemon thread
        mu.start();//starting user thread
        md.start();//starting daemon thread
    }
}
