import java.util.Calendar;

public class calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        
    }
}
