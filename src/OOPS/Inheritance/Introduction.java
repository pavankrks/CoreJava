/*
* Inheritance is the process of acquring properties and behaiour of super
* class
* Inheritance help to achieve code reusability
* Code reduction
* Memory management
* Best Performance
* */

package OOPS.Inheritance;
class Plane{

    public void takeOff(){

        System.out.println("plane is taking off");
    }

    public void landing(){

        System.out.println("plane is landing");
    }
}

class PassengerPlane extends Plane{
    public void fly(){
        System.out.println("Flying at low high");
    }
}
public class Introduction {

    public static void main(String[] args) {

        PassengerPlane pp = new PassengerPlane();

        //inherited method
        pp.takeOff();//plane is taking off

        //overriden method
        pp.fly();//flying at low high

        //inherited method
        pp.landing();//plane is landing

    }
}
