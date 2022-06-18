import java.util.ArrayList;
import java.util.List;

public class SolveMeFirst {
    public static void main(String[] args){
        int result = 0;
        List<Integer> numList= new ArrayList();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(10);
        numList.add(11);
        for (int i=0; i< numList.size();i++){
            result = result + numList.get(i);
        }

        System.out.println(result);


    }
}
