package EclipsePrograms.StringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String s="JAVA DEVELOPER";
		String s1=reverseString(s);
		//REPOLEVED AVAJ
		System.out.println(s1);
	}

	private static String reverseString(String s) {
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			
			s2=s2+s.charAt(i);
		}
		return s2;
	}
	

}
