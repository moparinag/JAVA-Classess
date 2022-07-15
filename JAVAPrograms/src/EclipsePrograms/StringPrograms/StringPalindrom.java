package EclipsePrograms.StringPrograms;

public class StringPalindrom {

	public static void main(String[] args) {
		System.out.println(isPalindrom("Madam"));
		System.out.println(isPalindrom("dxfvdsf"));
		
	}
	public static boolean isPalindrom(String s)
	{
		int n=s.length();
		s=s.toLowerCase();
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)!=s.charAt(n-i-1))
			{
				return false;
			}
		}
		return true;
	}

}
