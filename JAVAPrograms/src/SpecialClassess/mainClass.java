package SpecialClassess;

public class mainClass {

	public static void main(String[] args) {
	SingletonClass s1	=SingletonClass.get_object();
	SingletonClass s2=SingletonClass.get_object();
	SingletonClass s3=SingletonClass.get_object();
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
		
	}

}
