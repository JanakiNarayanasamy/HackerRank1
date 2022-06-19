import java.util.ArrayList;
import java.util.List;

public class APlusMinus {
    public static void main(String[] args) {
        Double minus = 0.0;
        Double plus = 0.0;
        Double zero = 0.0;

        List<Integer> list1 = new ArrayList<>();
        list1.add(-4);
        list1.add(3);
        list1.add(-9);list1.add(0);list1.add(4);list1.add(1);
        for(int i=0; i < list1.size(); i++){
            if(list1.get(i)==0){
                zero += 1;
            }
            if(list1.get(i) > 0){
                plus += 1;
            }
            if(list1.get(i) < 0){
                minus += 1;
            }
        }

        System.out.println(String.format("%.6f",plus/list1.size())+"\n"+String.format("%.6f",minus/list1.size())+"\n"+String.format("%.6f",zero/list1.size()));



    }
}
