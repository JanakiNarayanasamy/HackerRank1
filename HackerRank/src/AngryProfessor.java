import java.util.Arrays;
import java.util.List;

public class AngryProfessor {
    public static void main(String[] args) {
        int k=2;
        List<Integer> a= Arrays.asList(0,-1,2,1);
        System.out.println(angryProfessor(k,a));
    }
    public static String angryProfessor(int k, List<Integer> a){
        int count=0;
        for(int i:a){
            if(i <= 0){
               count++;
            }
        }
        int b = 0;
        if(b==1);
        System.out.print("Sun");
        System.out.println("Moon");

        return (count < k)?  "YES" :  "NO";
    }
}
