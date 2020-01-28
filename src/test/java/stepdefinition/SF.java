package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;


public class SF {
    WebDriver driver;

    @Given("SalesforceIQVIA login page is opened")
    public void salesforceiqviaLoginPageIsOpened() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kedar.londhe\\kedarWorkspace\\Jar_libs\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://test.salesforce.com");
    }


    @When("I login as admin")
    public void iLoginAsAdmin() throws Throwable {
        driver.findElement(By.id("username")).sendKeys("madhavi.bhattad@extentia.com.jpn.qa1");
//        driver.findElement(By.id("password")).sendKeys("#Extentia20!9");
        driver.findElement(By.id("password")).sendKeys("#Extentia20!9");
        driver.findElement(By.id("Login")).click();
    }

    @Then("I verify the Login Successful")
    public void iVerifyTheLoginSuccessful() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver,30);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title=\"Field Service Admin\"]")));

        WebElement hdr = driver.findElement(By.xpath("//div[@class=\"slds-global-header slds-grid slds-grid--align-spread\"]"));
        Assert.assertTrue(hdr.isDisplayed());
    }

    @And("I logout from Salesforce")
    public void iLogoutFromSalesforce() throws InterruptedException {
//        driver.wait(30000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='profileTrigger branding-user-profile bgimg slds-avatar slds-avatar_profile-image-small circular forceEntityIcon']//span[@class='uiImage']")).click();
//div[@class='profileTrigger branding-user-profile bgimg slds-avatar slds-avatar_profile-image-small circular forceEntityIcon']//span[@class='uiImage']
        //        driver.wait(5000);
        driver.findElement(By.xpath("//a[@class='profile-link-label logout uiOutputURL']")).click();
    }

    @After
    public void teardown() throws Throwable {
// closes all the browser windows opened by web driver
        driver.quit();
    }

    @Given("I open the URL \"([^\"]*)\"$")
    public void iOpenURL(String arg0) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kedar.londhe\\kedarWorkspace\\Jar_libs\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(arg0);
    }

    @And("I select Birth date {int} - {int} - {int}")
    public void iSelectDate(int arg0, int arg1, int arg2) throws InterruptedException {
        WebElement scrollUP = driver.findElement(By.xpath("//SPAN[@class=''][text()='Birthdate']/../..//A[@class='datePicker-openIcon display']"));
        JavascriptExecutor executor8 = (JavascriptExecutor) driver;
        executor8.executeScript("arguments[0].scrollIntoView();", scrollUP);

        //open calender datepicker
        driver.findElement(By.xpath("//SPAN[@class=''][text()='Birthdate']/../..//A[@class='datePicker-openIcon display']")).click();
        //verify datepicker displayed
        driver.findElement(By.xpath("//span[@class='today slds-show--inline-block slds-text-link slds-p-bottom--x-small']")).isDisplayed();

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
        driver.findElement(By.xpath("//a[@class='slds-context-bar__label-action slds-p-left--xx-small'][@title='Accounts']")).click();
        driver.findElement(By.xpath("//li[@class='slds-button slds-button--neutral slds-truncate']//a[@title='New']")).click();
    }

    @And("I select Account Type")
    public void iSelectAccountType() {
        driver.findElement(By.xpath("//span[@class='slds-form-element__label topdown-radio--label'][contains(text(),'A1 Patient')]")).click();
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

    @FindBy(id = "username") WebElement username;
    @FindBy(id = "password") WebElement password;
    @FindBy(id = "Login") WebElement LoginButton;

    @When("I login as Nurse")
    public void iLoginAsNurse() throws Throwable {
        driver.findElement(By.id("username")).sendKeys("carecoordinator.mj9wmmacw0ux.4rgk75.x9ueuyivosvo.b57k9kdz65j5@force.com.qa1");
//        driver.findElement(By.id("password")).sendKeys("#Extentia20!9");
        driver.findElement(By.id("password")).sendKeys("#Extentia2020");
        driver.findElement(By.id("Login")).click();
    }

    @And("I enter FirstName LastName")
    public void iEnterFirstNameLastName() {
        driver.findElement(By.xpath("//input[@class='lastName compoundBorderBottom form-element__row input']")).sendKeys("testLastName");
        driver.findElement(By.xpath("//input[@class='firstName compoundBLRadius compoundBRRadius form-element__row input']")).sendKeys("testFirsttName");
    }

    @Then("I click Save button")
    public void iClickSaveButton() {
        driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']")).click();

    }

    @Then("verify account created successfully")
    public void verifyAccountCreatedSuccessfully() {
//        Assert.assertEquals("//span[@class='toastMessage slds-text-heading--small forceActionsText']", );
    }


}
