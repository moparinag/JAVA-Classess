package EclipsePrograms;

public class FinalWithMethod extends FinalKeyword {
	public final void M2()
	{
		System.out.println("Subclass class Method");
	}
	public void M3()
	{
		System.out.println("Subclass class M3 Method");
	}
	public static void main(String[] args) {
		FinalWithMethod f=new FinalWithMethod();
		f.M1();
		f.M2();
		f.M3();
		FinalKeyword f1=new FinalWithMethod();
		f1.M1();
		f1.M2();
		f1.M3();
		FinalKeyword f3=new FinalKeyword();
		f3.M1();
		f3.M2();
		f3.M3();
		
	}

}
