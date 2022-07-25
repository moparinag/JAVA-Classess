package Collections;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.add(674);
		s.add(3555);
		s.add("Mona");
		s.add("Vijay");
		s.add("Suyansh");
		s.add('V');
		System.out.println(s);
		s.push(null);
		System.out.println(s.push("Teja"));
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.peek());
		
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
