import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HalloweenSale {
    public static void main(String[] args) {
        int p =20;
        int d=3;
        int m=6;
        int s=80;
        System.out.println(howManyGames(p,d,m,s));
    }
    public static int howManyGames(int p, int d, int m, int s){
        List<Integer> a = new ArrayList<>();
        a.add(p);
        int sum=p;
        int reduced= p;
        while (sum < s){
            reduced = reduced -d;
            if (reduced > m){
                sum = sum +reduced;
                if(sum < s)
                a.add(reduced);
            }else {
                sum = sum + m;
                if(sum < s)
                a.add(m);
            }
        }
        return a.size();
    }
}
