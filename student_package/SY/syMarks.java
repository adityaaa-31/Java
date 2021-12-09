package SY;
import java.util.Scanner;

public class syMarks{


	public int computerTotal, mathsTotal, electronicsTotal;
	
	

	public void get(){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Computer, Maths and Electronics marks.");
	computerTotal = sc.nextInt();
	mathsTotal = sc.nextInt();
	electronicsTotal = sc.nextInt();

	}

	public void display()
	{

		System.out.println("Comp: "+computerTotal+"\nMaths "+mathsTotal+"\nElect "+electronicsTotal);

	}

}
