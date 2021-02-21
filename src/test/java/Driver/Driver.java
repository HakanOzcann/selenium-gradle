package Driver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver
{
    public static WebDriver driver = null;

    @BeforeSuite
    public void initialize() throws IOException
    {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/geckodriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com");
    }

    @AfterSuite
    public void TeardownTest()
    {
        Driver.driver.quit();
    }
}
