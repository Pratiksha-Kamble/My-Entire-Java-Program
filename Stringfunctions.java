package Programs_by_MKT;

public class Stringfunctions {

	public static void main(String[] args) {
		
		String name="School";
		System.out.println(name.length());
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('c'));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.concat("name is ABC public school"));
		String first_name="Pratiksha";
		String last_name="Kamble";
		System.out.println(first_name.concat("").concat(last_name));
		System.out.println(name.contains("Sch"));
		String name1="Pratiksha Rajesh Kamble";
		System.out.println(name1.contains("Kamble"));
		String title_of_page="           We are here for you online needs         ";
		System.out.println(title_of_page.trim());
		
	}

}
