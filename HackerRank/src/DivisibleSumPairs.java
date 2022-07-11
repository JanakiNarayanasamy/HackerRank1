import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        list1.add(1);list1.add(3);list1.add(2);list1.add(6);list1.add(1);list1.add(2);
        int n=6,k=3;
        System.out.println(divisibleSumPairs(n,k,list1));
    }
    public static int divisibleSumPairs(int n, int k, List<Integer> list1){
        int count =0;
        for (int i=0; i< n; i++){
            for (int j=0; j<n ; j++){
                if(list1.get(i) < list1.get(j)){
                    if((list1.get(i)+list1.get(j)) % k == 0){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
