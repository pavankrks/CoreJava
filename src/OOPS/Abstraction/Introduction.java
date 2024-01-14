/*
        Abstraction is something that we implement it to provide
        the functionality and hiding the implementation details to the user,

        this is achieved with the help of abstract class and interface

        here the abstract keyword is an non-access specifier which is used to
        declare classes and methods as abstract

        abstract methods dont have body,if there is one abstract method
        the we have to declare class as abstract,One impporttant thing,these abstract
        classes cannot be suited  for object creation
*/

package OOPS.Abstraction;


abstract class Plane {

  int leng = 10;
    public void takeOff() {
        System.out.println("Plane is taking off");
    }

    public abstract void fly();

    public void landing() {
        System.out.println("Plane is landing");
    }
}

class FighterPlane extends Plane {

    public void fly() {
        System.out.println("Plane is flying at greater high");
    }

    public void carrying(){
        System.out.println("Plane is carrying Weapons");
    }
}

public class Introduction {

    public static void main(String[] args) {

        FighterPlane fp = new FighterPlane();
        fp.takeOff();//inherited
        fp.fly();//overriden
        fp.landing();//inherited
        fp.carrying();//specialized
    }

}
