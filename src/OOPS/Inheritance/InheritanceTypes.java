//there are 5 types of inheritance

/*
* 1.Single - car-mahindra
* 2.Multilevel - car-mahindra - Thar
* 3.Hierarchial - car-Mahindra - Thar,Suv
* 4.cyclic - not possible
* 5.multile - not possible diamond shape problem
* */



package OOPS.Inheritance;


class Car{

    public void start(){
        System.out.println("Car start");
    }

    public void stop(){

        System.out.println("Car stop");
    }

    public void move(){
        System.out.println("Car move");
    }


}

class Mahindra extends Car{

    public void specs(){

        System.out.println("4 seats,good mileage,speed 100kmph");
    }

}

class Thar extends Mahindra{

    public void specs(){

        System.out.println("HighSpeed,150kmph,Good Comfort");
    }
    public void type(){
        System.out.println("Classic and vintage");
    }

}

class SUV extends Mahindra{

    public void specs(){

        System.out.println("Meduim speed,120kmph,best comfort");
    }
    public void type(){
        System.out.println("Spacious Car");
    }
}

public class InheritanceTypes {
    public static void main(String[] args) {

        System.out.println("Mahindra extends car");
        System.out.println("Single Inheritance");
        Mahindra mahi = new Mahindra();
        mahi.start();//inherited method
        mahi.move();//inherited method
        mahi.stop();//inherited method

        System.out.println();
        System.out.println("Thar extends mahindra");
        System.out.println("Multilevel & hierarichal Inheritance");
        Thar thar = new Thar();
        thar.start();//inherited method
        thar.move();//inherited method
        thar.stop();//inherited method
        thar.specs();//overriden method
        thar.type();//specialized method
        System.out.println();
        System.out.println("SUV extends mahindra");
        System.out.println("Multilevel & hierarichal Inheritance");
        SUV suv = new SUV();
        suv.start();//inherited method
        suv.move();//inherited method
        suv.stop();//inherited method
        suv.specs();//overriden method
        suv.type();//specialized method


    }
}
