package ArrayPrograms;

public class Array3 {

	public static void main(String[] args) {
		int[] arr= {45,78,34,23,90,99,234,12,999};
		int bigger=0;
		for(int a:arr)
		{
			if(bigger<a)
			{
				bigger=a;
			}
		}
		System.out.println("Bigger element in Array="+bigger);
	}

}
