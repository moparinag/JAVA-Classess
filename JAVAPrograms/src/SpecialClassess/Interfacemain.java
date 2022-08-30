package SpecialClassess;

public class Interfacemain implements Interface1 {

	 public static void main(String[] args)
	 {
		 Interface1 i2=new Interfacemain();
		 Interface1 i=new Interface1() {
			
			@Override
			public void m1() {
				System.out.println("over ridden abstract method");
			}
		/*	public void m2()
			{
				System.out.println("implementing m2 in anonymous class");
			}*/
		};
		i.m1();
		i.m2();
		i2.m2();
		i2.m1();
	 }

	@Override
	public void m1() {
		System.out.println("m1 of implementation class");
	}
}
