package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque1 {

	public static void main(String[] args) {
		Deque aq=new ArrayDeque();
		aq.add("Shyam");
		aq.add("Harish");
		aq.offer("Mona");
		aq.offerFirst("Teja");
		System.out.println(aq);
		//foreach Loop
		for(Object o:aq)
		{
			System.out.println(o);
		}
System.out.println(aq.pollLast());
System.out.println(aq);
	}

}
