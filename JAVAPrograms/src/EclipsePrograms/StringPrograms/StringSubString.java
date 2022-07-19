package EclipsePrograms.StringPrograms;

public class StringSubString {

	public static void main(String[] args) {
		String s="Java Developer";
		String s1="Java";
		System.out.println(s.replace("Java", "Python"));
		System.out.println(s.substring(5));
		System.out.println(s.substring(1, 7));
		System.out.println(s.contains(s1));
	}
}

