package Collections;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		SortedSet ts=new TreeSet();
		ts.add("Mona");
		ts.add("Teja");
		ts.add("Vijay");
		ts.add("Suyansh");
		//ts.add(null);(NullPointerException)
	Iterator itr = ts.iterator();	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("......HeadSet.....");
	System.out.println(ts.headSet("Mouli"));
	System.out.println(".....TailSet.....");
	System.out.println(ts.tailSet("Sravanthi"));
	}

}
