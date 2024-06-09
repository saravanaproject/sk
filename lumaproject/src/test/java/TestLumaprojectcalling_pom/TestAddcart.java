package TestLumaprojectcalling_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import lumaproject.Luma_AddCart;
import lumaproject.Luma_Signin;

public class TestAddcart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Luma_Signin ls = new Luma_Signin (driver);
		ls.url();
		ls.Chsignin();
		ls.Chenteremail();
		ls.Chenterpassword();
		ls.Chclickbutton();
		
		Luma_AddCart lac = new Luma_AddCart (driver);
		lac.CWomen();
        lac.CHoodies();
        lac.CStyle();
        lac.CFull();
        lac.CSize();
        lac.CSizetype();
        lac.CClimate();
        lac.CClimatetype();
        lac.CColour();
        lac.CColourtype();
        lac.CEco();
        lac.CEcotype();
        lac.CMaterial();
        lac.CMaterialtype();
     
 }

}
