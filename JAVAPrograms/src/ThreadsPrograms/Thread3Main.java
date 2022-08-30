package ThreadsPrograms;

public class Thread3Main {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		Thread3 t1=new Thread3();
		t1.setName("Dinga");
		System.out.println(t1.getName());
		t1.start();
		Thread3 t2=new Thread3();
		t2.setName("Dingi");
		System.out.println(t2.getName());
		t2.start();
		
	}

}
