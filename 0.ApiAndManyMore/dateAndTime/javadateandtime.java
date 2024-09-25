//it is a recent package from java8 .
//capable of storing even nano secounds.
//it is immutable 

//some of the most important class
/*localdate , localtime , local datetime, datatimeformatter */
import java.time.*;
import java.time.format.DateTimeFormatter;
public class javadateandtime {
public static void main(String[] args) {
    LocalDate d = LocalDate.now();
    System.out.println(d);

    LocalTime t = LocalTime.now();
    System.out.println(t);

    LocalDateTime dt = LocalDateTime.now();
    System.out.println(dt);

    //agar mn pasand formatting chunna h toh date and time formatter ko chununga
    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy --E");
    DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd-mm-yyyy E H:m a ");
    String mydate = dt.format(df1);
    System.out.println(mydate);
}
    
}
