package fbpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageActionClass {
	
	WebDriver driver;
	WebElement username;
	WebElement pass;
	WebElement loginBtn;
	
	
	public LoginPageActionClass(WebDriver driver)
	{
		this.driver = driver;
		findingElements();
	}
	
	public void findingElements()
	{
		username=this.driver.findElement(By.id("email"));
		pass = this.driver.findElement(By.id("pass"));
		loginBtn = this.driver.findElement(By.name("login"));
		
	}
	
	public void loginprocess(String user, String passwd)
	{
		username.sendKeys(user);
		pass.sendKeys(passwd);
		loginBtn.submit();
	}

}
