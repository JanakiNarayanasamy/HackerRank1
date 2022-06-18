import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> firstArray = new ArrayList<>();
        List<Integer> rowArray1 = new ArrayList<>();
        rowArray1.add(0,11);
        rowArray1.add(1,2);
        rowArray1.add(2,4);
        firstArray.add(0,rowArray1);
        List<Integer> rowArray2 = new ArrayList<>();
        rowArray2.add(0,4);
        rowArray2.add(1,5);
        rowArray2.add(2,6);
        firstArray.add(0,rowArray2);
        List<Integer> rowArray3 = new ArrayList<>();
        rowArray3.add(0,10);
        rowArray3.add(1,8);
        rowArray3.add(2,-12);
        firstArray.add(0,rowArray3);

        System.out.println(firstArray);
        System.out.println(diagonalDifference(firstArray));

    }

    public static int diagonalDifference(List<List<Integer>> ar){
    int rightToLeft= 0;
    int leftToRight= 0;
    List<Integer> insideArray;
        /*List<Integer> insideArray = ar.get(0);
        List<Integer> insideArray2 = ar.get(1);
        List<Integer> insideArray3 = ar.get(2);
        rightToLeft= insideArray.get(0)+insideArray2.get(1)+insideArray3.get(2);
        leftToRight = insideArray.get(2)+insideArray2.get(1)+insideArray3.get(0);*/
        for (int i=0 ; i < ar.size();i++){
            insideArray = ar.get(i);
            for (int j=0; j < insideArray.size(); j++){
                if (i == j ){
                    rightToLeft = rightToLeft + insideArray.get(j);
                }
                if (i+j == insideArray.size()-1){
                    leftToRight += insideArray.get(j);
                }
            }
        }
        //return  rightToLeft;
        return Math.abs(rightToLeft-leftToRight);
    }
}
