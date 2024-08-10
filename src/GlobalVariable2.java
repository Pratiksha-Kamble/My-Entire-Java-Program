package Programs_by_MKT;

public class GlobalVariable2 {
	
	String name="Sita";
	int age=19;
	double weight=90.87;
	void add(String name,int age,double weight)
	{
		System.out.println("My biodata is"   +  name  +  age  + weight);
	}

	public static void main(String[] args) {
		
		GlobalVariable2 g2=new GlobalVariable2();
		System.out.println(g2.name);
		System.out.println(g2.age);
		g2.add("ram", 52, 87.98);

	}

}
