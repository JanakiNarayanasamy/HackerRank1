import java.util.ArrayList;
import java.util.List;

public class BeautifulDayAtTheMovies {
    public static void main(String[] args) {
        int i=20,j=23,k=6;
        System.out.println(beautifulDays(i,j,k));
    }
    public static int beautifulDays(int i, int j, int k){
        List<Integer> reverselist= new ArrayList<>();
        List<Integer> difflist= new ArrayList<>();
        int reverse= 0;
        int count=0;
        for (int num=i;num<=j;num++){
            difflist.add(num);
        }
        for (int num1:difflist){
            for (;num1!=0;num1 =num1/10){
                int rem=num1%10;
                reverse= reverse*10+rem;
            }
            reverselist.add(reverse);
            reverse=0;
        }
        for (int l=0;l< difflist.size();l++){
            if((difflist.get(l)-reverselist.get(l))%k == 0){
                count++;
            }
        }

        return count;
    }
}
