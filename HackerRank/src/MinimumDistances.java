import java.util.*;

public class MinimumDistances {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(7);a.add(1);a.add(3);a.add(4);a.add(1);a.add(7);
        System.out.println(minimumDistances(a));
    }
    public static int minimumDistances(List<Integer> a){
        List<Integer> result = new ArrayList<>();
        Set<Integer> aSet= new HashSet<>();
        for (int i=0; i < a.size(); i++){
            if(aSet.add(a.get(i)) && Collections.frequency(a,a.get(i)) > 1)
            result.add(a.lastIndexOf(a.get(i))- a.indexOf(a.get(i)));
        }
        if(result.isEmpty()){
            return -1;
        }
        return Collections.min(result);
    }
}
