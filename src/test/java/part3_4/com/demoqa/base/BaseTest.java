package part3_4.com.demoqa.base;

import com.demoqa.pages.HomePage;
import com.base.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utilities.JavaScriptUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private final String DEMOQA_URL = "https://demoqa.com/";

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/deimos/dev/web/chromedriver-linux64/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.setBinary("/home/deimos/dev/web/chrome-linux64/chrome");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(DEMOQA_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        JavaScriptUtility.setUtilityDriver();
        homePage = new HomePage();
    }

    @AfterMethod
    public void takeFailedResultScreenshot(ITestResult testResult) {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(System.getProperty("user.dir")
                    + "/resources/screenshots/(" + LocalTime.now() + ")" + testResult.getName() + ".png");
            try {
                FileHandler.copy(source, destination);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Screenshot taken");
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
