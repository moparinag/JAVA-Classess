package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(67);
		v.add("kavitha");
		v.add(897);
		v.addElement(4664);
		System.out.println(v.capacity());
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
