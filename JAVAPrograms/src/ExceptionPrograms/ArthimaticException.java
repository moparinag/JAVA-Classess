package ExceptionPrograms;

public class ArthimaticException {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int div;
		try
		{
			div=a/b;
		}
		catch(Exception e)
		{
			System.out.println("Arthematic Exception");
			e.printStackTrace();
			System.out.println("Exceptionjsdjc");
		}
	}

}
