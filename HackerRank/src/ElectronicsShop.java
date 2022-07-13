import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElectronicsShop {
    public static void main(String[] args) {
        int[] keyboards =new int[]{4};
        int[] drives= new int[]{5};
        int b= 5;
        System.out.println(getMoneySpent(keyboards,drives,b));
    }
    public static int getMoneySpent(int[] keyboards, int[] drives, int b){
        List<Integer> myResult = new ArrayList<>();
        int sum=0;
        for (int i =0; i< keyboards.length; i++){
            for (int j=0; j< drives.length; j++){
                sum = keyboards[i]+ drives[j];
                if(sum <= b){
                    myResult.add(sum);
                }
                sum =0;
            }
        }
        if(myResult.isEmpty()){
            return -1;
        }else{
            return Collections.max(myResult);
        }

    }
}