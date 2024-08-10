package Programs_by_MKT;

public class Manish {
	
	Manish()
	{
		System.out.println("Constructor");
	}
	void add()
	{
		System.out.println("Non Static");
		
	}
	static void sub()
	{
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		
		Manish m1=new Manish();
		Manish m2=new Manish();
		new Manish();
		sub();
		
	}

}
