import java.util.Scanner;


public class array{

	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n = sc.nextInt();
	
	int arr[]  = new int[n];
	
	System.out.println("Enter the elements");
	for(int i = 0;i < n;i++){
		arr[i] = sc.nextInt();
		}
	
	System.out.println("Array in reversed order is");

	for(int i = n-1;i >= 0;i--){
	 System.out.print(arr[i] + " ");
	}
	
	}

}
