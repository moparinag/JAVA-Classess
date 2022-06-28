package EclipsePrograms;

public class FinalKeyword {
	//Final Keyword with Variable can't be Reinitialized
	public final String filename="H://javatopic.txt";

	//Final Method cannot Override in Subclass
	public final void M1()
	{
		System.out.println("Super class Final Method");
	}
	public void M2()
	{
		System.out.println("Superclass class Method");
	}
	public void M3()
	{
		System.out.println("Superclass class M3 Method");
	}
	
	public static void main(String[] args) {
		FinalKeyword f=new FinalKeyword();
		System.out.print(f.filename);
	}

}
