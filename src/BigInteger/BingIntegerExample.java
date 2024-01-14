package BigInteger;
import java.math.BigInteger;
import java.util.*;
public class BingIntegerExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First : ");
        String str1 = scan.next();
        System.out.println("Enter Second : ");
        String str2 = scan.next();
        BigInteger A = new BigInteger(str1);
        BigInteger B = new BigInteger(str2);


        //opeartions
        System.out.println("Operations: ");
        System.out.println();
        System.out.println("ADD :");
        System.out.println(A.add(B));
        System.out.println("Subtract :");
        System.out.println(A.subtract(B));
        System.out.println("Multiply :");
        System.out.println(A.multiply(B));
        System.out.println("Divide :");
        System.out.println(A.divide(B));
        System.out.println("Remainder :");
        System.out.println(A.remainder(B));

        System.out.println();
        //comparisions
        System.out.println("Comparisions");
        System.out.println(A.compareTo(B));


        System.out.println();
        //conversions
        System.out.println("string: "+A.toString());
        System.out.println("int: "+B.intValue());

    }
}
