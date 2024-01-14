package OOPS.Polymorphism;


class Plane{

    public void takeOff(){
        System.out.println("Plane Took Off");
    }

    public void fly(){
        System.out.println("Plane is Flying");
    }

    public void landing(){
        System.out.println("Plane is Landing");
    }
}
class FighterPlane extends Plane{

    public void takeOff(){
        System.out.println("Plane Took Off");
    }

    public void fly(){
        System.out.println("Plane is Flying at Great High");
    }

    public void landing(){
        System.out.println("Plane is Landing");
    }

    public void carrying(){
        System.out.println("Plane is carrying Weapons");
    }
}
class PassengerPlane extends Plane{

    public void takeOff(){
        System.out.println("Plane Took Off");
    }

    public void fly(){
        System.out.println("Plane is Flying at Low high");
    }

    public void landing(){
        System.out.println("Plane is Landing");
    }

    public void carrying(){
        System.out.println("Plane is carrying People");
    }
}

class Airport{


    //actual method overloading
    public void permit(Plane ref){

        ref.takeOff();
        ref.fly();
        ref.landing();

    }
}
public class ALLinONE {

    public static void main(String[] args) {

        Plane fp = new FighterPlane();
        Plane pp = new PassengerPlane();

        Airport ref = new Airport();
        System.out.println("Fighter Plane :");
        ref.permit(fp);

        ((FighterPlane)fp).carrying();//downcasting

        System.out.println();

        System.out.println("Passenger Plane :");
        ref.permit(pp);
        ((PassengerPlane)pp).carrying();//downcasting
    }
}
