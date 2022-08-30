package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CompareMain {

	public static void main(String[] args) {
		//ArrayList al=new ArrayList();
		Set al=new TreeSet();
		al.add(new ComparableImplement(12));
		al.add(new ComparableImplement(10));
		al.add(new ComparableImplement(19));
		//Collections.sort(al);//only for list class
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Object object;
			object=(Object)itr.next();
			ComparableImplement c=(ComparableImplement) object;
			System.out.println(c);
		}
	}

}
