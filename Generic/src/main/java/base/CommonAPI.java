package base;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

public WebDriver driver = null;

@Parameters({"url"})
@BeforeMethod
    public void setUp(@Optional("https://www.facebook.com/") String url){
        System.setProperty("webdriver.chrome.driver",
                "/MavenProject/TestAutomation/Generic/brwoser-driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://www.bestbuy.com/");
        driver.get(url);

    }

    @AfterMethod
    public void cleanUp(){
       driver.quit();
    }

}

