public class ViralAdvertisement {
    public static void main(String[] args) {
        int n=3;
        System.out.println(viralAdvertising(n));
    }
    public static int viralAdvertising(int n){
        int likeCount=0;
        int rec=0;
        for (int i=1; i<= n; i++){
            if(i ==1){
                likeCount=2;
                rec =5;
            }
            else {
               rec= (rec/2)*3;
               likeCount= likeCount+rec/2;
            }
        }
        return likeCount;
    }

}
