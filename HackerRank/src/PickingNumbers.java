import java.util.*;
import java.util.stream.Collectors;

public class PickingNumbers {
    public static void main(String[] args) {
        List<Integer> newArray= Arrays.asList(4,97,5,97,97,4,97,4,97,97,97,97,4,4,5,5,97,5,97,99,4,97,5,97,97,97,5,5,97,4,5,97,97,5,97,4,97,5,4,4,97,5,5,5,4,97,97,4,97,5,4,4,97,97,97,5,5,97,4,97,97,5,4,97,97,4,97,97,97,5,4,4,97,4,4,97,5,97,97,97,97,4,97,5,97,5,4,97,4,5,97,97,5,97,5,97,5,97,97,97);
        System.out.println(pickingNumbers(newArray));
    }
    public static int pickingNumbers(List<Integer> a){
        Map<Integer,Integer> b= new HashMap<>();
        List<Integer> re= new ArrayList<>();
        List<Integer> frequency= new ArrayList<>();
        int sum=0;

        for (int i:a){
            b.put(i,Collections.frequency(a,i));
            frequency.add(Collections.frequency(a,i));
        }
        if(Collections.max(frequency) > 5){
            return Collections.max(frequency);
        }
        System.out.println(b);
        List<Integer> list= a.stream().distinct().collect(Collectors.toList());
        Collections.sort(list);
        for (int i=0;i< list.size()-1;i++){
           if(list.get(i) - list.get(i+1) <= 1 ){
              sum= b.get(list.get(i))+b.get(list.get(i+1));
              re.add(sum);
           }
           sum=0;
        }
        System.out.println(re);
        return Collections.max(re);
    }
}
