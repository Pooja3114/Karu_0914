package Com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\AAA\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\Com\\AdactinFeature\\AdactinFeature",
glue = "Com.adactin.stepdefinition",
monochrome = true,
dryRun = false,
strict=true,

plugin= {"html:Reports1/Html_Report",
		"pretty",

"json:Reports1/Json_Reports.json",
"com.cucumber.listener.ExtentCucumberFormatter:Reports1/gane.html" })

public class Runner_class {
	public static WebDriver driver;
@BeforeClass		
public static void setUp(){
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\ganesh\\eclipse-workspace\\AdactinCucumber\\Driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();

}
@AfterClass
public static void tearDown() {
	driver.close();
}
}