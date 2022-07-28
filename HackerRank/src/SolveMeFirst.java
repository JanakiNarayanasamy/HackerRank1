import java.util.*;

public class SolveMeFirst {
    public static void main(String[] args){
        /*int result = 0;
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
        System.out.println(newList.get(1).contains("test"));*/

        Map<String,String> newMap= new HashMap<>();
        Map<String,String> newMap1= new HashMap<>();
        newMap.put("target"+"12345","54321");
        newMap.put("enrollingTarget"+"12345","98876");
        for (Map.Entry<String,String> entry: newMap.entrySet()){
            System.out.println(entry.getKey().replaceAll("[^0-9]",""));
            newMap1.put(entry.getKey().replaceAll("[^0-9]",""), entry.getValue());
        }
        System.out.println(newMap);
        System.out.println(newMap1);
            }
}
