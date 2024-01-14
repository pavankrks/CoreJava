/*

Abstract classes are helpful when the subclasses have their own functionality
Because,they need only the implementation,not the functionality of parrent


note: >>if we have method with no body we have to declare it as abstract
      >>Even one method is abstract we can declare class as abstract
      >>We cannot create objects of abstract classes


 */




package OOPS.Abstraction.AbstractClass;

abstract class Mahindra{

    public void start(){
        System.out.println("Car started");
    }

    public void stop(){
        System.out.println("Car stopped");
    }

    public abstract void move();

}

class Thar extends Mahindra{

    public void move(){
        System.out.println("Car is moving at high Speed");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Thar thar = new Thar();
        thar.start();//inherited
        thar.move();//overriden
        thar.stop();//inherited
    }
}
