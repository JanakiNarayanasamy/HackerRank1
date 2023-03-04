public class SherlockAndSquares {
    public static void main(String[] args) {
        int a =3;
        int b = 9;
        System.out.println(squares(a,b));
    }
    public static int squares(int a, int b){
        int initial = (int) Math.ceil(Math.sqrt(a));
        int last = (int) Math.floor(Math.sqrt(b));

        return last-initial+1;
    }
}
