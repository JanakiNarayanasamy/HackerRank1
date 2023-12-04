package JavaBasics;

import java.io.*;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

class Result {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH,month-1);
        calendar.set(Calendar.DAY_OF_MONTH,day);
        calendar.set(Calendar.YEAR,year);
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.US).toUpperCase();
    }

}
public class JavaDateAndTime {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();int c = scanner.nextInt();
        System.out.println(Result.findDay(a,b,c));

    }
}
