import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BeautifulTriplets {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);arr.add(2);arr.add(4);arr.add(5);arr.add(7);arr.add(8);arr.add(10);
        int d =3;
        System.out.println(beautifulTriplets(arr,d));
    }
    public static int beautifulTriplets(List<Integer> arr, int d){
        int count =0;
        Set<Integer> s= new HashSet<>(arr);
        for (int i =0; i< s.size();i++){
            if(s.contains(arr.get(i)+d) && s.contains(arr.get(i) + 2*d)){
                count++;
            }
        }
        return count;
    }
}
