package ArrayPrograms;

public class Array4 {

	public static void main(String[] args) {
		String[] SArr=new String[4];
		SArr[0]="good";
		SArr[1]="Morning";
		SArr[2]="JAVA";
		SArr[3]="Developers";
		System.out.println("Address of String Array"+SArr);
		for(String s:SArr)
		{
			System.out.println(s.charAt(2));
		}
		
	}

}
