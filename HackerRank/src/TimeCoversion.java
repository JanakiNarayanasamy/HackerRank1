import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeCoversion {
    public static void main(String[] args) throws ParseException {
        String s= "07:05:45PM";
        System.out.println(timeConversion(s));
    }
    public static String timeConversion(String s) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat format= new SimpleDateFormat("HH:mm:ss");
        Date time= dateFormat.parse(s);

        return format.format(time);
    }
}
