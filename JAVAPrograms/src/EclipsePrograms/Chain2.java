package EclipsePrograms;

public class Chain2 extends Chain1{
	Chain2()
	{
		System.out.println("Chain2 Default Constructor");
	}
Chain2(int a)
{
	//super(a);
	System.out.println(a);

	System.out.println("Chain2 Constructor");
}
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Chain2 c1=new Chain2();
		Chain2 c=new Chain2(200);
		System.out.println("Main Ends");
	}

}
