package Programs_by_MKT;

public class AssertProgram {

	static void add(int a,int b)
	{
		assert a==100;
		int sum=a+b;
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		
		add(11,200);
		String name="";
		assert name.length()>0:"The length is 0 is less";
		System.out.println(name.concat(" Jatin"));

	}

}
