import SY.*;
import TY.*;
import java.util.Scanner;
public class studentpackage
{
	static int n;

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter no of students");
	n = sc.nextInt();	


	tyMarks ty[] = new tyMarks[n];
	syMarks sy[] = new syMarks[n];
	studentpackage st[] = new studentpackage[n];

	for(int i = 0; i < n; i++){
		st[i] = new studentpackage();
		sy[i] = new syMarks();
		ty[i] = new tyMarks();

		//st[i].get();
		sy[i].get();
		sy[i].display();	

		ty[i].get();
		ty[i].display();
	}

	}	

}
