package Programs_by_MKT;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_Finally {
	
	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Age");
		try
		{
		int age =s1.nextInt();
		System.out.println("Age is" + age);
		}
		catch(InputMismatchException a1)
		{
			System.out.println("Handed the exception");
		}
		finally
		{
			System.out.println("Thank you so much,visit Again");
		}
		
	}

}
