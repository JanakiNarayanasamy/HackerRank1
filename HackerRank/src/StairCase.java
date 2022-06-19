public class StairCase {
    public static void main(String[] args) {
        int stairCase = 6;

        for (int i= 1; i <= stairCase; i++){
            for (int j= stairCase; j > i; j--){
              System.out.print(" ");
            }
            for (int z= 0; z < i; z++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
