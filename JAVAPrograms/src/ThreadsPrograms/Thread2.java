package ThreadsPrograms;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=300;i++)
		{try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("Thread2="+i);
		}
	}

}
