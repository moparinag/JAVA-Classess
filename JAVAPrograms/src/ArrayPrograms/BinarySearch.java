package ArrayPrograms;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] Arr= {7,8,9,10,75,78,86,93,98,190,199};
		System.out.println(BinarySearchArray(Arr, 190));
		System.out.println(BinarySearchArray(Arr, 7));

	}

	private static int BinarySearchArray(int[] arr, int ele) {
	int length=arr.length;
	int f=0;
	int m;
	int l=length-1;
	while(f<l)
	{
		m=(f+l)/2;
		if(arr[m]==ele)
		{
			return m;
		}else if(arr[m]>ele)
		{
			l=m-1;
		}
		else
		{
			f=m+1;
		}
	}
	return -1;
	}

}
