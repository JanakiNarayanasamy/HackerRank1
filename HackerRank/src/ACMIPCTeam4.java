import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ACMIPCTeam4 {
    public static void main(String[] args) {
        List<String> topic = new ArrayList<>();
        topic.add("10101");topic.add("11100");topic.add("11010");topic.add("00101");
        System.out.println(acmTeam(topic));
    }
    public static List<Integer> acmTeam(List<String > topic){
        int oneCount = 0;
        List<Integer> oneCountList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        for(int i= 0; i < topic.size(); i++){
            for (int j=i+1; j < topic.size(); j++ ){
                if(topic.get(j) != null) {
                    for (int k =0; k < topic.get(i).length(); k++){
                        if( topic.get(i).charAt(k) == '0' && topic.get(j).charAt(k) == '0' ){
                        }else{
                            oneCount ++;
                        }
                    }
                    oneCountList.add(oneCount);
                    oneCount = 0;
                }
            }
        }
        resultList.add(Collections.max(oneCountList));
        resultList.add(Collections.frequency(oneCountList,Collections.max(oneCountList)));
        return resultList;
    }
}
