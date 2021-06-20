package investment.banking1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testclassdemo {

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class");
	}
	
	@BeforeMethod
	
	public void beforemethod()
	{
		System.out.println("before Method");
	}
	
	
	@Test(priority = 5, invocationCount=3)
	public void Test1() {
		System.out.println("Print1");
	}
	
	@Test(enabled = false)
	public void Test2() {
		System.out.println("Print2");
	}
		
		@Test(dependsOnMethods = {"Test1"})
				public void Test3() {
					System.out.println("Print3");
				}
				
				@Test
				public void Test4() {
					System.out.println("Print4");
				}
				
@AfterMethod
public void aftemethod() {
				System.out.println("aftermethod");
}

@AfterClass
public void afterclass() {
	System.out.println("Afterclas");
}






				
				
}
