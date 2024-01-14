package OOPS.Polymorphism.Coupling;

class Mahindra {

    public void start() {

        System.out.println("car started");
    }

    public void speed() {
        System.out.println("Average speed 100kmph");
    }

    public void stop() {

        System.out.println("car stopped");
    }
}

class Thar extends Mahindra {

    public void speed() {
        System.out.println("Average speed 150kmph");
    }

    public void type() {

        System.out.println("Tourist Car");
    }
}

public class LooseAndTight {

    public static void main(String[] args) {


        System.out.println("Loose Coupling:");

        //parent type refernce
        Mahindra mahi = new Thar();

        mahi.start();//inherited
        mahi.stop();//inherited
        mahi.speed();//overridden
        ((Thar) mahi).type();//specialized && downcasting
        System.out.println();
        System.out.println("Tight Coupling:");

        //parent type refernce
        Thar thar = new Thar();

        thar.start();//inherited
        thar.stop();//inherited
        thar.speed();//overridden
        thar.type();//specialized

    }
}
