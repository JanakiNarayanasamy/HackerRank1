import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SequenceEquation {
    public static void main(String[] args) {
        List<Integer> p= Arrays.asList(4,3,5,1,2);
        System.out.println(permutationEquation(p));
    }
    public static List<Integer> permutationEquation(List<Integer> p){
        List<Integer> result=new ArrayList<>();
        for (int i=1; i<=p.size();i++){
            int a = (p.indexOf(i))+1;
            int b= (p.indexOf(a))+1;
            result.add(b);
        }
        return result;
    }
}
