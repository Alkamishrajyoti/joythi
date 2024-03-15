package RunnerScript;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Ranka.generic.Base_class;

import PomScript.Pom;

public class Data_provider_runner extends Base_class{
	@Test(dataProvider="data")
	public void test(String email,String pwd) throws InterruptedException
	{
		Pom p=new Pom(driver);
		p.email(email);
		Thread.sleep(4000);
		p.pass(pwd);
		Thread.sleep(4000);
		p.log();
		Assert.fail();
	}
	@DataProvider(name="data")
	public Object[][] check()
	{
		return new Object[][]
				{{"shwetha","sister"},
			   {"misha","sis"},
			   {"jyothi","mish"}};
	}
}
