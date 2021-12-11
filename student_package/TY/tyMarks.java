package TY;
import java.util.Scanner;
public class tyMarks{

	float theoryMarks, practicalMarks;



	public void get(){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Theory and practical marks.");
	theoryMarks = sc.nextFloat();
	practicalMarks = sc.nextFloat();
	

	}
	public void display()
	{

		System.out.println("Theory marks: "+theoryMarks+"\nPractical Marks: "+practicalMarks);

	}


}
