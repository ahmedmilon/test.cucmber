package test.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class MainRUn {

	WebDriver driver;

	
	
	


	
	
	
	@Given("^user in home page$")
	public void user_in_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://trainingapply.grants.gov/apply/login.faces?userType=applicant&cleanSession=1");
	}

	@Given("^user click on firstname$")
	public void user_click_on_firstname() throws Throwable {
		driver.findElement(By.xpath("//*[@id='form:userId']")).sendKeys("ahmedmmm");
		System.out.println("user is on username");
	}

	@When("^user click on password$")
	public void user_click_on_password() throws Throwable {
	
	}

	@When("^user click on home button$")
	public void user_click_on_home_button() throws Throwable {
	    
	}


}
