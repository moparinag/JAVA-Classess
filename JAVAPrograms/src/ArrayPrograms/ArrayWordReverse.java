package ArrayPrograms;

public class ArrayWordReverse {

	public static void main(String[] args) {
		String s="Java is a very easy Language";
		String[] s1=s.split(" ");
		String s3="";
		for(String s2:s1)
		{
			s3=s3+" "+reverse(s2);
		}
		System.out.println(s3);
	}

	private static String reverse(String s2) {
		char[] ch=s2.toCharArray();
		String s="";
		for(int i=ch.length-1;i>=0;i--)
		{
			s=s+ch[i];
		}
		return s;
	}

}
