import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(78);
        grades.add(66);
        grades.add(42);
        grades.add(23);
        grades.add(12);

        System.out.println(gradingStudents(grades));
    }

    public static List<Integer> gradingStudents(List<Integer> grades){
        List<Integer> ans = new ArrayList<>();
        for (int marks:grades){
            if((marks < 38) || (marks%5 <= 2)){
             ans.add(marks);
            } else
            if (marks%5 >= 3){
                int add = 5 - marks %5;
                ans.add(marks+add);
            }
        }
        return ans;
    }
}
