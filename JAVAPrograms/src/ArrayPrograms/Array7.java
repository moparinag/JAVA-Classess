package ArrayPrograms;

import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		int[] Arr= {7,9,5,89,6,44,99,53,8,4,2,9};
		//sorted with predefined method sort
		Arrays.sort(Arr);
	for(int a:Arr)
	{
		//System.out.println(a);
	}
	sort(Arr);
	}
//sorted with user defined method 
	private static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}	
			}
			System.out.println(arr[i]);
		}
	}

}
