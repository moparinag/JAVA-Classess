package EclipsePrograms;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Constructor parameter");
		int l=s.nextInt();
		int b=s.nextInt();
		int h=s.nextInt();
	Box box=new Box(l);
	System.out.println("Display single parameter Constructor values  "+box.Display());
	Box box1=new Box(l,b,h);
	System.out.println("Display all parameter of Constructor values "+box1.Display());
	Box box2=new Box();
	System.out.println("Display default constructor values"+box2.Display());
	}

}
