public class NumberLineJumps {
    public static void main(String[] args) {
        int x1=0, v1=2, x2=5, v2=3;
        System.out.println(kangaroo(x1,v1,x2,v2));
    }
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        int sum1 = x1+v1;
        int sum2= x2+v2 ;
        for (int i=0; i <= 10000; i++){
            if(sum1 == sum2) {
                return "YES";
            }
            sum1 = sum1+v1;
            sum2 = sum2+v2;
        }
        return "NO";
    }
}
