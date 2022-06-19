import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimaxSum {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        list1.add(-1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        /*Integer min = Collections.min(list1);
        Integer max= Collections.max(list1);
        Integer sum = 0;
        for (int i=0; i < list1.size(); i++){
            sum += list1.get(i);
        }
        System.out.println((sum-max)+" "+(sum-min));*/
        Collections.sort(list1);
        Long minSum =0L;
        Long maxSum =0L;
        for (int i=0; i < list1.size()-1; i++){
            minSum += list1.get(i);
        }
        for (int i=1; i < list1.size(); i++ ){
            maxSum += list1.get(i);
        }
        System.out.println(minSum+" "+maxSum);

    }


}
