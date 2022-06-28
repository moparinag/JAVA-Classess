package EclipsePrograms;

public class Super2 extends Super1{
	public void Test2()
	{
		int i=4645757;
		System.out.println(i);
		System.out.println(super.i);
		super.Test1();
	}
	public static void Test3()
	{
		super.Test1();
	}
	public static void main(String[] args) {
		Super2 s=new Super2();
		s.Test2();
	}

}
