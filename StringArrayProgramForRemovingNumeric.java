package Programs_by_MKT;

public class StringArrayProgramForRemovingNumeric {

	public static void main(String[] args) {
		
		//Replace o with spaces
		String input="school123";
	
		String str=input.replace('o', ' ');
		
		System.out.println(str);
		
		//Replace o with m
		String str1=input.replace('o', 'm');
		
		System.out.println(str1);
		
		//Remove all alphabets from given input
		String str3=input.replaceAll("[a-z]"," ");
		
		System.out.println(str3);
		
		//Remove all numeric from given input
        String str4=input.replaceAll("[0-9]"," ");
		
		System.out.println(str4);
		
		//How to remove Capital letters from given input
		
		String ip="School123";
		
		String str5=ip.replaceAll("[A-Z]", "");
		
		System.out.println(str5);
	}

}
