package OOPS.Constructor;

class Rectangle{

    int length;
    int breadth;


    //default constructor
    public Rectangle() {

    }


    //parameterized costructor
    public Rectangle(int x,int y){

        length = x;
        breadth = y;
    }

    //display the area

    public void displayArea(){

        int area = length*breadth;
        System.out.println(area);
    }
}
public class ConstructorTypes {

    public static void main(String[] args) {

        //for default constructor
        System.out.println("Default:");
        Rectangle rect1 = new Rectangle();
        rect1.breadth = 50;
        rect1.length = 25;
        rect1.displayArea();


        //for Parameterized Constructor
        System.out.print("Parameterized:");

        Rectangle rect2 = new Rectangle(5,10);
        rect2.displayArea();



    }
}
