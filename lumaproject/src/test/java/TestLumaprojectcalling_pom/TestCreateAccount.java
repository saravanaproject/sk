package TestLumaprojectcalling_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import lumaproject.Luma_Createaccount;

public class TestCreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver ();
        driver.manage().window().maximize();
        
        Luma_Createaccount lc = new Luma_Createaccount(driver);
        lc.url();
        lc.creataccount();
        lc.firstname();
        lc.lastname();
        lc.enteremail();
        lc.enterpassword();
        lc.confirmpassword();
        lc.createanaccount();
        lc.csuccessmessage();
        
        }

}
