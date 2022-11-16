package runningstep;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import driversrun.DriverStep;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "steps", tags = "@ComprarCalcado", monochrome = true, dryRun = false, plugin = {
		"pretty", "html:target/cucumber-repo.html",
		"json:target/cucumber-repo.json" }, snippets = SnippetType.CAMELCASE)

public class StepsRunning extends DriverStep {
	@BeforeClass
	public static void OpenBrowser() throws InterruptedException {
		String url = "https://www.shoestock.com.br/";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	}

}
