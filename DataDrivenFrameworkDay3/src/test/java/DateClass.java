import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {
	public static void main(String[] args) {
		//System Date
		Date date=new Date();
		System.out.println(date);
	
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-YY");
		String format = dateFormat.format(date);
		System.out.println(format);
		
		SimpleDateFormat dateFormat2=new SimpleDateFormat("dd-MMM-YYYY");
		String format2 = dateFormat2.format(date);
		System.out.println(format2);
		
		SimpleDateFormat dateFormat3=new SimpleDateFormat("dd-MMMM-YYYY");
		String format3 = dateFormat3.format(date);
		System.out.println(format3);

	}

}
