import java.util.HashMap;
import java.util.Map;

public class CountingValleys {
    public static void main(String[] args) {
        int step= 8;
        String path = "UDDDUDUU";
        System.out.println(countingValleys(step,path));
    }
    private static int countingValleys(int steps, String path){
        int v=0;
        int l =0;
        for(int i=0; i < path.length(); i++){
            if(path.charAt(i) == 'U'){
                ++l;
            }
            if(path.charAt(i) == 'D'){
                --l;
            }
            if(path.charAt(i) == 'U' && l == 0){
                ++v;
            }
        }
        return v;
    }
}
