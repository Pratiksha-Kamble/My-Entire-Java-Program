package Programs_by_MKT;

public class DigitChecker {

	
		
	    public static void main(String[] args) 
	    {
	        String input = "123456";

	        boolean result = containsOnlyDigits(input);

	        System.out.println("Does the string contain only digits? " + result);
	    }

	    public static boolean containsOnlyDigits(String str) 
	    {
	        for (int i = 0; i < str.length(); i++) 
	        {
	            if (!Character.isDigit(str.charAt(i))) 
	            {
	                return false;
	            }
	        }
	        return true;
	    }
	}


	


