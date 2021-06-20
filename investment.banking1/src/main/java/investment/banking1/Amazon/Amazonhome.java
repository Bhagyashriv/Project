package investment.banking1.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonhome {


	private WebDriver driver;
	
    Actions a=new Actions(driver);
	
	@FindBy (xpath="//input[@id='twotabsearchtextbox']")
	private WebElement Search;
	
	@FindBy (xpath="//span[@class='icp-nav-flag icp-nav-flag-in']")
	private WebElement Flag;
	
	
	
	@FindBy (xpath="//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement Helloacc;
	
	@FindBy (xpath="(//span[@class='nav-text'])[20]")
	private WebElement Logout;
	
	public Amazonhome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendsearch(String search) {
		Search.sendKeys(search);
	}
	public void clickflag() {
	Flag.click();
	}

//	public void clickhelloacc() {
//	//a.moveToElement(Helloacc).perform();
//	Helloacc.click();
//	}

	public void logout() {
		a.moveToElement(Helloacc).perform();
		Logout.click();
	}

	
}
