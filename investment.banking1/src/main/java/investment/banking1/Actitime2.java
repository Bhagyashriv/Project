package investment.banking1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime2 {

	@FindBy (xpath="//a[@href='/tasks/otasklist.do']")
	private WebElement Task;
	
	@FindBy (xpath="//a[@href='/reports/reports.do']")
	private WebElement Report;
	
	
	
	@FindBy (xpath="//a[@href='/logout.do']")
	private WebElement Logout;
	
	public Actitime2(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void clicktask() {
		Task.click();
	}
	
	public void clickReport() {
		Report.click();
		
	}
	public void clicklogout() {
		Logout.click();
	}
}
