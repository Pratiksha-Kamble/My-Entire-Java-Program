package Programs_by_MKT;

public class StudentNames {

	public static void main(String[] args) {
		
		String names[]=new String[3];
		names[0]="Jyoti";
		names[1]="Pratiksha";
		names[2]="Madhuri";
		
		int rollno[]=new int[3];
		rollno[0]=12;
		rollno[1]=14;
		rollno[2]=67;
		
		System.out.println("names"+" "+"rollno");
		
		for (int i=0;i<3;i++)
		{
			System.out.println(names[i]+rollno[i]);
		}
	}

}
