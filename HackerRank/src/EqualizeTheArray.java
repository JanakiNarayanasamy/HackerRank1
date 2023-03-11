import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EqualizeTheArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);arr.add(2);arr.add(2);arr.add(3);
        System.out.println(equalizeArray(arr));
    }
    public static int equalizeArray(List<Integer> arr){
        List<Integer> freq = new ArrayList<>();
        for (int i: arr){
            freq.add(Collections.frequency(arr,i));
        }
        return arr.size()-Collections.max(freq);
    }
}
