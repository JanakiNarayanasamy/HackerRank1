import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BreakingTheRecords {
    public static void main(String[] args) {
        List<Integer> scores=new ArrayList<Integer>();
        scores.add(10);scores.add(5);scores.add(20);scores.add(20);scores.add(4);scores.add(5);scores.add(2);
        scores.add(25);scores.add(1);

        System.out.println(breakingRecords(scores));
    }
    public static List<Integer> breakingRecords(List<Integer> scores){
        List<Integer> result = new ArrayList<Integer>();
        int max = scores.get(0);
        int min = scores.get(0);
        int maxCount =0, minCount =0;
        for (int i=0; i< scores.size(); i++){
            if(scores.get(i) < min){
                min= scores.get(i);
                minCount++;
            }
            if(scores.get(i) > max){
                max= scores.get(i);
                maxCount++;
            }
        }
        result.add(maxCount);
        result.add(minCount);
        return result;
    }
}
