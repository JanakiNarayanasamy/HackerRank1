package projectEuler;

import java.util.*;

public class MultiplesOf3And5 {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(multiples(n));
    }

    public static int multiples(int n) {
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(Integer::intValue).sum();
    }
}
