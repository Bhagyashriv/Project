package investment.banking1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Firstpage {

	@FindBy (xpath="//input[@placeholder='Username']")
	private WebElement Username;

@FindBy (xpath="//input[@placeholder='Password']")
private WebElement Password;



@FindBy (xpath="//input[@type='submit']")
private WebElement Submit;

@FindBy (xpath="(//a[@class='nav-link dropdown-toggle text-white'])[1]")
private WebElement Mailus;

@FindBy (xpath="(//a[@Class='nav-link dropdown-toggle text-white'])[3]")
private WebElement Search;

@FindBy (xpath="//div[@class='agile-addresmk settingcss mailuscssheader']")
private WebElement Logout;

public Firstpage(WebDriver driver)
{
	
	PageFactory.initElements(driver, this);
}


public void sendusername(String name) {
	Username.sendKeys(name);
}
public void sendpassword(String pass) {
	Password.sendKeys(pass);
}
	public void clicksubmit() {
		Submit.click();
	}
	public void clickmailus() {
		Mailus.click();
	}
	public void Search() {
		Search.click();
	}
	public void Clicklogout() {
		Logout.click();
	}










	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
