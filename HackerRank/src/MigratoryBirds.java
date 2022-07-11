import java.util.*;

public class MigratoryBirds {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        list1.add(1);list1.add(1);list1.add(2);list1.add(2);list1.add(3);
        System.out.println(migratoryBirds(list1));
    }
    public static int migratoryBirds(List<Integer> arr){
        int value =0;
        Map<Integer, Integer> m1= new HashMap<Integer, Integer>();
        List<Integer> list1=new ArrayList<>();
        Set<Integer> distinct = new HashSet<>(arr);
        for (int i:distinct){
            System.out.println(i+"fre: "+ Collections.frequency(arr,i));
            m1.put(i,Collections.frequency(arr,i));
        }
        int maxValue = Collections.max(m1.values());
        for (Map.Entry<Integer,Integer> entry:m1.entrySet()){
            if(entry.getValue()==maxValue)
            {
                list1.add(entry.getKey());
            }
        }
        return Collections.max(list1);
    }
}
