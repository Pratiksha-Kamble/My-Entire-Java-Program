package Programs_by_MKT;
class Api_Program
{
	private int age =29;
	private String un ="contact@gmail.com";
	private String pwd ="World@1234";

	public String getUn() 
	{
		return un;
	}
	public void setUn(String un) 
	{
		this.un = un;
	}
	public String getPwd() 
	{
		return pwd;
	}
	public void setPwd(String pwd)
	{
		this.pwd = pwd;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
}
	public class Encapsulation2 
	{

	public static void main(String[] args) {
		
		
		Api_Program ap=new Api_Program();
		ap.setAge(29);
		System.out.println(ap.getAge());
		ap.setUn("pratiksha@gmail.com");
		System.out.println(ap.getUn());
		ap.setPwd("1234");
		System.out.println(ap.getPwd());

	}


}
