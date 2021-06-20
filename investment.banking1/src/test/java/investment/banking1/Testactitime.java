package investment.banking1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testactitime {

	private WebDriver driver;
	private Actitime1 login;
	private Actitime2 home;
	
	@BeforeClass
	public void beforeclss()
	{
		System.out.println("Launch url");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nachiket\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://localhost/login.do");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void beforemethod() throws InterruptedException {
		login = new Actitime1(driver);
		login.senduser("admin");
		Thread.sleep(2000);
		login.sendpass("manager");
		Thread.sleep(2000);
		login.clicklogin();
	}
	@Test
	public void verifytasklink() throws InterruptedException {
		System.out.println("Verify task");
		home = new Actitime2(driver);
		Thread.sleep(3000);
		home.clicktask();
		String url = driver.getCurrentUrl();
		//Assert.assertEquals(url,"http://localhost/tasks/otasklist.do");
		
		
		//Assert.assertNotEquals(url,"http://localhost/tasks/otasklist.do");
		
		boolean result=url.equals("http://localhost/tasks/otasklist.do");
		Assert.assertTrue(result);
		//Assert.assertFalse(result, "not matching");
		//Assert.fail();
		
		Assert.assertFalse(result, "not matching");

		//if(url.equals("http://localhost/tasks/otasklist.do")) {
		//System.out.println("pass");
	//}
	////else {
		
		//System.out.println("fail");
	//}
		}
	
	@Test
	public void verifyreportlink() throws InterruptedException {
	System.out.println("Verify report");
	home=new Actitime2(driver);
	Thread.sleep(3000);	
	home.clickReport();
	String url1=driver.getCurrentUrl();
	
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(url1, "http://localhost/reports/reports.do");
	Assert.assertNotEquals("velocity","velocit;");
	System.out.println("test done");
	soft.assertAll();
	
	
	//if(url1.equals("http://localhost/reports/reports.do")) {
		//System.out.println("pass");
		//}
		//else {
			
			//System.out.println("fail");
		//}
	
	
	}
	@AfterMethod
	public void aftermethod() throws InterruptedException {
		Thread.sleep(3000);
		home.clicklogout();
		Thread.sleep(3000);
	
	}
	
			@AfterClass
			public void afterclass() {
				driver.close();
			}
			
			
			
			
			
			
		
		
		
	}
	
	

