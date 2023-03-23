public class ChocolateFeast {
    public static void main(String[] args) {
        int n=7;
        int c=3;
        int m=2;
        System.out.println(chocolateFeast(n,c,m));
        //7/3 = 2 +1 = 3 /2 = 1+1 = 2/2 =0
    }
    public static int chocolateFeast(int n, int c, int m){
        int count=0;
        int result =0;
        int left = n%c;
        int ate = n/c;
        result = ate; count =ate+left;
        while (count >0 && count >= m){
            result = result+ count/m;
            count = count/m+count%m;
        }
        return result;
    }

    public static int chocolateFeast1(int n, int c, int m) {
        int ate = 0;

        int chocolates = n / c;

        ate += chocolates;

        while(chocolates >= m)
        {
            ate += chocolates / m;
            chocolates = (chocolates / m) + (chocolates % m);
        }

        return ate;
    }
}
