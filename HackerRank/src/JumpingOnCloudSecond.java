import java.util.ArrayList;
import java.util.List;

public class JumpingOnCloudSecond {
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();
        c.add(0);c.add(0);c.add(0);c.add(0);c.add(1);c.add(0);
        System.out.println(jumpingOnClouds(c));
    }
    public static int jumpingOnClouds(List<Integer> c){
        int count =0;
        int i=0;
        while (i <= c.size()){
            if(i+2 < c.size() && c.get(i+2) == 0){
                count++;
                i = i+2;
            }else if(i+1 < c.size() && c.get(i+1) == 0) {
                count++;
                i = i+1;
            }else {
                break;
            }
        }
        return count;
    }
}
