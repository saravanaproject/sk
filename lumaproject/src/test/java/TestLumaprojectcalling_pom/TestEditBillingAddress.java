package TestLumaprojectcalling_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import lumaproject.Luma_Add_Newaddress;
import lumaproject.Luma_Changepassword;
import lumaproject.Luma_Editbillingaddress;
import lumaproject.Luma_Signin;

public class TestEditBillingAddress {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Luma_Signin ls = new Luma_Signin (driver);
		ls.url();
		ls.Chsignin();
		ls.Chenteremail();
		ls.Chenterpassword();
		ls.Chclickbutton();
		
		Luma_Changepassword lcp = new Luma_Changepassword(driver);
		lcp.ckdropdown();
		lcp.ckaccount();
		
		Luma_Add_Newaddress lan = new Luma_Add_Newaddress(driver);
		lan.nadd();
		
		Luma_Editbillingaddress leb = new Luma_Editbillingaddress(driver);
		leb.edit();
		leb.echeckbox();
		leb.esave();
		

	}

}
