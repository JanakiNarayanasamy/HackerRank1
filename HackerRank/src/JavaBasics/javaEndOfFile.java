package JavaBasics;

import java.util.Scanner;

public class javaEndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s = "";
        int count = 0;
        while(scanner.hasNext()){
            s = scanner.nextLine();
            if(s.contains("end-of-file")){
                System.out.println(++count + " "+ s);
                break;
            }else {
                System.out.println(++count + " "+ s);
            }
        }
    }
}
