import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CircularArrayNotation {
    public static void main(String[] args) {
        List<Integer> a= Arrays.asList(3,4,5);
        int k =2;
        List<Integer> queries= Arrays.asList(1,2);
        System.out.println(circularArrayRotation(a,k,queries));
    }
    public static List<Integer> circularArrayRotation(List<Integer> a, int k,List<Integer> queries){
        List<Integer> temp= new ArrayList<>(a);
        List<Integer> result= new ArrayList<>();
        for (int i=0; i< k; i++){
            int tempSize= (temp.size()-1);
            int toAdd= temp.get(tempSize);
            temp.remove(tempSize);
            temp.add(0,toAdd);
        }
        for (int i=0; i< queries.size();i++){
            result.add(temp.get(queries.get(i)));
        }

        return result;
    }
}
