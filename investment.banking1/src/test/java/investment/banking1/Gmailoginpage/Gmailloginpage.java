package investment.banking1.Gmailoginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmailloginpage {

	//@FindBy (xpath="(//div[@class='BHzsHc'])[1]")
	//private WebElement Anotheracc;
	
	
	@FindBy (xpath="(//input[@class='whsOnd zHQkBf'])[1]")
	private WebElement Email;

	@FindBy (xpath="(//span[@class='VfPpkd-vQzf8d'])[1]")
	private WebElement Next1;
	
	@FindBy (xpath="(//input[@class='whsOnd zHQkBf'])[2]")
	private WebElement Password;
	
	@FindBy (xpath="(//span[@class='VfPpkd-vQzf8d'])[2]")
	private WebElement Nextclick;
	
	@FindBy (xpath="//div[@style='user-select: none']")
	private WebElement Compose;
	
	@FindBy (xpath="//a[@class='gb_C gb_Ma gb_h']")
	private WebElement Logicon;
	
	@FindBy (xpath="//a[@class='gb_Cb gb_Tf gb_2f gb_Pe gb_3c']")
	private WebElement Logout;
	
	
	
	public Gmailloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//public void clickanotheracc() {
		//Anotheracc.click();
//	}
	
	public void sendemailid(String email) {
		Email.sendKeys(email);
	}
	
	public void clicknext1() {
		Next1.click();
	}
	
	
	
	public void sendpassword(String pass) {
		Password.sendKeys(pass);
	}
	
	public void clicknext() {
		Nextclick.click();
	}
	
	public void clickcompose
	() {
		Compose.click();
	}
	
		
		public void clicklogicon() {
			Logicon.click();
		}
		public void clicklogout() {
			Logout.click();
		
	}
	
	
	
}
