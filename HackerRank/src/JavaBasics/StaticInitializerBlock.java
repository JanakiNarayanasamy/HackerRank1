package JavaBasics;

import java.util.Scanner;

public class StaticInitializerBlock {
    static int B= 0;
    static int H= 0;
    static boolean flag = false;
    static {
        Scanner scanner = new Scanner(System.in);
         B= scanner.nextInt();
         H = scanner.nextInt();
        if(B > 0 && H > 0){
            flag = true;
        }
    }
    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
