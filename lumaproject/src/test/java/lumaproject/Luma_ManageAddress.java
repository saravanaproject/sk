package lumaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Luma_ManageAddress {
	
	WebDriver driver;
	
	public Luma_ManageAddress (WebDriver driver)
	
	{
		this.driver = driver;
	}
	
	By MAdd = By.linkText("Manage Addresses");
    By MStreet = By.xpath("//*[@id='street_1']");
    By MCity = By.xpath("//*[@id='city']");
    By Mtelephone = By.xpath("//*[@id='telephone']");
    By Mregion = By.xpath("//*[@id='region_id']");
    By Mregion_id = By.xpath("//*[@id='region_id']/option[13]");
    By Mzip = By.xpath("//*[@id='zip']");
    By Mcountry = By.xpath("//*[@id=\'country\']");
    By Mcountry_id = By.xpath("//*[@id=\"country\"]/option[236]");
    By Msave = By.xpath("//*[@class='action save primary']");
    
    public void mkadd () throws InterruptedException
 	{
 		driver.findElement(MAdd).click();
 		Thread.sleep(3000);
 	}
     
     public void lEnterstreet () throws InterruptedException
 	{
 		driver.findElement(MStreet).sendKeys("2035 Ninth Street");
 		Thread.sleep(3000);
 	}
     
     public void lEntercity () throws InterruptedException
 	{
 		driver.findElement(MCity).sendKeys("Berkeley");
 		Thread.sleep(3000);
 	}
	
     public void lEntertelephone () throws InterruptedException
  	{
  		driver.findElement(Mtelephone).sendKeys("8870841853");
  		Thread.sleep(3000);
  	}
     
     public void lregion () throws InterruptedException
 	{
 		driver.findElement(Mregion).sendKeys("c");
 		Thread.sleep(3000);
 		driver.findElement(Mregion).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(Mregion).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
 	}
     
     public void lregionid () throws InterruptedException
 	{
 		driver.findElement(Mregion_id).click();
 		Thread.sleep(3000);
 		driver.findElement(Mregion_id).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(Mregion_id).sendKeys(Keys.ENTER);
 	}
     public void lEnterzip () throws InterruptedException
 	{
 		driver.findElement(Mzip).sendKeys("94710");
 		Thread.sleep(3000);
 	}
     public void lcountry () throws InterruptedException
 	{
 		driver.findElement(Mcountry).sendKeys("U");
 		Thread.sleep(3000);
 		driver.findElement(Mcountry).sendKeys(Keys.ARROW_DOWN);
 		driver.findElement(Mcountry).sendKeys(Keys.ENTER);
 		
 	}
     
     public void lcountry_id () throws InterruptedException
  	{
  		driver.findElement(Mcountry_id).click();
  		Thread.sleep(3000);
  		
  	}
     
     public void lsave() throws InterruptedException
  	{
  		driver.findElement(Msave).click();
  		Thread.sleep(3000);
  	}
}


