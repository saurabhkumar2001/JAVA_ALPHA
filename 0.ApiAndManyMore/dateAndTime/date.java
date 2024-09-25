import java.util.Date;
public class date {
    //depricated java8 onwards
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
        System.out.println(d.getHours());
        System.out.println(d.getSeconds());
        
    }
}
