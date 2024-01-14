//static is something ,which is helpful when repition occurs
//by using static we dont need to create any object to access them
//we can access them by class name
//these are related to class members
//static members helps us to reduce the memory usage

package OOPS.Static;

class SimpleInterest{

    int principal;
    int time;
    static int rate;//here rate of interest is smae all the time
    //so ,ther is no need to create again and again the rate variable

    public SimpleInterest(int principal,int time){

        this.principal = principal;
        this.time = time;

    }

    public void display(){

        double res = (principal*rate*time)/100.0;
        System.out.println(res);
    }

}
public class StaticExamples {
    public static void main(String[] args) {

        SimpleInterest si = new SimpleInterest(10000,5);
        SimpleInterest.rate = 2;

        si.display();
    }
}
