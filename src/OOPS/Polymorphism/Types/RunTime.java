package OOPS.Polymorphism.Types;
class Mahindra{

    public void start(){

        System.out.println("car started");
    }

    public void speed(){
        System.out.println("Average speed 100kmph");
    }
    public void stop(){

        System.out.println("car stopped");
    }
}

class Thar extends Mahindra {

    public void speed(){
        System.out.println("Average speed 150kmph");
    }

    public void type(){

        System.out.println("Tourist Car");
    }
}
public class RunTime {

    public static void main(String[] args) {
        System.out.println("Method Overriding");

        Thar thar = new Thar();

        thar.start();//inherited
        thar.stop();//inherited
        thar.speed();//overridden
        thar.type();//specialized

/*output:
        Method Overriding
        car started
        car stopped
        Average speed 150kmph
        Tourist Car*/
    }
}
