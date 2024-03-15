package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Ranka.generic.Base_class;
import com.Ranka.generic.Base_page;

public class Pom extends Base_page{
	@FindBy (xpath ="//input[@id='email']" )
	private WebElement email;
	
	@FindBy (xpath ="//input[@id='pass']" )
	private WebElement pass;
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement log;
	
	public Pom(WebDriver driver)
	{
		super(driver);
	}
	
	
	public WebElement email(String data)
	{
		return email;
	}
	public WebElement pass(String data)
	{
		return pass;
	}
		public WebElement log()
		{
			return log;
		}


		


		
		
}

