package testngProgms;

import org.testng.annotations.Test;

public class Test2 {
	@Test(priority=0,groups={"smoke","Test2"})
	public void M1()
	{
		System.out.println("test2 and m1");
	}
	
	@Test(priority=0,dependsOnMethods="M1",groups= {"Regression","Test2"})
	public void M2()
	{
		System.out.println("test2 and m2");
	}

}
