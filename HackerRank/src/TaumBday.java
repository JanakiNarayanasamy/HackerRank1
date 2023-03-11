public class TaumBday {
    public static void main(String[] args) {
        int b =7; int w = 7; int bc = 4; int wc = 2; int z= 1;
        System.out.println(taumBday(b,w,bc,wc,z));
    }
    public static long taumBday(int b, int w, int bc, int wc, int z){
        if(bc == wc){
            return (long) b *bc + (long) w *wc;
        } else if(bc > wc + z){
            return (long) b * (wc+z) + (long) w * wc;
        } else if(wc > bc + z){
            return (long) b *bc + (long) w * (bc+z);
        }else {
            return (long) b *bc + (long) w *wc;
        }
    }
}
