package EclipsePrograms;

public class Cast2 extends Cast1{
	public void Cast2()
	{
		System.out.println("cast2 in cast2 class");
	}
	public void cast4()
	{
		System.out.println("Cast4 in cast2 class");
	}

	public static void main(String[] args) {
		Cast1 c1=new Cast2();
		c1.Cast2();
		Cast2 c2=(Cast2)c1;
		c2.cast4();
	}

}
