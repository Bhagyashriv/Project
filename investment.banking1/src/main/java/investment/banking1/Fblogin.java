package investment.banking1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fblogin {

@FindBy (xpath="//input[@class='inputtext _55r1 _6luy']")
private WebElement Username;

@FindBy (xpath="//input[@class='inputtext _55r1 _6luy _9npi']")
private WebElement Password;


@FindBy (xpath="//button[@name='login']")
private WebElement Login;



public Fblogin(WebDriver driver)
{
	
	PageFactory.initElements(driver, this);
}
		public void sendusername(String name) {
			Username.sendKeys(name);
		}
		public void sendpass(String pass) {
			Password.sendKeys(pass);}
		
		public void clicklogin() {
			Login.click();
		}
			
			
			
		}
		
		
				
						
						