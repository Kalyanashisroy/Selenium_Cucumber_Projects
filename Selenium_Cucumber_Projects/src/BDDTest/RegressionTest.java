package BDDTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegressionTest {
	WebDriver driver;
	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		JFPP jfpp=new JFPP();
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\chromedriver_win32_83\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///D:/JavaFirstParentPage.html");
	    Thread.sleep(3000);
		jfpp.EnterCSSValue1_2(driver, "ABC");
		Thread.sleep(3000);
		jfpp.EnterCSSValue1_3(driver, "AAA", "BBB", "CCC");
		Thread.sleep(3000);
		jfpp.EnterCSSValue1_4(driver, "AAA1", "BBB1", "CCC1", "DDD1", "EEE1");
		Thread.sleep(3000);
		jfpp.PrintText(driver);
		driver.quit();
	}

	/*@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_valid_username_and_valid_password(String uname, String pass) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
	}
*/

	
	
	
}
