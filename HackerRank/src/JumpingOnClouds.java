public class JumpingOnClouds {
    public static void main(String[] args) {
        int[] c={0,0,1,0,0,1,1,0};
        int k=2;
        System.out.println(jumpingOnClouds(c,k));
    }
    public static int jumpingOnClouds(int[] c, int k){
        int count=100;
        for (int i=k; i<= c.length;i = i+k){
            if(i != c.length){
            if(c[i] == 1){
                count = count -3;
            } else if(c[i]==0){
                count =count - 1;
            }}
            else{
                if(c[0]==0){
                    count = count-1;
                }else {
                    count = count-3;
                }
            }
        }
        return count;
    }

}
