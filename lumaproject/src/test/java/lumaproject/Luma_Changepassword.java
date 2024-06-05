package lumaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Luma_Changepassword {
	
WebDriver driver;
	
	public Luma_Changepassword (WebDriver driver) 
	
	{
		this.driver = driver;
	}
	
	//Check change Email 
	    By Cdropdown = By.xpath("(//button[@type='button'])[1]");
	    By ClickAccount = By.xpath("//div[@class='panel header']//ul[1]//li[2]//div[1]//ul[1]//li[1]");
		By Cclickedit = By.linkText("Edit");
		By Cclickemail = By.name("change_email");
		By Cchangeemail = By.id("change-password");
		
		//check change password
		By Cclickpsw = By.xpath("//*[@id='change-password']");
		By Ccurrentpsw = By.xpath("//*[@id='current-password']");
		By Cnewpsw = By.xpath("//*[@id=\'password\']");
		By Cconfirmpsw = By.xpath("//*[@id=\'password-confirmation\']");
		By Csavebtn = By.xpath("//button[@class=\'action save primary\']");
		
		public void ckdropdown () throws InterruptedException
		{
			driver.findElement(Cdropdown).click();
			Thread.sleep(4000);
			driver.findElement(Cdropdown).sendKeys(Keys.ARROW_DOWN);
		}
		
		public void ckaccount () throws InterruptedException
		{
			driver.findElement(ClickAccount).click();
			Thread.sleep(4000);
		}
		
		public void ckedit () throws InterruptedException
		{
			driver.findElement(Cclickedit).click();
			Thread.sleep(3000);
		}
		
		public void ckemail () throws InterruptedException
		{
			driver.findElement(Cclickemail).click();
			Thread.sleep(3000);
		}
	 
	 public void ceemail () throws InterruptedException
		{
			driver.findElement(Cchangeemail).sendKeys("sksaranvj@gmail.com");
			Thread.sleep(3000);
		}
	 
	 public void ckpass () throws InterruptedException
		{
			driver.findElement(Cclickpsw).click();
			Thread.sleep(3000);
		}
	 
	 public void ctpsw () throws InterruptedException
		{
			driver.findElement(Ccurrentpsw).sendKeys("Radius1234");
			Thread.sleep(3000);
		}
	 
	 public void npsw () throws InterruptedException
		{
			driver.findElement(Cnewpsw).sendKeys("Radius123");
			Thread.sleep(3000);
		}
	 
	 public void cfsw () throws InterruptedException
		{
			driver.findElement(Cconfirmpsw).sendKeys("Radius123");
			Thread.sleep(3000);
		}
	 
	 public void sbtn () throws InterruptedException
		{
			driver.findElement(Csavebtn).click();
			Thread.sleep(3000);
		}

	}



