package EclipsePrograms;

public class MainClass1 
{
	
	public static void main(String[] args)
	{
		int x=3;
		int y=5;
		int z=10;
			System.out.println(++z + y - y + z + x++);

		Interface1 i=new Implemented();
		Implemented im=new Implemented();
		System.out.println(i.s);
		System.out.println(im.s);
		//can't Reinitialize interface Variables
		//i.s=""Deepesh";
	}

}


