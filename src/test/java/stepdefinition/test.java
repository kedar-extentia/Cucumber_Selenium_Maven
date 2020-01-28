package seleniumgluecode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class test {
//	private By driver;
    WebDriver driver;

    @Given("^OrangeHRM login page is opened$")
    public void orangehrmLoginPageIsOpened() throws Throwable  {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\kedar.londhe\\kedarWorkspace\\Jar_libs\\chromedriver_win32\\chromedriver.exe");
    	driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
    }

    @When("^I enter Username$")
    public void iEnterUsername() throws Throwable {
        driver.findElement(By.id("txtUsername")).sendKeys("opensourcecms");
    }

    @And("^I enter password$")
    public void iEnterPassword() throws Throwable  {
        driver.findElement(By.id("txtPassword")).sendKeys("opensourcecms");

    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() throws Throwable  {
        driver.findElement(By.id("btnLogin")).click();

//        driver.findElement((SearchContext) id("btnLogin")).click();
    }

    @Then("^I validate the Login Successful$")
    public void iValidateTheLoginSuccessful() throws Throwable {
        try {
            assertEquals(driver.findElement(By.xpath("//ul[@id='option-menu']/li")).getText(), "Welcome Admin");
        } catch (Error e) {
//            verificationErrors.append(e.toString());
        }
    }

    @And("^Dashboard is displayed$")
    public void dashboardIsDisplayed() throws Throwable {
        try {
//            assertEquals(driver.findElement(By.xpath("//h2")).getText(), "Employee Information");
            driver.findElement(By.xpath("//li[contains(text(),'Welcome Admin')]"));
        } catch (Error e) {
//            verificationErrors.append(e.toString());
        }
    }

    @Then("I close new window")
    public void iCloseNewWindow() throws Throwable {
        driver.close();
//        driver.quit();
    }

    @And("I click on logout button")
    public void iClickOnLogoutButton() throws Throwable {
        driver.findElement(By.xpath("//a[@target='_parent']")).click();

    }

} //Class ends
