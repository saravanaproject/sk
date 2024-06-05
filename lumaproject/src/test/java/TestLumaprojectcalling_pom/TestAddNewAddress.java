package TestLumaprojectcalling_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import lumaproject.Luma_Add_Newaddress;
import lumaproject.Luma_Changepassword;
import lumaproject.Luma_Signin;

public class TestAddNewAddress {

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
		lan.nnew();
		lan.nenterstreet();
		lan.nentercity();
		lan.nentertelephone();
		lan.nregion();
		lan.nenterzip();
		lan.ncountry();
		lan.nsave();

	}

}
