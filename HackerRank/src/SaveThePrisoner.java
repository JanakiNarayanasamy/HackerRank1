public class SaveThePrisoner {
    public static void main(String[] args) {
        int n=4,m=6,s=2;
        System.out.println(saveThePrisoner1(n,m,s));
    }
    public static int saveThePrisoner(int n, int m, int s){
        for (int k = s;k<=n;){
            m--;
            if(m == 0)return k;
            if(k==n) k=0;
            k++;
        }
        return 0;

    }
    public static int saveThePrisoner1(int n, int m, int s){
        /*for (int k = s;k<=n;){
            m--;
            if(m == 0)return k;
            if(k==n) k=0;
            k++;
        }
        return 0;*/
        int last = ((m - 1) + (s - 1)) % n + 1;
        return last;
    }
}
