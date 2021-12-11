import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
//setb1 Display date formats


public class date{

	public static void main(String[] args){

	String str;

	Date d = new Date();

	SimpleDateFormat F1 = new SimpleDateFormat("dd/MM/yy");

	str = F1.format(d);

	System.out.println("Current date is is: "+str);


	SimpleDateFormat F2 = new SimpleDateFormat("MM-dd-yyyy");

	str = F2.format(d);

	System.out.println("Current date is: "+str);	
		
	
	SimpleDateFormat F3 = new SimpleDateFormat("EEEEEE MMMM dd yyyy");

	str = F3.format(d);

	System.out.println("Current date is: "+str);	


	SimpleDateFormat F4 = new SimpleDateFormat("E MMMM hh:mm:ss z yyyy");

	str = F4.format(d);

	System.out.println("Current date and time is:  "+str);	


	SimpleDateFormat F5 = new SimpleDateFormat("dd/MM/yy hh:mm:ss a Z");

	str = F5.format(d);

	System.out.println("Current date and time is: "+str);	


	SimpleDateFormat F6 = new SimpleDateFormat("hh:mm:ss");

	str = F6.format(d);

	System.out.println("Current time is: "+str);	


	SimpleDateFormat F7 = new SimpleDateFormat("w");

	str = F7.format(d);

	System.out.println("Current week of the year is "+str);	


	SimpleDateFormat F8 = new SimpleDateFormat("W");

	str = F8.format(d);

	System.out.println("Current week of the month is: "+str);	


	SimpleDateFormat F9 = new SimpleDateFormat("D");

	str = F9.format(d);

	System.out.println("Current day of the year is: "+str);	








}


}

