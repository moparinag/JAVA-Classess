package EclipsePrograms.StringPrograms;

public class StringProgram1 {
	public static void main(String[] args) 
	{
		String s="dgdfhf";
		String ss=new String("dgdfhf");
		String s1=new String("dfdgdg");
String s2="dgdfhf";
		StringProgram1 p=new StringProgram1();
		System.out.println(s1.toString()+"  "+s.toString());
		System.out.println(s==s1);
		System.out.println(s==s2);//compare object address
		System.out.println(s.equals(s2));//compare String value
		System.out.println(s==ss);
	}

}
