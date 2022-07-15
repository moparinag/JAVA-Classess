package EclipsePrograms.StringPrograms;

public class StringBuilderChangeCase {

	public static void main(String[] args) {
		String s="Java Developer";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='A'&&c<='Z')
			{
				sb.append(Character.toLowerCase(c));
			}
			else
			{
				sb.append(Character.toUpperCase(c));
			}
		}
		System.out.println(sb);
	}

}
