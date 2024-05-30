package lumaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Luma_Createaccount 

{
	
	WebDriver driver;
	 
	 public Luma_Createaccount(WebDriver driver)
	 
	 {
		 this.driver=driver;
	 }
	
	 By Lcaccount = By.linkText("Create an Account");
	 By Lfname = By.name("firstname");
	 By Llname = By.id("lastname");
	 By Lemail = By.xpath("//*[@id='email_address']");
	 By Lpassword = By.xpath("//*[@id='password']");
	 By Lcpassword = By.xpath("//*[@id='password-confirmation']");
	 By Lcreatebutton = By.xpath("//button[@class=\"action submit primary\"]");
	 By Lsuccess = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");
	
	 
	 public void url () throws InterruptedException
		{
			driver.get("https://magento.softwaretestingboard.com/");
			Thread.sleep(4000);
		}
	 
	 public void creataccount () throws InterruptedException
		{
			driver.findElement(Lcaccount).click();
			Thread.sleep(3000);
		}
	 
	 public void firstname () throws InterruptedException
		{
			driver.findElement(Lfname).sendKeys("Saran");
			Thread.sleep(3000);
		}
	 
	 public void lastname () throws InterruptedException
		{
			driver.findElement(Llname).sendKeys("Raj");
			Thread.sleep(3000);
		}
	 
	 public void enteremail () throws InterruptedException
		{
			driver.findElement(Lemail).sendKeys("sarvnaraj2@gmail.com");
			Thread.sleep(3000);
		}
	 
	 public void enterpassword () throws InterruptedException
		{
			driver.findElement(Lpassword).sendKeys("Radius123");
			Thread.sleep(3000);
		}
	 
	 public void confirmpassword () throws InterruptedException
		{
			driver.findElement(Lcpassword).sendKeys("Radius123");
			Thread.sleep(3000);
		}
	 
	 public void createanaccount () throws InterruptedException
		{
			driver.findElement(Lcreatebutton).click();
			Thread.sleep(3000);
		}
	 
	 public void csuccessmessage () throws InterruptedException
		{
			WebElement csuccessmessage = driver.findElement(Lsuccess);
            Thread.sleep(3000);
            
            String actualmessage = csuccessmessage.getText();
            String expectedmessage = "Thank you for registering with Main Website Store.";
            
            if (actualmessage.equals(expectedmessage)) {
            	System.out.println("Success Message : " + actualmessage);
            }
            
            if (!actualmessage.contains("Thank you for registering with Main Website Store"));
            		{
            	Assert.fail("Success message verification failed. Actual message: " + actualmessage);
            }
	}


}
 

