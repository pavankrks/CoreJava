//shadowing problem is that when there name clash happens
//to local variable and to instance variable
//we can resolve this using this keyword



package OOPS.Constructor;

class KiloMetersToMeters{

    int km;
    int kilo;

    public KiloMetersToMeters(int km,int kilo){

        km = km;//shadowing problem
        this.kilo = kilo;//we can resolve using this keyword
    }

    void displayResult(){

        System.out.println(km*1000 + "meters");
        System.out.println(kilo*1000+"meters");
    }
}
public class ShadowingProblem {

    public static void main(String[] args) {
        KiloMetersToMeters ktm = new KiloMetersToMeters(5,5);
        ktm.displayResult();
    }
}
