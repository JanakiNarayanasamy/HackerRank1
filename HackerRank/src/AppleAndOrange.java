import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {
    public static void main(String[] args) {
        List<Integer> apples = new ArrayList<>();
        List<Integer> oranges = new ArrayList<>();
        apples.add(2);apples.add(3);apples.add(-4);
        oranges.add(3);oranges.add(-2);oranges.add(-4);
        int s = 7 , t= 10;
        int a =4, b=12;
        countApplesAndOranges(s,t,a,b,apples,oranges);
    }
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int appleCount=0, orangeCount=0;
        for(int i=0; i< apples.size(); i++){
            int sum = apples.get(i)+a;
            if(sum >= s && sum <= t){
                appleCount ++;
            }
        }
        for(int i=0; i< oranges.size(); i++){
            int sum = oranges.get(i)+b;
            if(sum >= s && sum <= t){
                orangeCount ++;
            }
        }
        System.out.println(appleCount+"\n"+orangeCount);

    }
}
