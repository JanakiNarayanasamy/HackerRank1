import java.util.ArrayList;
import java.util.List;

public class SubArrayDivision {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(4);//list1.add(2);list1.add(1);list1.add(3);list1.add(2);
        int m = 1;
        int d = 4;
        System.out.println(birthday(list1,d,m));
    }
    public static int birthday(List<Integer> s, int d, int m){
        int count =0;
        int sum =0;
        for (int i=0 ; i<= s.size()-m; i++){
            for (int j=0; j < m; j++){
              sum += s.get(i+j);
            }
            if(sum == d){
                count++;
            }
            sum = 0;
        }
        return count;
    }
}
