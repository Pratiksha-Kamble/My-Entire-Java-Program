package Programs_by_MKT;

import java.util.Date;

public class HowToGetPresentTime {

	public static void main(String[] args) {
		
		Date d1=new Date();
		System.out.println(d1);
		
		String input=d1.toString();
		System.out.println(input);
		
		String month=input.substring(4, 7);
		System.out.println(month);
		
		String date=input.substring(8, 10);
		System.out.println(date);
		
		//System.out.println(input.length());
		//String year=input.
		String year=input.substring(input.length()-4);
		//String year=input.substring(24);
		System.out.println(year);
		System.out.println("=======================================================");
		System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));
	}

}
