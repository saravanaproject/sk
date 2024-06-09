package lumaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Luma_AddCart {
	
	WebDriver driver;
	
	public Luma_AddCart (WebDriver driver)
	
	{
		this.driver = driver;
	}
	
	By Women = By.xpath("//*[@id=\"ui-id-4\"]");
	By Hoodies = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[1]/a");
	By Style = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]");
	By Full = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[1]/a");
	By Size = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]");
	By Sizetype = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/div/div/a[2]/div");
	By Climate = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]");
	By Climatetype = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[1]/a");
	By Colour = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]");
	By Colourwhite = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/div/div/a[3]/div");
	By Eco = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]");
	By Ecocollection = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]");
	By Material = By.xpath("//*[@id=\"narrow-by-list\"]/div[3]/div[1]");
	By Materialtype = By.xpath("//*[@id=\"narrow-by-list\"]/div[3]/div[2]/ol/li[1]/a");
	By Compare = By.xpath("//*[@id=\"maincontent\"]/div[3]/div[3]/div[1]/div[2]/div/div[1]/a");
	By Addcart = By.xpath("//*[@id=\"product-comparison\"]/tbody[1]/tr/td/div[2]/div[1]/form/button/span");
	
	
	public void CWomen () throws InterruptedException
	{
		driver.findElement(Women).click();
		Thread.sleep(3000);
	}
	
	public void CHoodies () throws InterruptedException
	{
		driver.findElement(Hoodies).click();
		Thread.sleep(3000);
	}
	
	public void CStyle () throws InterruptedException
	{
		driver.findElement(Style).click();
		Thread.sleep(3000);
	}
	
	public void CFull () throws InterruptedException
	{
		driver.findElement(Full).click();
		Thread.sleep(3000);
	}
	
	public void CSize () throws InterruptedException
	{
		driver.findElement(Size).click();
		Thread.sleep(3000);
	}

	public void CSizetype () throws InterruptedException
	{
		driver.findElement(Sizetype).click();
		Thread.sleep(3000);
	}

	public void CClimate () throws InterruptedException
	{
		driver.findElement(Climate).click();
		Thread.sleep(3000);
	}

	public void CClimatetype () throws InterruptedException
	{
		driver.findElement(Climatetype).click();
		Thread.sleep(3000);
	}
	
	public void CColour () throws InterruptedException
	{
		driver.findElement(Colour).click();
		Thread.sleep(3000);
	}
	
	public void CColourwhite () throws InterruptedException
	{
		driver.findElement(Colourwhite).click();
		Thread.sleep(3000);
	}
	
	public void CEco () throws InterruptedException
	{
		driver.findElement(Eco).click();
		Thread.sleep(3000);
	}
	
	public void CEcocollection () throws InterruptedException
	{
		driver.findElement(Ecocollection).click();
		Thread.sleep(3000);
	}
	
	public void CMaterial () throws InterruptedException
	{
		driver.findElement(Material).click();
		Thread.sleep(3000);
	}
	public void CMaterialtype () throws InterruptedException
	{
		driver.findElement(Materialtype).click();
		Thread.sleep(3000);
	}
	
	public void CCompare () throws InterruptedException
	{
		driver.findElement(Compare).click();
		Thread.sleep(3000);
	}
	
	public void CAddcart () throws InterruptedException
	{
		driver.findElement(Addcart).click();
		Thread.sleep(3000);
	}
}
