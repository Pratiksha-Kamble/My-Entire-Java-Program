package Programs_by_MKT;

public class MethodOverloading {
	
	void add() 
	{
		int a=100;
		System.out.println(a+6);
	}
	void add(int a) 
	{
		
		System.out.println(a+6);
	}

	static void add(double a) 
	{
	
		System.out.println(a+6);
	}
	public static void main(String[] args) {
		
		add(0.09);

	}

}
