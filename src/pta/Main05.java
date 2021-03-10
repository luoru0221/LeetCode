package pta;

import java.math.BigInteger;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger ten = new BigInteger("10");
        BigInteger one = new BigInteger("1");
        while (input.hasNext()) {
            int number = input.nextInt();

            BigInteger src = new BigInteger(number + "");
            BigInteger target = new BigInteger("1");

            while (!target.divide(src).multiply(src).equals(target)) {
                target = target.multiply(ten).add(one);
            }

            String countLen = target.toString();
            System.out.println(target.divide(src)+" "+countLen.length());
        }
    }
}
