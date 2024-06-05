package TestLumaprojectcalling_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import lumaproject.Luma_Changepassword;
import lumaproject.Luma_ManageAddress;
import lumaproject.Luma_Signin;

public class TestManageAddress {

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
		
		Luma_ManageAddress lm = new Luma_ManageAddress(driver);
		lm.mkadd();
		lm.lEnterstreet();
		lm.lEntercity();
		lm.lEntertelephone();
		lm.lregion();
		lm.lEnterzip();
		lm.lcountry();
		lm.lsave();

	}

}
