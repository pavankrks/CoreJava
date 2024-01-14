package BigInteger.Problems;
import java.util.*;
import java.math.BigInteger;
public class PrimeAndNextPrime {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter No: ");
        int n = scan.nextInt();
        System.out.println(isPrime(n));
        System.out.println(nextPrime(n));
    }

    public static String isPrime(int n){

        BigInteger A = BigInteger.valueOf(n);

        Boolean res = A.isProbablePrime(1);

        if(res==true){
            return "Prime";
        }
        return "Not Prime";
    }


    public static BigInteger nextPrime(int n) {

        BigInteger A = BigInteger.valueOf(n);
        BigInteger B = A.nextProbablePrime();
        return B;
    }
}
