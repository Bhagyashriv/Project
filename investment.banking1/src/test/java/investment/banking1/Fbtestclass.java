package investment.banking1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Fbtestclass {

	private WebDriver driver;
	 Fblogin loginpage;
	 Fbhomepage homepage;
	
	@BeforeClass
	
	
	public void beforeclass() {
	
		System.out.println("launch the browser and oper url");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nachiket\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	
}
@BeforeMethod
public void beforemethod() throws InterruptedException {
	Fblogin loginpage= new Fblogin(driver);
	loginpage.sendusername("vyawahareminal16@gmail.com");
	Thread.sleep(2000);
	loginpage.sendpass("facribony");
	Thread.sleep(2000);
	loginpage.clicklogin();
	//Thread.sleep(4000);
	//Alert login=driver.switchTo().alert();
	 //login.dismiss();
	
	
	
	
}
	@Test
	public void verifysearchbar() {
		System.out.println("Verify search button");
		Fbhomepage homepage= new Fbhomepage(driver);
		try {
			
		
		homepage.clicksearch();}
		catch(InvalidElementStateException e) {
			System.out.println("Alert was there");
		}
	}
		@Test
		public void verifymessenge() {
			System.out.println("Verify Messenge");
			Fbhomepage homepage= new Fbhomepage(driver);
			homepage.clickmessage();
		}
		@Test
		
		
		public void verifynotificatio() {
			System.out.println("Verify notification");
			Fbhomepage homepage= new Fbhomepage(driver);
			homepage.clicknotify();
		}
		
//		@AfterMethod
//		public void aftermethod() throws InterruptedException {
//			Fbhomepage homepage= new Fbhomepage(driver);
//			homepage.clickacc();
//			Thread.sleep(2000);
//			
//			homepage.clicklogout();
//		}
//		
//		@AfterClass
//		public void afterclass() {
//			driver.close();
//		
	}


	
	
	
	

	