package lumaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Luma_AddCart {
	
WebDriver driver;
	
	public Luma_AddCart (WebDriver driver)
	
	{
		this.driver = driver;
	}
	
	By Women =By.xpath("//*[@id=\"ui-id-4\"]/span[2]");
	By Hoodies = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[1]/a");
	By Style = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]");
	By Full = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[1]/a");
	By Size = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]");
	By Sizetype = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/div/div/a[2]/div");
	By Climate = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]");
	By Climatetype = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[6]/a");
	By Colour = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]");
	By Colourtype = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/div/div/a[5]/div");
	By Eco = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]");
	By Ecotype = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li");
	By Material = By.xpath("//*[@id=\"narrow-by-list\"]/div[3]/div[1]");
	By Materialtype =By.xpath("//*[@id=\"narrow-by-list\"]/div[3]/div[2]/ol/li[4]/a");
	By Addcart = By.xpath("//*[@id=\"wishlist-sidebar\"]/li/div/div/div[2]/div[1]/button/span");
	By Updatewishlist = By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[5]/div/a[1]/span");
	By Addtoall = By.xpath("//*[@id=\"wishlist-view-form\"]/div[2]/div[1]/button[3]/span");
	By Mycart = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");
	By Checkout = By.xpath("//*[@id=\"top-cart-btn-checkout\"]");
	By Next = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button/span");
	By Placeorder = By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span");
	
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

	public void CColourtype () throws InterruptedException
	{
		driver.findElement(Colourtype).click();
		Thread.sleep(3000);
	}
	
	public void CEco () throws InterruptedException
	{
		driver.findElement(Eco).click();
		Thread.sleep(3000);
	}
	
	public void CEcotype () throws InterruptedException
	{
		driver.findElement(Ecotype).click();
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
	
	public void CAddcart () throws InterruptedException
	{
		driver.findElement(Addcart).click();
		Thread.sleep(3000);
	}
	
	public void CUpdatewishlist () throws InterruptedException
	{
		driver.findElement(Updatewishlist).click();
		Thread.sleep(3000);
	}
	
	public void CAddtoall () throws InterruptedException
	{
		driver.findElement(Addtoall).click();
		Thread.sleep(3000);
	}
	
	public void CMycart () throws InterruptedException
	{
		driver.findElement(Mycart).click();
		Thread.sleep(3000);
	}
	public void CCheckout () throws InterruptedException
	{
		driver.findElement(Checkout).click();
		Thread.sleep(3000);
	}
	
	public void CNext () throws InterruptedException
	{
		driver.findElement(Next).click();
		Thread.sleep(3000);
	}
	
	public void CPlaceorder () throws InterruptedException
	{
		driver.findElement(Placeorder).click();
		Thread.sleep(3000);
	}
}
