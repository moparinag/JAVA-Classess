package Collections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeProgram1 {

	public static void main(String[] args) {
Deque dq=new LinkedList();
Deque dq1=new LinkedList();

dq.offer("567");
dq.offer("789");
dq.offer("4546.34325");
dq.offer(54333);
System.out.println(dq.add(null));
System.out.println(dq);
System.out.println(dq.offerFirst("hi Hello"));
System.out.println(dq1.poll());
System.out.println(dq);
System.out.println(dq.pop());
System.out.println(dq);
	System.out.println(dq.peek());
	System.out.println(dq);
	}

}
