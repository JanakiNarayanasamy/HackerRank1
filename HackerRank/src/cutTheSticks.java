import java.util.*;

public class cutTheSticks {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(){};
        a.add(1);a.add(2);a.add(3);a.add(4);a.add(3);a.add(3);a.add(2);a.add(1);
        System.out.println(cutSticks(a));
    }
    public static List<Integer> cutSticks(List<Integer> list) {

        List<Integer> result = new ArrayList<>();

        List<Integer> list2 = new ArrayList<>();
        result.add(list.size());

        while (list.size() > 0) {
            int n = Collections.min(list);
            for (int i = 0; i < list.size(); i++) {
                int k = list.get(i) - n;
                list.set(i, k);
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) != 0) {
                    list2.add(list.get(i));
                }
            }
            if(list2.size() !=0) {
                result.add(list2.size());
            }
            list.clear();
            list.addAll(list2);
            list2.clear();
        }
        return result;
    }
}
