package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		List<Object> ll = new LinkedList<Object>();
		ll.add("gautham");
		ll.add(897);
		ll.add(7865);
		ll.add('u');
		ll.add(null);
		LinkedList<Object> ll1=new LinkedList<Object>(ll);
		ll1.add(90);
		ll1.add("mona");
		System.out.println("First Element = "+ll1.getFirst());
		ll1.addFirst(674);
		ll1.add(0, 9090);
		System.out.println(ll1.offerFirst(777));
		Iterator itr = ll1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
