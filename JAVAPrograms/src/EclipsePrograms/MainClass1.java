package EclipsePrograms;

public class MainClass1 {

	public static void main(String[] args) {
		Interface1 i=new Implemented();
		Implemented im=new Implemented();
		System.out.println(i.s);
		System.out.println(im.s);
		//can't Reinitialize interface Variables
		//i.s=""Deepesh";
	}

}
