package Programs_by_MKT;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquals_method {

	public static void main(String[] args) {
		
		String name[]=new String[3];
		Scanner sc=new Scanner(System.in);
		int rollno[]=new int[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the Array-->"+i);
			rollno[i]=sc.nextInt();
			//System.out.println(rollno[i]);
			
		}
		Scanner sc1=new Scanner(System.in);
		int rollno1[]=new int[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the Second Array-->"+i);
			rollno1[i]=sc1.nextInt();
			//System.out.println(rollno1[i]);
			
		}
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno1));
		
		if(Arrays.equals(rollno, rollno1)==true)
		{
			System.out.println("Both Arrays are equal");
		}
		else
		{
			System.out.println("Two Arrays are different");
		}
	
		
		
	}

}
