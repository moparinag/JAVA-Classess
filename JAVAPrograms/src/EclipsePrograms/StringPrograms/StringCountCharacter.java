package EclipsePrograms.StringPrograms;

public class StringCountCharacter {

	public static void main(String[] args) {
		String s="JAVA DEVELOPER";
		int count=count( s,'o');
		System.out.println(count);
		System.out.println(s.indexOf('j'));
	}

	static int count(String s, char c) {
		
		return s.length()-s.replace(c+"", "").length();
	}

}
