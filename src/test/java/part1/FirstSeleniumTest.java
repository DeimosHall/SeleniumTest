package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/deimos/dev/web/chromedriver-linux64/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.setBinary("/home/deimos/dev/web/chrome-linux64/chrome");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    public void tearDown() {
        // Closes every window and the driver
//        driver.quit();
        // Closes only the current window
//        driver.close();
    }

    @Test
    public void testLoginIntoApplication() throws InterruptedException {
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        var password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        var loginBtn = driver.findElement(By.tagName("Button"));
        loginBtn.click();
        Thread.sleep(2000);

        String dashboardText = driver.findElement(By.tagName("h6")).getText();
        String expectedText = "Dashboard";
        Assert.assertEquals(dashboardText, expectedText);
    }
}
