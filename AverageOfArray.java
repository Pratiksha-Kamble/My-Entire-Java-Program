package Programs_by_MKT;

public class AverageOfArray {

	static double average=0;
	static int sum=0;
	static int reminder=0;
	
	public static void main(String[] args) {
		
		int number[]=new int[4];
		number[0]=41;
		number[1]=41;
		number[2]=41;
		number[3]=41;
		
		for(int i=0;i<number.length;i++) 
		{
			sum=sum+number[i];
			average=sum/number.length;
			reminder=sum%(number.length);
			
		}
		System.out.println("Sum of no"+sum);
		System.out.println("Average of nos"+average);
		System.out.println("Reminder is "+reminder);
	}

}
