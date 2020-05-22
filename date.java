import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static String previousDateString(String dateString) 
            throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

    
        Date myDate = dateFormat.parse(dateString);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(myDate);
        calendar.add(Calendar.DAY_OF_YEAR, -1);


        Date previousDate = calendar.getTime();
        String result = dateFormat.format(previousDate);

        return result;
    }

    public static void main(String[] args) {
        String dateString = "20100316";

        try {
            // This will print 20100315
            System.out.println(previousDateString(dateString));
        } catch (ParseException e) {
            System.out.println("Invalid date string");
            e.printStackTrace();
        }
    }
}