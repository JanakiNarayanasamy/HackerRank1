public class UtopianTree {
    public static void main(String[] args) {
        int k=7;
        System.out.println(utopianTree(k));
    }
    private static int utopianTree(int n){
        int count=0;
        for (int i=0; i <= n; i++){
            if(i%2 == 0) count++;
            if(i%2 ==1) count *= 2;
        }
        return count;
    }
}
