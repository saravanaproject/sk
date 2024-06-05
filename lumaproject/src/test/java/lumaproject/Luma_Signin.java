package lumaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Luma_Signin {
	
WebDriver driver;
	
	public Luma_Signin (WebDriver driver)
	
	{
		this.driver = driver;
	}
	By Ssignin = By.linkText("Sign In");
	By Semail = By.xpath("//*[@id ='email']");
	By Spass = By.name("login[password]");
	By Ssignbutton = By.xpath("//button[@class=\'action login primary\']");
	
	public void url () throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(4000);
	}
	
	public void Chsignin () throws InterruptedException
	{
		driver.findElement(Ssignin).click();
		Thread.sleep(4000);
	}
	
	public void Chenteremail () throws InterruptedException
	{
		driver.findElement(Semail).sendKeys("sarvnaraj@gmail.com");
		Thread.sleep(3000);
	}
	
	public void Chenterpassword () throws InterruptedException
	{
		driver.findElement(Spass).sendKeys("Radius123");
		Thread.sleep(3000);
	}
	
	public void Chclickbutton () throws InterruptedException
	{
		driver.findElement(Ssignbutton).click();
		Thread.sleep(3000);
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
		}

	}


