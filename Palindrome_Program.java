package Programs_by_MKT;

public class Palindrome_Program {

	public static void main(String[] args) {
		
		String input="mom";
		String reverse="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char ch=input.charAt(i);
			reverse=reverse+ch;
			
		}
		System.out.println(reverse);
		
		if(input.equals(reverse))
		{
			System.out.println("This input is Palindrome");
		}

		else
		{
			System.out.println("This input is not Palindrome");
		}
	}
	

}
