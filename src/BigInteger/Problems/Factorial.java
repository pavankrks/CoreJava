package BigInteger.Problems;
import java.util.*;
import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        System.out.println(fact(n));

    }

    public static BigInteger fact(int n){
        BigInteger res = BigInteger.valueOf(1);

        for(int i = 2;i<=n;i++){

            //this is created because,Big interger operations only happen between
            //bigintegers only
            BigInteger x = BigInteger.valueOf(i);

            res = res.multiply(x);
        }

        return res;

    }
}
