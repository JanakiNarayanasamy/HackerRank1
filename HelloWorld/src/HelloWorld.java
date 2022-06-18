public class HelloWorld {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println(firstMethod());
            }

    }
    public static String firstMethod(){
        System.out.println(secondMethod());
        return "first";
    }
    public static String secondMethod(){
        return "second";
    }
}
