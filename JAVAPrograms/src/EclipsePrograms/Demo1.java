package EclipsePrograms;

public abstract class Demo1 {
	//Constructor
	  Demo1()
	{
		System.out.println("Constructor of Abstract Class");
	}
	  //argumented Constructor
	  Demo1(int i)
	  {
		  System.out.println("Argumented Constructed in Abstract Class i="+i);
	  }
	//abstract method
abstract void launch();
abstract void close();
// Concrete method
public void open()
{
	
}
}
