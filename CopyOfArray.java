package Programs_by_MKT;

import java.util.Arrays;

public class CopyOfArray {

	

	public static void main(String[] args) {
		
		
		String name[]=new String[4];
		name[0]="Ram";
		name[1]="Sita";
		name[2]="Deepika";
		name[3]="Pratiksha";
		String[] namecopy=new String[name.length];
		
		for(int i=0;i<name.length;i++)
		{
			namecopy[i]=name[i];
		}
		System.out.println(Arrays.toString(name));
		
		for(int j=namecopy.length-1;j>=0;j--)
		{
			
			namecopy[j] = name[name.length - 1 - j];
			
			
		    
			
		}
		
		System.out.println(Arrays.toString(namecopy));
		
		
	
		
		
	}

	
}
