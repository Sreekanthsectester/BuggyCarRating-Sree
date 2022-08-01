package automationTestSuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import Base.BaseTest;
import org.openqa.selenium.By;


public class AutomationTests extends BaseTest {
	


	
	@Test (priority=0)
	public void VerifyUserCanRegister( ) throws InterruptedException
	{
		
		driver.findElement(By.xpath(locators.getProperty("RegisterButtonXpathLocator"))).click();
		driver.findElement(By.id(locators.getProperty("usernameIDLocator"))).sendKeys(registerdetails.getProperty("username"));				
		driver.findElement(By.id(locators.getProperty("firstNameIDLocator"))).sendKeys(registerdetails.getProperty("firstname"));			
		driver.findElement(By.id(locators.getProperty("lastNameIDLocator"))).sendKeys(registerdetails.getProperty("lastname"));			
		driver.findElement(By.id(locators.getProperty("passwordIDLocator"))).sendKeys(registerdetails.getProperty("password"));			
		driver.findElement(By.id(locators.getProperty("confirmPasswordIDLocator"))).sendKeys(registerdetails.getProperty("confirmpassword"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(locators.getProperty("RegisterPageButtonXpathLocator"))).click();
		Thread.sleep(2000);
		String RegisterSuccessMessage = driver.findElement(By.xpath(locators.getProperty("RegisterSuccessMessageXpathLocator"))).getText();
		
		System.out.println(RegisterSuccessMessage);
		Thread.sleep(3000);
		Assert.assertEquals("Registration is successful", RegisterSuccessMessage);
	}
	
	@Test(priority=1)
	
	public void VerifyUserCanLogin() throws InterruptedException
	{
		
		driver.findElement(By.cssSelector(locators.getProperty("LoginUsername"))).sendKeys(registerdetails.getProperty("username"));
		driver.findElement(By.cssSelector(locators.getProperty("LoginUserpassword"))).sendKeys(registerdetails.getProperty("password"));	
		driver.findElement(By.cssSelector(locators.getProperty("Logibbutton"))).click();
		Thread.sleep(5000);
		String UserName = driver.findElement(By.xpath(locators.getProperty("ProfileName"))).getText();
		System.out.println(UserName);
		Thread.sleep(3000);
		Assert.assertEquals("Hi, "+registerdetails.getProperty("firstname"), UserName);
		
	}
	
	@Test(priority=2)
	
	public void VerifyUserCanUpdateProfile() throws InterruptedException
	{

		Thread.sleep(3000);
		driver.findElement(By.xpath(locators.getProperty("ProfileButton"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(locators.getProperty("Gender"))).sendKeys(registerdetails.getProperty("Gender"));	
		Thread.sleep(3000);
		driver.findElement(By.xpath(locators.getProperty("Age"))).sendKeys(registerdetails.getProperty("Age"));			
		driver.findElement(By.xpath(locators.getProperty("Address"))).sendKeys(registerdetails.getProperty("Address"));			
		driver.findElement(By.xpath(locators.getProperty("Phone"))).sendKeys(registerdetails.getProperty("Phone"));			
		Thread.sleep(5000);
		driver.findElement(By.xpath(locators.getProperty("savebutton"))).click();
		Thread.sleep(5000);
		String UpdateSuccessMessage = driver.findElement(By.xpath(locators.getProperty("UpdateSuccessMessage"))).getText();
				
		System.out.println(UpdateSuccessMessage);
		Thread.sleep(3000);
		Assert.assertEquals("The profile has been saved successful", UpdateSuccessMessage);
	}
	
	
	
	@Test(priority=3)
	
	public void VerifyUserIsAbleToVoteAndComment() throws InterruptedException
	
	{
		//Login the User
		Thread.sleep(5000);
		driver.get("https://buggy.justtestit.org/");
	    Thread.sleep(3000);
		//driver.findElement(By.cssSelector(locators.getProperty("BuggyRating"))).click();
		driver.findElement(By.xpath(locators.getProperty("OverallRating"))).click();
		Thread.sleep(5000);
		//String Rating1 = driver.findElement(By.xpath(locators.getProperty("Rate1"))).getText();
		
			driver.findElement(By.xpath(locators.getProperty("ViewMore"))).click();
		
		Thread.sleep(5000);
		String VoteCountBefore = driver.findElement(By.cssSelector(locators.getProperty("Votecount"))).getText();
		driver.findElement(By.cssSelector(locators.getProperty("Commentbox"))).sendKeys("Love this car!!!");
		driver.findElement(By.cssSelector(locators.getProperty("votebutton"))).click();
		Thread.sleep(5000);
		String SuccessVoteMessage = driver.findElement(By.cssSelector(locators.getProperty("votesuccessmessage"))).getText();
		Thread.sleep(1000);
		String VoteCountAfter = driver.findElement(By.cssSelector(locators.getProperty("Votecount"))).getText();
		System.out.println(VoteCountBefore);
		System.out.println(VoteCountAfter);
		System.out.println(SuccessVoteMessage);
		Assert.assertEquals("Thank you for your vote!", SuccessVoteMessage);
				
	}
	
	@Test(priority = 4)
	public void ViewPopularMakeandModel() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.get("https://buggy.justtestit.org/");
	    Thread.sleep(3000);
		driver.findElement(By.xpath(locators.getProperty("PopularMake"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(locators.getProperty("PopularModel"))).click();
		Thread.sleep(5000);
		String ModelName = driver.findElement(By.xpath(locators.getProperty("ModelName"))).getText();
		Assert.assertEquals("Diablo", ModelName);
	}
	
	

}
