public class DayOfTheProgrammer {
    public static void main(String[] args) {
        int year= 1980;
        System.out.println(dayOfProgrammer(year));
    }
    public static String dayOfProgrammer(int year){
        if(year% 4==0){
            return "12.09."+year;
        }else {
            return "13.09."+year;
        }
    }
}
