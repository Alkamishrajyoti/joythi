package RunnerScript;

import org.openqa.selenium.WebDriver;

import com.Ranka.generic.Base_class;
import com.Ranka.generic.Excel;


import PomScript.Pom;

public class Excel_runner  extends Base_class{
	
	public void excel() throws InterruptedException
	{
		Pom p=new Pom(driver);
		p.email(Excel.getData("Sheet1", 0, 0));
		Thread.sleep(1000);
		p.pass(Excel.getData("Sheet1", 0, 1));
		Thread.sleep(1000);
		p.log();
		
		
	}

}














































































