package Programs_by_MKT;

import java.util.Arrays;

public class Split_Program {

	//WAP to split given String if they having Spaces
	public static void main(String[] args) {
		
		String a1="My name is manish";
		
		String arr[]=a1.split(" ");
		
		System.out.println(Arrays.toString(arr));
		
		//Split with M
        String a2="My name is manish";
		
		String arr1[]=a1.split("M");
		
		System.out.println(Arrays.toString(arr1));

		
	}

}
