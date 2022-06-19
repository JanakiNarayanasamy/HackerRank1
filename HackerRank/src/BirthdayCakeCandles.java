import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        list1.add(-5);
        list1.add(-2);list1.add(-5);list1.add(-5);list1.add(-2);list1.add(-10);
        /*Integer max= Collections.max(list1);
        int count =0;
        for (int i =0; i <list1.size(); i++){
            if(list1.get(i) == max){
                count +=1;
            }
        }*/
        //this is working
        System.out.println(Collections.frequency(list1,Collections.max(list1)));

    }
}
