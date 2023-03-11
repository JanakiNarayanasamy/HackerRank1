public class LibraryFine {
    public static void main(String[] args) {
        int d1 = 14;
        int m1= 7;
        int y1 = 2018;
        int d2= 25;
        int m2 = 7;
        int y2= 2018;
        System.out.println(libraryFine(d1,m1,y1,d2,m2,y2));
    }
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2){
        if(y1 == y2){
            if(m1 == m2){
                if(d1 <= d2){
                    return 0;
                }else if(d1 > d2) {
                    return 15*(d1-d2);
                }
            }else if(m1 > m2) {
                return 500*(m1-m2);
            }
        }else if (y1 > y2){
            return 10000;
        }
        return 0;
    }
}
