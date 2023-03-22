public class KaprekarNumbers {
    public static void main(String[] args) {
        int p =1;
        int q = 100;
        kaprekarNumbers(p,q);
    }
    public static void kaprekarNumbers(int p, int q){
        boolean flag = false;
        for (int i = p; i< q; i++) {
            if(i == 1){
                System.out.print(i+ " ");
                flag = true;
            }
            String square = String.valueOf(i * i);
            if(Integer.parseInt(square)>10) {
                int limit = square.length() / 2;
                if (Integer.parseInt(square.substring(0, limit)) + Integer.parseInt(square.substring(limit)) == i) {
                    System.out.print(i + " ");
                    flag = true;
                }

            }

        }
        if (!flag){
            System.out.println("INVALID RANGE");
        }
    }

}
