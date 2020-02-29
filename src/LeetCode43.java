import java.math.BigInteger;

public class LeetCode43 {

    public String multiply(String num1, String num2) {
        BigInteger integer1 = new BigInteger(num1);
        BigInteger integer2 = new BigInteger(num2);
        BigInteger result = integer1.multiply(integer2);
        return result.toString();
    }

}
