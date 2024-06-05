package TestLumaprojectcalling_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import lumaproject.Luma_Changepassword;
import lumaproject.Luma_Signin;

public class TestChangePassword {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//sign_in	
		Luma_Signin ls = new Luma_Signin (driver);
		ls.url();
		ls.Chsignin();
		ls.Chenteremail();
		ls.Chenterpassword();
		ls.Chclickbutton();
		
	//change password	
		Luma_Changepassword lcp = new Luma_Changepassword(driver);
		
		lcp.ckdropdown();
		lcp.ckaccount();
		lcp.ckedit();
		lcp.ckemail();
		lcp.ckpass();
		lcp.ctpsw();
		lcp.npsw();
		lcp.cfsw();
		lcp.sbtn();
		
}

}
