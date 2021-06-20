package investment.banking1.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonlogin {
  
    
	@FindBy (xpath="//span[@class='nav-line-2 ']")
	private WebElement Acc;
	
	
	
	@FindBy (xpath="//input[@id='ap_email']")
	private WebElement Email;
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement Continue;
	
	
	@FindBy (xpath="//input[@type='password']")
	
	private WebElement Password;
	
	@FindBy (xpath="//input[@class='a-button-input']")
	private WebElement Signin;
	
	
	
public Amazonlogin(WebDriver driver)
{
	//this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void clickacoount() {
Acc.click();
}

public void sendemail(String mail ) {
	Email.sendKeys(mail);
}
public void clickcontinue() {
	Continue.click();
}
public void sendpass(String passs) {
	Password.sendKeys(passs);
}
public void clicksignin() {
	Signin.click();
}


}








