package investment.banking1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbhomepage {

	@FindBy (xpath="//input[@placeholder='Search Facebook']")
	private WebElement Search;

	@FindBy (xpath="(//div[@aria-label='Messenger'])[1]")
	private WebElement Message;

	@FindBy (xpath="//a[@aria-label='Notifications']")
	private WebElement Notify;

	@FindBy (xpath="(//div[@aria-label='Account'])[1]")
	private WebElement Account;

	@FindBy (xpath="//div[@data-visualcompletion='ignore-dynamic'])[6]")
	private WebElement Logout;
	
	public Fbhomepage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	public void clicksearch() {
		Search.click();
	}
	public void clickmessage() {
		Message.click();
	}
	public void clicknotify() {
		Notify.click();
	}
	public void clickacc() {
		Account.click();
	}
	public void clicklogout() {
		Logout.click();
	}
}
<class name="investment.banking1.Testclassdemo"/>
