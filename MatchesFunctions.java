package Programs_by_MKT;

public class MatchesFunctions {

	public static void main(String[] args) {
		
		//check whether name Starts with M
		String input="Manish";
		
		System.out.println(input.matches("M(.*)"));
		
		//check whether name ends with h
        String input1="Manish";
		
		System.out.println(input1.matches("(.*)h"));
		
		//Check string contains 5 letters in it
		String ip="Malik";
		
		System.out.println(ip.matches("....."));
		
		//chcek last index of given string
		
		String a1="School";
		int a2=a1.lastIndexOf('o');
		System.out.println(a2);
		
		

	}

}
