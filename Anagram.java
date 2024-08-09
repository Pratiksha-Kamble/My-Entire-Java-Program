package Programs_by_MKT;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String input1="Ram";
		String input2="Ram";
		if(input1.length()!=input2.length())
		{
			System.out.println("They are not anagra,");
		}
		char[] c1=input1.toCharArray();
		char[] c2=input1.toCharArray();
		
		System.out.println("Before Sorting-->");
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println("After Sorting-->");
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		if(Arrays.equals(c1, c2)==true)
		{
			System.out.println("They are anagram");
		}
		else
		{
			System.out.println("They are not anagram");
		}


		
	}

}
