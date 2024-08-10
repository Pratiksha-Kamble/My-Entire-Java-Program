package Programs_by_MKT;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAtRuntime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int rollno[]=new int[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the Array-->"+i);
			rollno[i]=sc.nextInt();
			//System.out.println(rollno[i]);
			
		}
		System.out.println(Arrays.toString(rollno));
		
		
		

	}

}
