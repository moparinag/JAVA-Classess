package EclipsePrograms;

import java.io.PrintStream;

public class StatNonStat {
	static int m=100;
	int n;
	String s1;

	public void Demo()
	{
		s1="Teja";
		System.out.println("m="+m);
		System.out.println("n="+n);
		System.out.println(s1);
	}
	public static void Demo1(StatNonStat s)
	{
		s.s1="Laxmi";
		System.out.println(s.s1);
		System.out.println("m1="+m);
	}
	public static void main(String[] args) {
		StatNonStat s=new StatNonStat();
		s.s1="Mona";
		System.out.println(s.s1);
s.Demo();
Demo1(s);
	}

}