import java.util.ArrayList;
import java.util.List;

public class BillDivision {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        list1.add(3);list1.add(10);list1.add(2);list1.add(9);
        int k= 1;
        int b= 12;
        bonAppetit(list1,k,b);
    }
    public static void bonAppetit(List<Integer> bill, int k,int b){
        int sum=0;
        for (int i=0;i<bill.size();i++){
            if(i==k){
            }else {
                sum += bill.get(i);
            }
        }
        if(b-(sum/2) ==0 ){
            System.out.println("Bon Appetit");
        }else
        {
            System.out.println(b-(sum/2));
        }
    }
}
