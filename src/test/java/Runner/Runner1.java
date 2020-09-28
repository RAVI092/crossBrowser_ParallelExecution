package Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\Features",dryRun = false,glue= {"StepDef"},strict=true)

public class Runner1 extends AbstractTestNGCucumberTests {
	public static WebDriver d1;
	@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

	@BeforeMethod
	@Parameters("browser")
	public void m1(String br)
	{
		if(br.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ravi\\Downloads\\geckodriver-v0.27.0-win64 (1)\\geckodriver.exe");
			d1=new FirefoxDriver();
		}
		else if (br.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver.exe");
			d1=new ChromeDriver();
			
		}
		
		
	}
	

	
}
