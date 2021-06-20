package investment.banking1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime1 {

	
	
	@FindBy (xpath="//input[@name='username']")
	private WebElement User;
	
	
	
	@FindBy (xpath="//input[@name='pwd']")
	private WebElement Pass;
	
	@FindBy (xpath="//a[@id='loginButton']")
	private WebElement Login;
	

public Actitime1(WebDriver driver)
{
	
	PageFactory.initElements(driver, this);
}
public void senduser(String user) {
	User.sendKeys(user);
}
public void sendpass(String pass) {
	Pass.sendKeys(pass);
}
public void clicklogin() {
	Login.click();
}
}