package beSkilled;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        isPrime(input.nextInt());
    }

    static void isPrime(int num) {
        if (BigInteger.valueOf(num).isProbablePrime(1)) {
            System.out.println("Is Prime :");

        } else {
            System.out.println("Is notprime");
        }
    }

}
