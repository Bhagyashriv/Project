package investment.banking1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import investment.banking1.Gmailoginpage.Gmailloginpage;

public class Testclass {
	
	private WebDriver driver;
	private Gmailloginpage loginpage;
	

	
	
	@BeforeClass
	public void Beforeclass() {
		System.out.println("launch the browser and oper url");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nachiket\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://accounts.google.com/ServiceLogin/signinchooser?");
	 
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 
	}
	 
	 @BeforeMethod
	 public void beforeclass() throws InterruptedException {
		 Gmailloginpage loginpage=new Gmailloginpage(driver);
		// loginpage.clickanotheracc();
		 //Thread.sleep(2000);
		 loginpage.sendemailid("vyawaharebhagyashri7@gmail.com");
		 
		 loginpage.clicknext1();
		 Thread.sleep(2000);
		 loginpage.sendpassword("Raghav123@DS");
		 Thread.sleep(3000);
		 loginpage.clicknext();
	 
	 }
	 @Test
	 public void verifycomposebutton() throws InterruptedException {
		 System.out.println("Verify compose");
	 Thread.sleep(2000);
	 loginpage.clickcompose();
	 }
	 
	 @Test 
	 public void verifylogicicon() throws InterruptedException {
		 System.out.println("Verify logicon");
		 Thread.sleep(2000);
		 loginpage.clicklogicon();
	 }
	
	 @AfterMethod
	 public void verifylogout() throws InterruptedException {
		 
		 Thread.sleep(2000);
		 loginpage.clicklogout();
		 Thread.sleep(2000);
	 }

		@AfterClass
		public void afterClass()
		{
			driver.close();
		
		}
		
	 
		
		//input[@id='continue']
		//input[@type='password']
		//input[@id='signInSubmit']
		//input[@id='twotabsearchtextbox']
		
		
		
		
	 
	 
	 
	 
	 
}
