public class JumpingOnClouds {
    public static void main(String[] args) {
        int[] c={1,1,0, 1, 0, 1, 0, 1, 0, 1, 0 ,1, 1, 0, 1, 1, 1, 1, 1};
        int k=19;
        System.out.println(jumpingOnClouds(c,k));
    }
    public static int jumpingOnClouds(int[] c, int k){
        int count=100;
          int i = k;
           for (i = k; i <= c.length; ) {
              if (i < c.length) {
                  if (c[i] == 0) {
                      count -= 1;
                      if (i == 0) break;
                      System.out.println(count);
                  } else if (c[i] == 1) {
                      count -= 3;
                      System.out.println(count);
                      if (i == 0) break;
                  }
                  i = i + k;
              }
               if (i >= c.length) {
                   i = i - c.length;
               }
           }

        return count;
    }

}
