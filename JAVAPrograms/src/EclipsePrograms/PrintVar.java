package EclipsePrograms;

public class PrintVar {
public void disp(A a)
{
	
	if(a instanceof B)
	{
		B b=(B)a;
		System.out.println("b.y="+b.y);
		System.out.println("b.x="+b.x);
	}
	else if (a instanceof C) {
		C c=(C)a;
		System.out.println("c.z="+c.z);
		System.out.println("c.x="+c.x);
	}
	else if (a instanceof D) {
		D d=(D)a;
		System.out.println("d.m="+d.m);
		System.out.println("d.x="+d.x);
				
	}
	else if(a instanceof A)
	{
	System.out.println("a.x="+a.x);
	}
}
}
