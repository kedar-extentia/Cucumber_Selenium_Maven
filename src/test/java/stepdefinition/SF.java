package stepdefinition;

import gherkin.ast.Step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Calendar;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;


public class SF {
    WebDriver driver;

//    @Given("SalesforceIQVIA login page is opened")
//    public void salesforceiqviaLoginPageIsOpened() {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\kedar.londhe\\kedarWorkspace\\Jar_libs\\chromedriver_win32\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://test.salesforce.com");
//    }


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

    @And("I logout from Salesforce")
    public void iLogoutFromSalesforce() throws InterruptedException {
//        driver.wait(30000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='profileTrigger branding-user-profile bgimg slds-avatar slds-avatar_profile-image-small circular forceEntityIcon']//span[@class='uiImage']")).click();
//div[@class='profileTrigger branding-user-profile bgimg slds-avatar slds-avatar_profile-image-small circular forceEntityIcon']//span[@class='uiImage']
        //        driver.wait(5000);
        driver.findElement(By.xpath("//a[@class=\"profile-link-label logout uiOutputURL\"]")).click();
    }

    @After
    public void teardown() throws Throwable {
// closes all the browser windows opened by web driver
        driver.quit();
    }

    @Given("I open the URL \"([^\"]*)\"$")
    public void iOpenURL(String arg0) {

    }

    @And("I select date {int} - {int} - {int}")
    public void iSelectDate(int arg0, int arg1, int arg2) throws InterruptedException {
        //open calender datepicker
        driver.findElement(By.xpath("//SPAN[@class=''][text()='Birthdate']/../..//A[@class='datePicker-openIcon display']")).click();
        //select year from picklist
        Select year = new Select(driver.findElement(By.xpath("//select[@class='slds-select picklist__label']")));
        year.selectByValue(String.valueOf(arg2));
//select month
        //button to move previous month in calendar
        WebElement nextLink = driver.findElement(By.xpath("//a[@class=\"navLink nextMonth\"]"));

        //button to move previous month in calendar
        WebElement previousLink = driver.findElement(By.xpath("//a[@class=\"navLink prevMonth\"]"));

        int curentMnth = (Calendar.getInstance().get(Calendar.MONTH))+1;
        System.out.println("Current Month is->"+curentMnth);

        int mnthDiff = arg1 - curentMnth;
        System.out.println("Month diff is :->"+mnthDiff);

//        int mnthDiff = Integer.parseInt(String.valueOf(arg1))- Calendar.getInstance().get(Calendar.MONTH);
        if(mnthDiff!=0){
            //if you have to move next month
            if(mnthDiff>0){
                for(int i=0;i< mnthDiff;i++){
                    System.out.println("Month Diff->"+i);
                    nextLink.click();
                }
            }
            //if you have to move previous month
            else if(mnthDiff<0){
                for(int i=0;i< (mnthDiff*(-1));i++){
                    System.out.println("Month Diff->"+i);
                    previousLink.click();
                }
            }
        }
        sleep(1000);

//get all dates from calendar to select correct one

        List<WebElement> list_AllDateToBook = driver.findElements(By.xpath("//td[@class=\"uiDayInMonthCell\"]"));
        list_AllDateToBook.get((arg0)-1).click();

    }

    @And("I go to Accounts Tab")
    public void iGoToAccountsTab() {
            //        driver.findElement(By.xpath("//button[@class=\"bare slds-icon-waffle_container slds-context-bar__button slds-button uiButton forceHeaderButton salesforceIdentityAppLauncherHeader\"]")).click();
            //        driver.findElement(By.xpath("//div[@class=\"slds-icon-waffle\"]")).click();
            //        driver.findElement(By.xpath("//a[contains(text(),'Health Cloud Admin')]")).click();
            //        driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon slds-p-horizontal__xxx-small slds-button_icon-small slds-button_icon-container']")).click();
            //        driver.findElement(By.xpath("//a[@class='menuItem'][@title='Accounts']")).click();
//        driver.findElement(By.xpath("//li[@class='slds-button slds-button--neutral slds-truncate']//a[@title='New']")).click();

            //        driver.findElement(By.xpath("//SPAN[@class='slds-form-element__label topdown-radio--label'][text()='A1 Patient']/preceding-sibling::SPAN")).click();
            //        driver.findElement(By.xpath("//span[contains(text(),'A1 Patient')]")).click();
            //        driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button--neutral slds-button slds-button_brand uiButton')]")).click();

            //        driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon slds-p-horizontal__xxx-small slds-button_icon-small slds-button_icon-container']")).click();

    }

    @And("I click on New Account")
    public void iClickOnNewAccount() {
        driver.findElement(By.xpath("//li[@class='slds-button slds-button--neutral slds-truncate']//a[@title='New']")).click();
    }

    @And("I select Account Type")
    public void iSelectAccountType() {
        driver.findElement(By.xpath("//span[contains(text(),'A1 Patient')]")).click();
    }

    @And("I click Next button")
    public void iClickNextButton() {
        driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button--neutral slds-button slds-button_brand uiButton')]")).click();
    }


    @Before
    public void startUp() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
