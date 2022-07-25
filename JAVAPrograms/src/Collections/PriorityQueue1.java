package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue<Object> pq=new PriorityQueue<Object>();
		pq.add(12);
		pq.add(3);
		pq.add(5);
		pq.add(1);
		pq.add(2);
		pq.add(4);
		pq.add(10);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		Iterator<Object> itr = pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}