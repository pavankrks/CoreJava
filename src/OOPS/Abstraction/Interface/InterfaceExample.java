/*

>> Interface is feature which is helpful to achive abstraction
>> Interface is like a contract, where we need to give the functionality
    the all the implementations of interface methods in order to provide the
    standardization
>> If you are implementing interface make sure to implement all or else
    if you cant implement all, make sure to declare class as abstract

>>By default the members of interface are public abstract
>>If you want to provide functionality in interface you need to make the method
 static




 */


package OOPS.Abstraction.Interface;

interface Mahindra {

    void move();

    public static void seats() {
        System.out.println("Car has four seats");
    }

    void mileage();

    void type();
}

class Thar implements Mahindra {

    public void start() {

        System.out.println("Car Started");

    }

    public void stop() {
        System.out.println("Car Stopped");
    }

    public void move() {
        System.out.println("Car moving at 150kmph");
    }

    public void type() {

        System.out.println("Petrol Type Car");
    }

    public void mileage() {

        System.out.println("Car gives 15km per litre");
    }

}

public class InterfaceExample {

    public static void main(String[] args) {
        Thar thar = new Thar();
        thar.start();//specialized
        thar.move();//overriden
        thar.mileage();//overriden
        thar.type();//overriden
        thar.stop();//secialized
        System.out.println();
        System.out.println("Accessing Interface method");
        Mahindra.seats();
    }
}
