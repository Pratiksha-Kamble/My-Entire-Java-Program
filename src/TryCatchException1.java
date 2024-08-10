package Programs_by_MKT;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchException1 {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		try
		{
			System.out.println("Enter age");
		int age =s1.nextInt();
		System.out.println("Enter age"+age);
		}
	
		catch(InputMismatchException a1)
		{
			System.out.println("Handed the exception");
		}
		catch(NullPointerException a2)
		{
			System.out.println("Handed the exception 1");
		}
		catch(IndexOutOfBoundsException a3sss)
		{
			System.out.println("Handed the exception 2");
		}
	}

}
