import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(extraLongFactorials(n));
    }
    public static BigInteger extraLongFactorials(int n){
        BigInteger result = BigInteger.valueOf(1);
        for( int i = n; i > 0; i-- ){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}
