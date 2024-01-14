
//this is used in local chaining
//super is used in inherited chaining
// super and this methods must be used first in the method body
//only you want to chain the program

package OOPS.Constructor;


class Meters{

    int lengthInMeters;
    public Meters(int lengthInMeters){
        this.lengthInMeters = lengthInMeters;
    }
}

class Centimeters extends Meters{

    int lengthInCM;

    public Centimeters(int lengthInCM){
        this();
    }

    public Centimeters(){
        super(10);
        lengthInCM = 1000;
    }

    public void displayLengths(){

        System.out.println(lengthInCM+" cm = "+lengthInMeters+" meters");
    }

}
public class Chaining {

    public static void main(String[] args) {
        Centimeters centi = new Centimeters(100);
        //this method is used for chaining
        //super method is used for chaining
        centi.displayLengths();
    }
}
