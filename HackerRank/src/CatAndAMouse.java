public class CatAndAMouse {
    public static void main(String[] args) {
        int x=-1,y=-2,z=-3;
        System.out.println(catAndMouse(x,y,z));
    }
    private static String catAndMouse(int a, int b, int c){
        int x= Math.abs(a);
        int y= Math.abs(b);
        int z= Math.abs(c);
        if((x-z)>(z-y)){
            return "Cat A";
        }
        else if((x-z)<(z-y)){
            return "Cat B";
        }else if((x-z) == (z-y)) {
            return "Mouse C";
        }
        return "";
    }
}
