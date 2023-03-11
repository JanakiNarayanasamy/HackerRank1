public class RepeatedString {
    public static void main(String[] args) {
        String s = "a";
        int n =1000000;
        System.out.println(repeatedString(s,n));
    }
    public static long repeatedString(String s, int n){
        long firstdivide = n/s.length();
        //System.out.println("multiples of total string " + firstdivide);
        long aCount =0;
        for (int i =0; i<s.length();i++){
            if(s.charAt(i) == 'a'){
                aCount++;
            }
        }
        //System.out.println("total a count in string "+ aCount);
        long amultiple = aCount*firstdivide;
        System.out.println("count of a in multiples " +amultiple );
        long rem = n % s.length();
        System.out.println("remaining string length "+ rem);
        for (int i =0; i<rem;i++){
            if(s.charAt(i) == 'a'){
                amultiple++;
            }
        }
        System.out.println("if extra a added" + amultiple);
        return amultiple;
    }
}
