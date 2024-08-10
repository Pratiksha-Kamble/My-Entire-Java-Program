package Programs_by_MKT;
class ParentClass
{
	
}
public class Class_TypeCasting extends ParentClass{

	public static void main(String[] args) {
		
		
		//upcasting-->Implicit way
		ParentClass pv=new Class_TypeCasting();
		
		//upcasting-->Explicit way
		ParentClass pv1=(ParentClass) new Class_TypeCasting();
	}

}
