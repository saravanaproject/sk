package lumaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Luma_Add_Newaddress {
	
	WebDriver driver;
	
	public Luma_Add_Newaddress(WebDriver driver) 
	{
		this.driver = driver;
	}
		
		By Nadd = By.xpath("//*[@id='block-collapsible-nav']/ul/li[6]/a");
		By Nnew = By.xpath("//*[@id='maincontent']/div[2]/div[1]/div[5]/div[1]/button");
		By NStreet = By.xpath("//*[@id='street_1']");
	    By NCity = By.xpath("//*[@id='city']");
	    By Ntelephone = By.xpath("//*[@id='telephone']");
	    By Nregion = By.xpath("//*[@id='region_id']");
	    By Nregion_id = By.xpath("//*[@id='region_id']/option[13]");
	    By Nzip = By.xpath("//*[@id='zip']");
	    By Ncountry = By.xpath("//*[@id=\'country\']");
	    By Ncountry_id = By.xpath("//*[@id=\"country\"]/option[236]");
	    By Nsave = By.xpath("//*[@class='action save primary']");
		
	    public void nadd () throws InterruptedException
	 	{
	 		driver.findElement(Nadd).click();
	 		Thread.sleep(3000);
	 	}
	    
	    public void nnew () throws InterruptedException
	 	{
	 		driver.findElement(Nnew).click();
	 		Thread.sleep(3000);
	 	}
	     
	     public void nenterstreet () throws InterruptedException
	 	{
	 		driver.findElement(NStreet).sendKeys("4035 Minth East Street");
	 		Thread.sleep(3000);
	 	}
	     
	     public void nentercity () throws InterruptedException
	 	{
	 		driver.findElement(NCity).sendKeys("California");
	 		Thread.sleep(3000);
	 	}
		
	     public void nentertelephone () throws InterruptedException
	  	{
	  		driver.findElement(Ntelephone).sendKeys("8870841853");
	  		Thread.sleep(3000);
	  	}
	     
	     public void nregion () throws InterruptedException
	 	{
	 		driver.findElement(Nregion).sendKeys("c");
	 		Thread.sleep(3000);
	 		driver.findElement(Nregion).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Nregion).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
	 	}
	     
	     public void nregionid () throws InterruptedException
	 	{
	 		driver.findElement(Nregion_id).click();
	 		Thread.sleep(3000);
	 		driver.findElement(Nregion_id).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Nregion_id).sendKeys(Keys.ENTER);
	 	}
	     public void nenterzip () throws InterruptedException
	 	{
	 		driver.findElement(Nzip).sendKeys("95719");
	 		Thread.sleep(3000);
	 	}
	     public void ncountry () throws InterruptedException
	 	{
	 		driver.findElement(Ncountry).sendKeys("U");
	 		Thread.sleep(3000);
	 		driver.findElement(Ncountry).sendKeys(Keys.ARROW_DOWN);
	 		driver.findElement(Ncountry).sendKeys(Keys.ENTER);
	 		
	 	}
	     
	     public void ncountry_id () throws InterruptedException
	  	{
	  		driver.findElement(Ncountry_id).click();
	  		Thread.sleep(3000);
	  		
	  	}
	     
	     public void nsave() throws InterruptedException
	  	{
	  		driver.findElement(Nsave).click();
	  		Thread.sleep(3000);
	  	}
		
}
