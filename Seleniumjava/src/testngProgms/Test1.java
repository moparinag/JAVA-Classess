package testngProgms;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Test1 {

	@Test(priority=0,groups="Test1")
	public void M1()
	{
		System.out.println("test1 and m1");
	}
	@Test(priority=0,dependsOnMethods="M1",groups={"smoke","Test1"})
	public void M2()
	{
		System.out.println("test1 and m2");
	}
}
