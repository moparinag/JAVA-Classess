package EclipsePrograms;

public class Edge extends Demo1 {
Edge()
{
	super(10);
	System.out.println("Edge Class Constructor");
}
	@Override
	void launch() {
		System.out.println("Edge Launch");
	}

	@Override
	void close() {
		System.out.println("Edge Close");
	}

}
