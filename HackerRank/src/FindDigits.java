import java.util.stream.IntStream;

public class FindDigits {
    public static void main(String[] args) {
        int n= 11111;
        System.out.println(findDigits(n));
    }
    public static int findDigits(int n){
        int number = n;
        int digit;
        int count = 0;
        while (number > 0) {
            digit = number % 10;
            number = number / 10;
            if(digit!= 0 && n % digit == 0){
                count++;
            }
        }
        return count;
    }
}
