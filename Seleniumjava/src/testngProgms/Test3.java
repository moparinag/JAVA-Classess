package testngProgms;

import org.testng.annotations.Test;

public class Test3 {
	@Test(priority=0)
	public void M1()
	{
		System.out.println("test3 and m1");
	}
	
	@Test(priority=0,dependsOnMethods="M1")
	public void M2()
	{
		System.out.println("test3 and m2");
	}

}
