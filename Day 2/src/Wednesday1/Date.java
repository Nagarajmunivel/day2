package Wednesday1;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Date {
public static void main(String args[])
{
	LocalDate obj = LocalDate.now();
	System.out.println(obj);
	
	LocalTime t=LocalTime.now();
	System.out.println(t);
	
	Date d=new Date ();
	System.out.println(d);

	LocalDate d1=LocalDate.of(1998, 10, 23);
	System.out.println(d1);
	
	LocalTime t2=LocalTime.now(ZoneId.of("Asia/Dubai"));
	System.out.println(t2);
	
	LocalDateTime obj2=LocalDateTime.now();
	DateTimeFormatter obj1= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String s1=obj2.format(obj1);
	System.out.println(s1);

}
}
