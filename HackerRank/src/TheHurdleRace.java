import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TheHurdleRace {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(2,5,4,5,2);
        int k=7;
        System.out.println(hurdleRace(list1,k));
    }
    private static int hurdleRace(List<Integer> height, int k){
        if(Collections.max(height) > k){
            return Collections.max(height)-k;
        }else return 0;
    }
}
