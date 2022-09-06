package stepDefinitions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import pageObjects.LoginPage;

public class OrangeHRMsteps extends BaseClass {
	
	
	@Before
	public void setup() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("config.properties");
		prop.load(fis);
		
		
		logger = Logger.getLogger("OrangeHRM");
		PropertyConfigurator.configure("Log4j.properties");
//	   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromepath"));
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		
		
	   logger.info("***************Launching browser*************");
	   lp = new LoginPage(driver);
	}

	@When("I open orange hrm homepage")
	public void i_open_orange_hrm_homepage() {
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    logger.info("***************Maximize Window*************");
	    driver.manage().window().maximize();
	}

	@Then("Enter username as {string}")
	public void enter_username_as(String username) {
//	    driver.findElement(By.name("username")).sendKeys(username);
		logger.info("***************Enter username*************");
		lp.enterUserName(username);
	}

	@Then("Enter password as {string}")
	public void enter_password_as(String password) {
//	    driver.findElement(By.name("password")).sendKeys(password);
		logger.info("***************Enter password*************");
		lp.enterPassword(password);
	}
	
	@Then("click on login button")
	public void click_on_login_button() {
//	    driver.findElement(By.xpath("//button[@type='submit']")).click();
		logger.info("***************Click on login button*************");
		lp.clickLoginButton();
	}

	@Then("verify homepage title as {string}")
	public void verify_homepage_title_as(String title) {
		System.out.println("Title of home page is :" +driver.getTitle());
	    Assert.assertEquals(title, driver.getTitle());
	}

	@Then("close browser")
	public void close_browser() {
	    driver.quit();
	}
}
