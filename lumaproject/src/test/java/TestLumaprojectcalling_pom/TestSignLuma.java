package TestLumaprojectcalling_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import lumaproject.Luma_Signin;

public class TestSignLuma {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Luma_Signin ls = new Luma_Signin (driver);
		ls.url();
		ls.Chsignin();
		ls.Chenteremail();
		ls.Chenterpassword();
		ls.Chclickbutton();

	}

}
