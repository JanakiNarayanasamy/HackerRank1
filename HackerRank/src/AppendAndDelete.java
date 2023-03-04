public class AppendAndDelete {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcdert";
        int k = 9;
        System.out.println(appendAndDelete(s1, s2, k));
    }

    public static String appendAndDelete(String s, String t, int k) {
        int commonLength = 0;
        for (int i = 0; i < java.lang.Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) == t.charAt(i))
                commonLength++;
            else
                break;
        }
//CASE A
        if ((s.length() + t.length() - 2 * commonLength) > k) {
            return "No";
        }
//CASE B
        else if ((s.length() + t.length() - 2 * commonLength) % 2 == k % 2) {
            return "Yes";
        }
//CASE C
        else if ((s.length() + t.length() - k) < 0) {
            return "Yes";
        }
//CASE D
        else {
            return "No";
        }
    }
}