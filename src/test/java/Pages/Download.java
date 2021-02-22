package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Download
{
    WebDriver driver;

    public Download(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[2]/div[1]/header/div/nav/ul/li[2]/a")
    WebElement download;

    public void Download()
    {
        download.click();
    }


}

