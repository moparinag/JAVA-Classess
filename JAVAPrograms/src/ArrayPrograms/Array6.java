package ArrayPrograms;

public class Array6 {

	public static void main(String[] args) {
		int[] Arr= {4,5,7,3,98,9,456,3,56,23,9,67,90,9,78,56,43};
		System.out.println(linearSearch(Arr, 9));
	}
	public static int linearSearch(int[] Arr,int ele)
	{
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]==ele)
			{
				return i+1;
			}
		}
		return -1;
		
	}

}
