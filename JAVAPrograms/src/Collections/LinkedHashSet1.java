package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		Set lhs=new LinkedHashSet();
		lhs.add("Mona");
		lhs.add("Vijay");
		lhs.add("Suyansh");
		lhs.add("Teha");
		lhs.add(null);
		lhs.add("Mona");
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
