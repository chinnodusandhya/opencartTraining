package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{

	public HomePage(WebDriver driver) {
		super(driver);
		
		
	}
	
	
	//Elements 
		@FindBy(xpath="//span[normalize-space()='My Account']")WebElement lnkmyaccount;
	
	//By lnkmyaccount=By.xpath("//span[normalize-space()='My Account']");
		
		@FindBy(xpath="//a[normalize-space()='Register']")WebElement lnkregister;
		
		@FindBy(xpath="//a[normalize-space()='Login']")WebElement lnklogin;
		
		@FindBy(xpath="//input[@placeholder='Search']")WebElement txtsearch;
		
		@FindBy(xpath="//button[@class='btn btn-default btn-lg']")WebElement lnksearch;
		
		//ActionMethod
		
		public void clickmyacoount() 
		{
			lnkmyaccount.click();
			//driver.findElement(lnkmyaccount).click();
		}
		
		public void clickregister()
		{
			lnkregister.click();
		}
		
		public void clicklogin() 
		{
			lnklogin.click();
		}
		
		public void clicksearch() 
		{
			lnksearch.click();
		}
		
		public void searchproduct(String search) 
		{
			txtsearch.sendKeys(search);
		}

	
	
	
	

}
