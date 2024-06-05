package lumaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Luma_Editbillingaddress {
	
	WebDriver driver;
	
	public Luma_Editbillingaddress(WebDriver driver) {
		
		this.driver = driver;
	}
		
		By Eedit = By.xpath("//*[@id='additional-addresses-table']/tbody/tr/td[9]/a[1]");
		By Echeckbox = By.xpath("//*[@id='form-validate']/fieldset[2]/div[6]/label");
	    By Esave = By.xpath("//*[@id='form-validate']/div/div[1]/button");
	    
	    public void edit () throws InterruptedException
	 	{
	 		driver.findElement(Eedit).click();
	 		Thread.sleep(3000);
	 	}
	    
	    public void echeckbox () throws InterruptedException
	 	{
	 		driver.findElement(Echeckbox).click();
	 		Thread.sleep(3000);
	 	}
	    
	    public void esave () throws InterruptedException
	 	{
	 		driver.findElement(Esave).click();
	 		Thread.sleep(3000);
	 	}
	    
	}
	
	


