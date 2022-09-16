package testngProgms;

import org.testng.annotations.Test;

public class Test4 {
	@Test(priority=0)
	public void M1()
	{
		System.out.println("test4 and m1");
	}
	
	@Test(priority=0,dependsOnMethods="M1")
	public void M2()
	{
		System.out.println("test4 and m2");
	}

}
