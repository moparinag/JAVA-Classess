package ThreadsPrograms;

public class Thread3 extends Thread {
	Thread t;
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Current Thread="+Thread.currentThread().getName());
			System.out.println("i="+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
	

}
