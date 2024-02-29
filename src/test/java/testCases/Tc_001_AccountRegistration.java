package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class Tc_001_AccountRegistration extends BaseClass
{

	@Test(groups= {"regression","master"})
	public void test_account_registration() 
	{
		
	logger.info("starting Tc_001_AccountRegistration ");
	logger.debug("capturing debug logs");
	logger.trace("capturing trace logs.......");
			
	HomePage hp=new HomePage(driver);
	
	logger.info("clicking on my account");
	hp.clickmyacoount();
	
	logger.info("clicking on registration");
	hp.clickregister();
	
	AccountRegistationPage accreg=new AccountRegistationPage(driver);
	
	
	logger.info("passing user details");
	accreg.setFirstName(randomeString());
	accreg.setLastName(randomeString());
	accreg.setEmail(randomeString()+"@gmail.com");
	accreg.setTelephone(randomenumber());
	
	String pwd=randomeAlphaNumeric();
	accreg.setPassword(pwd);
	accreg.setConfirmPassword(pwd);
	
	accreg.setPrivatePolocy();
	
	logger.info("clicking on continue");
	accreg.clickcontinue();
	
	
	
	String confirmmsg=accreg.getconfirmationmsg();
	if(confirmmsg.equals("Your Account Has Been Created!")) 
	{
		Assert.assertTrue(true);
	}
	else 
	{
		Assert.fail();
	}
	
	
	}
}
