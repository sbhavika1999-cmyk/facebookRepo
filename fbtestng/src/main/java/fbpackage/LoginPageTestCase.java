package fbpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageTestCase {
	
	WebDriver driver;
	LoginPageActionClass lp;
	
	@BeforeMethod
	@Parameters("browser")
	public void setup(String browser)
	{
		if(browser.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void validcredential()
	{
		lp = new LoginPageActionClass(driver);
		lp.loginprocess("testuser@gmail.com","test@123");
	}
	
	@AfterMethod
	public void closing()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}

}
