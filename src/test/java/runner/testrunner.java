package Runner;

import com.vimalselvam.cucumber.listener.Reporter;
//import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import org.openqa.selenium.WebDriver;

import java.io.File;
@RunWith(io.cucumber.junit.Cucumber.class)
//@RunWith(Cucumber.class)
@CucumberOptions(
//        plugin = { "pretty", "html:reports/htmlreports" },
        plugin = {"pretty:reports/prettyReport.txt", "html:reports/cucumber", "json:reports/cucumber.json", "rerun:reports/rerun.txt", "junit:reports/junit-report.xml", "testng:reports/testng-output.xml" },
        glue= {"stepdefinition"},
        features = "src/test/java/features",
//        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:reports/cucumber-reports/report.html"},
//        plugin = { "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:reports/cucumber-reports/report.html"},
        monochrome = true, tags = {"@smoke"}
)

public class testrunner {
    @AfterClass
    public static void writeExtentReport() throws Throwable  {
        System.out.println("report called 888888");
//        Reporter.loadXMLConfig(new File("config/report.xml"));

    }
}