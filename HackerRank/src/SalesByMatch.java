import java.util.*;

public class SalesByMatch {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        list1.add(1);list1.add(2);list1.add(1);list1.add(2);list1.add(1);list1.add(3);list1.add(2);
        List<Integer> list2= new ArrayList<>();
        list2.add(10);list2.add(20);list2.add(20);list2.add(10);list2.add(10);list2.add(30);list2.add(50);list2.add(10);list2.add(20);
        System.out.println(sockMerchant(list2.size(),list2));
    }
    public static int sockMerchant(int n, List<Integer> ar){
        int sum=0;
        Set<Integer> distinct= new HashSet<>(ar);
        for (int i: distinct){
            sum = sum + (Collections.frequency(ar,i)/2);
        }
        return sum;
    }
}
