public class DrawingBook {
    public static void main(String[] args) {
        int n=5;
        int p=4;
        System.out.println(pageCount(n,p));
    }
    private static int pageCount(int n, int p){
        if(p ==1 || p==n){
            return 0;
        }
        int front = p/2;
        int back= n/2 - p/2;

        return front < back ? front : back;
    }
}
