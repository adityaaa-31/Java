package SY;
import java.util.Scanner;

public class syMarks {
    
	public int computerTotal, mathsTotal, electronicsTotal;

	public void getSY(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter Computer, Maths and Electronics marks.");
		
		computerTotal = sc.nextInt();
		mathsTotal = sc.nextInt();
		electronicsTotal = sc.nextInt();

	}


}
