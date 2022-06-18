import java.util.ArrayList;
import java.util.List;

public class AveryBigSum {
    public static void main(String[] args) {
        Long result = Long.valueOf(0);
        List<Long> longList = new ArrayList<>();
        longList.add(1000000001L);
        longList.add(1000000002L);
        longList.add(1000000003L);
        longList.add(1000000004L);
        longList.add(1000000005L);

        for (int i=0; i < longList.size(); i++){
            result = result + longList.get(i);
        }
        System.out.println(result);

    }
}
