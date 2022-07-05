package EclipsePrograms.StringPrograms;

public class StringRemoveRepeat {

	public static void main(String[] args) {
	String s="JAVA DEVELOPER";
	String s1="";
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(s1.indexOf(c)==-1)
		{
			s1=s1+c;
		}
	}
	System.out.println("Unique Letters = "+s1);
	}

}
