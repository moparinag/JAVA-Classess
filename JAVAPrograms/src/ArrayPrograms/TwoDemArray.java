package ArrayPrograms;

public class TwoDemArray {

	public static void main(String[] args) {
		int [][] arr=new int[2][2];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
		arr[1][1]=40;
		for(int[] a:arr)
		{
			for(int b:a)
			{
				System.out.println(b);
			}
		}
	}

}
