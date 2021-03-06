package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		List al= new ArrayList();
		System.out.println(al.size());
		al.add(45);
	al.add("Java");
	al.add("Gmail");
	al.add(678);
	al.add(45.98);
	al.add(null);
	System.out.println(al);
	al.add(null);
	System.out.println(al.size());
	//forEach Loop Iteration
	System.out.println("//ForEach Loop Iterator//");
	for(Object o:al)
	{
		System.out.println(o);
	}
	//forLoop Iterator
	System.out.println("//for Loop Iterator//");
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
	//Iterator Methor of Iterable Interface
	System.out.println("//Iterator Method of Iterable Interface//");
	Iterator itr = al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
		itr.remove();
	}
	System.out.println(al);
	}

}
