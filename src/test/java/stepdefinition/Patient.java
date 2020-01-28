package stepdefinition;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class Patient {
    WebDriver driver;

//    @FindBy(id = "username") WebElement username;
//    @FindBy(id = "password") WebElement password;
//    @FindBy(id = "Login") WebElement LoginButton;

    public void iLoginAsNurse() throws Throwable {
        driver.findElement(By.id("username")).sendKeys("carecoordinator.mj9wmmacw0ux.4rgk75.x9ueuyivosvo.b57k9kdz65j5@force.com.qa1");
//        driver.findElement(By.id("password")).sendKeys("#Extentia20!9");
        driver.findElement(By.id("password")).sendKeys("#Extentia2020");
        driver.findElement(By.id("Login")).click();

//        username.sendKeys("carecoordinator.mj9wmmacw0ux.4rgk75.x9ueuyivosvo.b57k9kdz65j5@force.com.qa1");
//        password.sendKeys("#Extentia2020");
//        LoginButton.click();

//        driver.findElement(username).sendKeys("carecoordinator.mj9wmmacw0ux.4rgk75.x9ueuyivosvo.b57k9kdz65j5@force.com.qa1");
//        driver.findElement(password).sendKeys("#Extentia2020");
//        driver.findElement(LoginButton).click();

//        driver.findElement(By.id("username")).sendKeys("carecoordinator.mj9wmmacw0ux.4rgk75.x9ueuyivosvo.b57k9kdz65j5@force.com.qa1");
//        driver.findElement(By.id("password")).sendKeys("#Extentia2020");
//        driver.findElement(By.id("Login")).click();
    }

    @And("I navigate to Accounts")
    public void iNavigateToAccounts() throws Throwable {
        sleep(3000);
        WebElement accountTab = driver.findElement(By.xpath("//a[@class='slds-context-bar__label-action slds-p-left--xx-small'][@title='Accounts']"));
        accountTab.isDisplayed();
        System.out.println("Navigating to Accounts ...");
        driver.findElement(By.xpath("//a[@class=\"slds-context-bar__label-action slds-p-left--xx-small\"][@title=\"Accounts\"]")).click();

    }

}
