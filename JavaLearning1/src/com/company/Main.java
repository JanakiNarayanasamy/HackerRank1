package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a= 10;
        int b= 15;

        List<Integer> commonDivisor = getCommonDivisor(a, b);
        System.out.println(commonDivisor);
    }
    public static List<Integer> getCommonDivisor(int a, int b){
        List<Integer> list = new ArrayList<>();
        int min= minimum(a,b);

        for(int i = 1; i <= min / 2; i++) {
            if (a % i == 0 && b % i == 0) {
                list.add(i);
            }
        }

        if (a % min == 0 && b % min == 0) {
            list.add(min);
        }

        return list;

    }
    public static int minimum(int a, int b){
        return a <= b ? a : b;
    }
}
