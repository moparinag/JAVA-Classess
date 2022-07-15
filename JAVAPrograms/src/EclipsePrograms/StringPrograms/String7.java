package EclipsePrograms.StringPrograms;

public class String7 {

	public static void main(String[] args) {
		String s="Java Developer";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
				int n=StringCountCharacter.count(s,c);
				System.out.println(c+"="+n);
				
		}
		System.out.println(s1);
	}

}
