package Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import investment.banking1.Amazon.Amazonhome;
import investment.banking1.Amazon.Amazonlogin;


public class Testamazon {

	//private static final WebElement Acc = null;
	private WebDriver driver;
	private Amazonlogin login;
	private Amazonhome home;
	
	
	@BeforeClass
	public void Beforeclass() {
		System.out.println("launch the browser and oper url");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nachiket\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.amazon.in");

	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {

	
		Amazonlogin login=new Amazonlogin(driver);
		
		login.clickacoount();
		
		Thread.sleep(2000);
		login.sendemail("9403883515");
		Thread.sleep(2000);
		login.clickcontinue();
		login.sendpass("Bhagyashri@16");
		Thread.sleep(2000);
		login.clicksignin();
		
		
	}
//		catch(NoSuchElementException e)
//		{
//			System.out.println("Not working");
//		}
	
	@Test(enabled=false)
	public void verifysite() {
		
		
		System.out.println("Ok");
	}
	
	@Test(priority=1)
	public void verifysearchbar() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Search is working");
		home=new Amazonhome(driver);
		Thread.sleep(3000);
	home.sendsearch("Search");
	
		
	
	}
	
	
	@Test(enabled=false)
	public void verifyflag() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("Flag is working");
	home=new Amazonhome(driver);
	Thread.sleep(3000);
	home.clickflag();
}
	
	@AfterMethod
	public void aftermethod() throws InterruptedException {
		home=new Amazonhome(driver);
	try {
		
		//home.clickhelloacc();
		
		Thread.sleep(3000);
		home.logout();
		
	}
	catch(NullPointerException e) {
		System.out.println("Null");
	
}
	
	
	}
		@AfterClass
	   public void afterclass() {
			driver.quit();
		}
}
	
		
		
		
		
	
		

		
		
//login=new Amazonlogin(driver);
//Actions s=new Actions(driver);
		
		
	
	