//Polymorphism is defined with the usage of the word called "many forms"
//We can achive this type of feature with the help of two variations one is
//1.Method Overloading(Compiletime Polymorphism)
//2.Method Overriding(Runtime Polymorphism)

//Method overloading(we can have same method signature but different parameters
//Method overriding(we can have different body but need to maintain method signature)
//--same class cannot contain methods with same signature with same parameters
//this riding is only applied to inherited class



package OOPS.Polymorphism;


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

class Mahindra{

    public void start(){

        System.out.println("car started");
    }

    public void speed(){
        System.out.println("Average speed 100kmph");
    }
    public void stop(){

        System.out.println("car stopped");
    }
}

class Thar extends Mahindra{

    public void speed(){
        System.out.println("Average speed 150kmph");
    }

    public void type(){

        System.out.println("Tourist Car");
    }
}
public class introduction {

    public static void main(String[] args) {

        System.out.println("Method Overloading");
        Addition addition = new Addition();

        System.out.println(addition.add(10,20));
        System.out.println(addition.add(10.0f,20.0f));
        System.out.println(addition.add(10,20.0f));
        System.out.println(addition.add(10.0,20.0));
        System.out.println(addition.add(10.0f,20));


        System.out.println();
        System.out.println("Method Overriding");

        Thar thar = new Thar();

        thar.start();//inherited
        thar.stop();//inherited
        thar.speed();//overridden
        thar.type();//specialized

    }
}


