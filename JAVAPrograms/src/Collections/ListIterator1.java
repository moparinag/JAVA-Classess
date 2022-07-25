package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator1 {

	public static void main(String[] args) {
		List al= new ArrayList();
		System.out.println(al.size());
		al.add(45);
		al.add("Java");
		al.add("Gmail");
		al.add(678);
		System.out.println(al.add(345));
		al.add(45.98);
		al.add(null);
		al.add(null);
	ListIterator litr = al.listIterator();
	System.out.println("Print Element in Forward Direction");
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	System.out.println("Print Element in Reverse/Backward Direction");
	while(litr.hasPrevious())

	{
	System.out.println(litr.previous());	
		}
	}

}
