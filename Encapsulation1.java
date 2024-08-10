package Programs_by_MKT;
class Amazon_Application
{
	private String un="contact@grotechminds.com";
	
	public String getUn()
	{
		return un;
	}
	public void setUn(String un)
	{
		this.un=un;
	}
}
public class Encapsulation1 {

	public static void main(String[] args) {
		
		Amazon_Application aa=new Amazon_Application();
		aa.setUn("pratikshakamble@gmail.com");
		System.out.println(aa.getUn());
		
		
		

	}

}
