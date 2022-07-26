package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		Set hs=new HashSet();
		hs.add("Mona");
		hs.add(null);
		hs.add("Mona");
		hs.add(786);
		//System.out.println(hs);
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
