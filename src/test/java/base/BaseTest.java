package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
    
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected SoftAssert sa;
    protected String searching;
    protected String pincode;

    @BeforeClass
    public void setup() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Properties pr = new Properties();
        FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
        pr.load(fis);

        driver.get(pr.getProperty("Url"));

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        sa = new SoftAssert();
        searching = pr.getProperty("Search");
        pincode = pr.getProperty("pin");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
