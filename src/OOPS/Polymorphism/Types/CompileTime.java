package OOPS.Polymorphism.Types;
class Addition{

    public int add(int a,int b){
        System.out.println("inside int");
        return a+b;
    }

    public float add(float a,float b){
        System.out.println("inside float");
        return a+b;
    }

    public float add(int a,float b){
        System.out.println("inside int float");
        return a+b;
    }

    public double add(double a,double b){
        System.out.println("inside double");
        return a+b;
    }
}

public class CompileTime {
    public static void main(String[] args) {
        System.out.println("Method Overloading");
        Addition addition = new Addition();

        System.out.println(addition.add(10,20));
        System.out.println(addition.add(10.0f,20.0f));
        System.out.println(addition.add(10,20.0f));
        System.out.println(addition.add(10.0,20.0));
        System.out.println(addition.add(10.0f,20));
    }
}
