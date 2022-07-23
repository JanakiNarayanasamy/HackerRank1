import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolveMeFirst {
    public static void main(String[] args){
        int result = 0;
        List<Integer> numList= new ArrayList();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(10);
        numList.add(11);
        for (int i=0; i< numList.size();i++){
            result = result + numList.get(i);
        }

        System.out.println(result);

        String s1= "1234567";
        String s2= "test_"+12345;
        List<String > newList= Arrays.asList(s1,s2);
        System.out.println(s1.replaceAll("[^0-9]",""));
        System.out.println(s2.replaceAll("[^0-9]",""));
        System.out.println(newList.contains("test_12345"));
    }
}
