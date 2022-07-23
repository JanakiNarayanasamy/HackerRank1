import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FormingAMagicSquare {
    public static void main(String[] args) {
        List<Integer> row1= Arrays.asList(2,5,4);
        List<Integer> row2= Arrays.asList(4,6,9);
        List<Integer> row3= Arrays.asList(4,5,2);
        List<List<Integer>> s= new ArrayList();
        s.add(row1);
        s.add(row2);
        s.add(row3);
        System.out.println(formingMagicSquare(s));
    }
    public static int formingMagicSquare(List<List<Integer>> s){
        int sum=0;int sum1=0;int sum2=0;int sum3=0;int sum4=0;int sum5=0;int sum6=0;int sum7=0;
        int count=0;int count1=0;int count2=0;int count3=0;int count4=0;int count5=0;int count6=0;int count7=0;
        List<Integer> tempList= new ArrayList<>(8);
        List<Integer> sumList= new ArrayList<>();
        List<List<Integer>> s1=Arrays.asList(Arrays.asList(8,3,4),Arrays.asList(1,5,9),Arrays.asList(6,7,2));
        List<List<Integer>> s2=Arrays.asList(Arrays.asList(4,9,2),Arrays.asList(3,5,7),Arrays.asList(8,1,6));
        List<List<Integer>> s3=Arrays.asList(Arrays.asList(2,7,6),Arrays.asList(9,5,1),Arrays.asList(4,3,8));
        List<List<Integer>> s4=Arrays.asList(Arrays.asList(6,1,8),Arrays.asList(7,5,3),Arrays.asList(2,9,4));
        List<List<Integer>> s5=Arrays.asList(Arrays.asList(8,1,6),Arrays.asList(3,5,7),Arrays.asList(4,9,2));
        List<List<Integer>> s6=Arrays.asList(Arrays.asList(4,3,8),Arrays.asList(9,5,1),Arrays.asList(2,7,6));
        List<List<Integer>> s7=Arrays.asList(Arrays.asList(2,9,4),Arrays.asList(7,5,3),Arrays.asList(6,1,8));
        List<List<Integer>> s8=Arrays.asList(Arrays.asList(6,7,2),Arrays.asList(1,5,9),Arrays.asList(8,3,4));

        for (int i=0; i< s.size(); i++){
            for (int j=0; j< s.size();j++){
                //System.out.print(s1.get(i).get(j)+" "+s.get(i).get(j));
                sum=sum+ Math.abs(s1.get(i).get(j)-s.get(i).get(j));
                sum1=sum1+ Math.abs(s2.get(i).get(j)-s.get(i).get(j));
                sum2=sum2+ Math.abs(s3.get(i).get(j)-s.get(i).get(j));
                sum3=sum3+ Math.abs(s4.get(i).get(j)-s.get(i).get(j));
                sum4=sum4+ Math.abs(s5.get(i).get(j)-s.get(i).get(j));
                sum5=sum5+ Math.abs(s6.get(i).get(j)-s.get(i).get(j));
                sum6=sum6+ Math.abs(s7.get(i).get(j)-s.get(i).get(j));
                sum7=sum7+ Math.abs(s8.get(i).get(j)-s.get(i).get(j));
                //sumList.set(i,sum+ Math.abs(s1.get(i).get(j)-s.get(i).get(j)));

            }
            count= count+sum;count1= count1+sum1;count2= count2+sum2;count3= count3+sum3;count4= count4+sum4;count5= count5+sum5;count6= count6+sum6;count7= count7+sum7;
            sum=0;sum1=0;sum2=0;sum3=0;sum4=0;sum5=0;sum6=0;sum7=0;
        }
        tempList.add(0,count);
        tempList.add(1,count1);tempList.add(2,count2);tempList.add(3,count3);tempList.add(4,count4);tempList.add(5,count5);tempList.add(6,count6);tempList.add(7,count7);
        System.out.println(tempList);

        return Collections.min(tempList);
    }
}
