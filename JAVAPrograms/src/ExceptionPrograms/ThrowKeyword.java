package ExceptionPrograms;

public class ThrowKeyword {
	public static void Validate(int age) throws Fileread
	{if(age<18)
	{
		throw new Fileread("Person file not found and not eligible");
		//throw new ArithmeticException("Person is not eligible");
	
 
	}
	else
	{
		System.out.println("Eligible");
	}
		
	}

	public static void main(String[] args) {
		try {
			ThrowKeyword.Validate(10);
		} catch (Fileread e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		//ThrowKeyword.Validate(30);
	}

}
