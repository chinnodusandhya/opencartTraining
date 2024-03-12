package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class Tc__004_searchProduct extends BaseClass
{
	@Test
	public void search_product() throws InterruptedException 
	{
		HomePage hp= new HomePage(driver);
		
		hp.searchproduct("imac");
		hp.clicksearch();
		
		WebElement imac=driver.findElement(By.xpath("//a[normalize-space()='iMac']"));
		Thread.sleep(2000);
		
		if(imac.isDisplayed()) 
		{
			Assert.assertTrue(true);
		}
		
		else 
		{
			Assert.assertTrue(false);
		}
		
		
	}

}
