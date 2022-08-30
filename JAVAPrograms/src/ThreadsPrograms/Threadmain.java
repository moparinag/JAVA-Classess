package ThreadsPrograms;

public class Threadmain {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		Thread th1=new Thread(t1);
		th1.setName("dinga");
		Thread th2=new Thread(t1);
		th2.setName("dingi");
		th1.start();
		th2.start();
	}

}
