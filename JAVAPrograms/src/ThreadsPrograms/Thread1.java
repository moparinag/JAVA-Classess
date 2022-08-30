package ThreadsPrograms;

public class Thread1 implements Runnable
{

	@Override
	public void run() {
		for(int i=1;i<=300;i++)
		{
			
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(Thread.currentThread().getName()+"Thread1="+i);
	}
	}
}
