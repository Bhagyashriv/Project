package investment.banking1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import Suyog.Firstpage;

public class Testclasssuyog {
	private WebDriver driver;
	private Firstpage firstpage;
	
	@BeforeClass
	public void beforeClass()
	{
		
		
		System.out.println("launch the browser and oper url");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nachiket\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
		driver.get("https://shreesuyogvivah.com/login.php");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
		@BeforeMethod
		public void beforeMethod() throws InterruptedException
		{
			firstpage=new Firstpage(driver);
			firstpage.sendusername("9403883515");
			firstpage.sendpassword("raghav26");
			Thread.sleep(2000);
			firstpage.clicksubmit();
			
		}
		
        @Test(priority=1)
		public void verifytasklink() throws InterruptedException {
		System.out.println("Verify mail us button");
		firstpage=new Firstpage(driver);
		Thread.sleep(3000);
		firstpage.clickmailus();
	String url=driver.getCurrentUrl();
		
		if(url.equals("mailto:mail@example.com"))
	{
   System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
}
		
		@Test(dependsOnMethods= {"verifytasklink"})
		public void verifysearchlink() throws InterruptedException {
			Thread.sleep(3000);
			System.out.println("Verify search bar");
			firstpage=new Firstpage(driver);
			Thread.sleep(3000);
			firstpage.Search();
			
			
		}
		
		
		
@AfterMethod
		public void afterMethod() throws InterruptedException
		{
			Thread.sleep(3000);
			firstpage.Clicklogout();
			Thread.sleep(3000);
		}
	
		@AfterClass
		public void afterClass()
		{
			driver.quit();
		
		}
		
		
}
		
		     
	
	
	
	

