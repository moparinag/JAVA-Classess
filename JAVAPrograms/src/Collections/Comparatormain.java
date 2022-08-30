package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Comparatormain {

	public static void main(String[] args) {
		List ts=new ArrayList();
		ts.add(new Student(123,"Mona","67.45"));
		ts.add(new Student(345,"Vijay","54.89"));
		ts.add(new Student(67,"Suyansh","89.56"));
		Collections.sort(ts,new SortMarks());
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			Object object;
			object=(Object)itr.next();
			Student c=(Student) object;
			System.out.println(c);
		}
	}

}
