//package stepdefinition;
//
//import gherkin.ast.Step;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.util.Calendar;
//import java.util.List;
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
//
//import static java.lang.Thread.sleep;
//import static org.junit.Assert.assertEquals;
//
//
//public class LoginSteps {
//    WebDriver driver;
// @FindBy(id = "username")
// WebElement username;
//
//    @Before
//    public void startUp() {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\kedar.londhe\\kedarWorkspace\\Jar_libs\\chromedriver_win32\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }
//
//    @After
//    public void tearDown() {
//        driver.quit();
//    }
//
//    @Given("SalesforceIQVIA login page is opened")
//    public void salesforceiqviaLoginPageIsOpened() {
//        driver.get("https://test.salesforce.com");
//    }
//
//
//    @When("I login as admin")
//    public void iLoginAsAdmin() throws Throwable {
//        driver.findElement(By.id("username")).sendKeys("madhavi.bhattad@extentia.com.jpn.qa1");
////        driver.findElement(By.id("password")).sendKeys("#Extentia20!9");
//        driver.findElement(By.id("password")).sendKeys("#Extentia20!9");
//        driver.findElement(By.id("Login")).click();
//    }
//
//    @Then("I verify the Login Successful")
//    public void iVerifyTheLoginSuccessful() throws InterruptedException {
////        WebDriverWait wait = new WebDriverWait(driver,30);
////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title=\"Field Service Admin\"]")));
//
//        WebElement rxBtn = driver.findElement(By.xpath("//span[@title=\"Field Service Admin\"]"));
//        Assert.assertTrue(rxBtn.isDisplayed());
//    }
//
//
//}
