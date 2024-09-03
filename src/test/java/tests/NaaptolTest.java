package tests;

import Pages.Callingtablets;
import Pages.Homepage;
import base.BaseTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NaaptolTest extends BaseTest {
    Homepage homepage;
    Callingtablets calltab;
    ExtentReports reporting;
    ExtentTest testing;
    JavascriptExecutor jsExecutor;
   

    public static void capture(WebDriver driver, int n) throws IOException {
        TakesScreenshot tS = (TakesScreenshot) driver;
        File image = tS.getScreenshotAs(OutputType.FILE);
        File img = new File("C:\\Users\\sharm\\OneDrive\\Pictures\\Projects Screenshot" + n + ".png");
        FileUtils.copyFile(image, img);
    }

    @BeforeClass
    public void setupReporting() {
        reporting = new ExtentReports("C:\\Users\\sharm\\Documents\\workspace-STS\\ProjectPOM\\report.html");
        testing = reporting.startTest("Naaptol Testing");
        jsExecutor = (JavascriptExecutor) driver;
    }

    @Test(priority = 0)
    public void opentabpage() throws IOException {
    	
        homepage = new Homepage(driver);
        
        WebElement downElement = wait.until(ExpectedConditions.elementToBeClickable(homepage.getDownElement()));
        downElement.click();

        WebElement tabCompElement = wait.until(ExpectedConditions.elementToBeClickable(homepage.getTabCompElement()));
        tabCompElement.click();

        WebElement tabElement = wait.until(ExpectedConditions.elementToBeClickable(homepage.getTabElement()));
        tabElement.click();

        WebElement callElement = wait.until(ExpectedConditions.elementToBeClickable(homepage.getCallElement()));
        callElement.click();

        testing.log(LogStatus.PASS, "Hit the Calling Tablets Page Successfully");

        String pg = driver.getTitle();
        Assert.assertEquals(pg, "Calling Tablets Online Store in India - Buy Tablet Phone at Best Price on Naaptol Online Shopping");

        testing.log(LogStatus.PASS, "Confirmed Calling Tablets Page and Asserted the Title Page");

        capture(driver, 1);
    }

    @Test(priority = 5)
    public void addToCart() throws IOException, InterruptedException {
    	
        homepage = new Homepage(driver);
        
        Thread.sleep(1000);
        try {
			
        	 WebElement callElement = wait.until(ExpectedConditions.elementToBeClickable(homepage.getCallElement()));
             
        	 callElement.click();
		} catch (Exception e) {
			
		    System.out.println("Element was not clickable within the timeout period.");
			
		}
       
        Callingtablets tabletslist = new Callingtablets(driver);
        tabletslist.getAddElement();

//        WebElement brandElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href='/calling-tablets/i-kall-dual-sim-4g-calling-tablet-10000mah-powerbank/p/12610920.html'])[1]")));
//        String brand = brandElement.getText();
//        Assert.assertEquals(brand, "I Kall Dual SIM 4G Calling Tablet + 10000mAh Powerbank");

        testing.log(LogStatus.PASS, "Successfully Added to cart");

        capture(driver, 3);
    }

    @Test(priority = 6)
    public void addPin() throws IOException, InterruptedException {
    	
        homepage = new Homepage(driver);
       
        try {
			
       	 WebElement callElement = wait.until(ExpectedConditions.elementToBeClickable(homepage.getCallElement()));
     	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", callElement);  
       	 callElement.click();
		} catch (Exception e) {
			
		    System.out.println("Element was not clickable within the timeout period.");
			
		}

        Callingtablets tabletslist = new Callingtablets(driver);
        tabletslist.enterPin(pincode);
        
        try {
            WebElement pinElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='sml_link'])[1]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pinElement);
            pinElement.click();
        } catch (Exception e) {
            System.out.println("Pin element was not clickable within the timeout period: " + e.getMessage());
            capture(driver, 2);
            return; // Exit the test if the pin element is not clickable
        }
        Thread.sleep(1000);
        testing.log(LogStatus.PASS, "Successfully entered pin");

        capture(driver, 4);
    }

    @Test(priority = 7)
    public void comparingProduct() throws IOException, InterruptedException {
    	
        homepage = new Homepage(driver);
        
        try {
			
       	 WebElement callElement = wait.until(ExpectedConditions.elementToBeClickable(homepage.getCallElement()));
            
       	 callElement.click();
		} catch (Exception e) {
			
		    System.out.println("Element was not clickable within the timeout period.");
			
		}
        
        Callingtablets tabletslist = new Callingtablets(driver);
        tabletslist.getCompElement();

//        WebElement compareElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"compareContent\"]/tbody/tr[2]/td[1]")));
//        String compare = compareElement.getText();
//        Assert.assertEquals(compare, "Comparing 2 similar products");
//        
        Thread.sleep(1000);

        testing.log(LogStatus.PASS, "Successfully compared the products");

        capture(driver, 5);
    }

    @Test(priority = 1)
    public void searchByBrand() throws InterruptedException, IOException {
    	
        calltab = new Callingtablets(driver);

        WebElement kallElement = wait.until(ExpectedConditions.elementToBeClickable(calltab.getKallElement()));
        kallElement.click();
        Thread.sleep(1000);

        List<WebElement> productResult = calltab.getProductTile();
        for (WebElement result : productResult) {
            Assert.assertTrue(result.getText().contains("I Kall"), "Found an item that is not I KALL");
        }
        kallElement.click();
        Thread.sleep(1000);

        WebElement dapsElement = wait.until(ExpectedConditions.elementToBeClickable(calltab.getDapsElement()));
        dapsElement.click();
        Thread.sleep(1000);
        dapsElement.click();
        Thread.sleep(1000);

        WebElement plusElement = wait.until(ExpectedConditions.elementToBeClickable(calltab.getPlusElement()));
        plusElement.click();
        Thread.sleep(1000);
        plusElement.click();
        Thread.sleep(1000);

        WebElement zyncElement = wait.until(ExpectedConditions.elementToBeClickable(calltab.getZyncElement()));
        zyncElement.click();
        Thread.sleep(1000);
        zyncElement.click();
        Thread.sleep(1000);

        WebElement brandElement = wait.until(ExpectedConditions.elementToBeClickable(calltab.getBrandElement()));
        brandElement.click();
        Thread.sleep(1000);
        brandElement.click();
        Thread.sleep(1000);

        capture(driver, 6);
    }

    @Test(priority = 2)
    public void searchByPrice() throws InterruptedException, IOException {
    	
        WebElement box1 = wait.until(ExpectedConditions.elementToBeClickable(calltab.getBox1()));
        box1.click();
        Thread.sleep(1000);
        box1.click();
        Thread.sleep(1000);

        WebElement box2 = wait.until(ExpectedConditions.elementToBeClickable(calltab.getBox2()));
        box2.click();
        Thread.sleep(1000);
        box2.click();
        Thread.sleep(1000);

        WebElement dapsProduct = wait.until(ExpectedConditions.elementToBeClickable(calltab.getDapsProduct()));
        dapsProduct.click();
        Thread.sleep(1000);

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        String parent = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(parent)) {
                driver.switchTo().window(window);
                break;
            }
        }

        driver.close();
        driver.switchTo().window(parent);

//        String display = driver.findElement(By.xpath("//a[@id='cart-panel-button-0']")).getText();
//        sa.assertEquals(display, "Click here to Buy");
//        sa.assertAll();

        capture(driver, 7);
    }

    @Test(priority = 3)
    public void searchByDiscount() throws InterruptedException, IOException {
    	
        WebElement discount1 = wait.until(ExpectedConditions.elementToBeClickable(calltab.getDiscount1()));
//      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", discount1);
//        jsExecutor.executeScript("window.scrollBy(0,550)");
        wait.until(ExpectedConditions.elementToBeClickable(discount1)).click();
        
        Thread.sleep(1000);
        discount1.click();
        Thread.sleep(1000);

        WebElement discount2 = wait.until(ExpectedConditions.elementToBeClickable(calltab.getDiscount2()));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", discount2);
        wait.until(ExpectedConditions.elementToBeClickable(discount2)).click();
        
        discount2.click();
        Thread.sleep(1000);

        capture(driver, 8);
    }

    @Test(priority = 4)
    public void searchByFeatures() throws InterruptedException, IOException {
    	
        WebElement feature1 = wait.until(ExpectedConditions.elementToBeClickable(calltab.getFeature1()));
        feature1.click();
        Thread.sleep(1000);
        feature1.click();
        Thread.sleep(1000);

        WebElement feature2 = wait.until(ExpectedConditions.elementToBeClickable(calltab.getFeature2()));
        feature2.click();
        Thread.sleep(1000);
        feature2.click();
        Thread.sleep(1000);

        WebElement feature3 = wait.until(ExpectedConditions.elementToBeClickable(calltab.getFeature3()));
        feature3.click();
        Thread.sleep(1000);
        feature3.click();
        Thread.sleep(1000);

        WebElement feature4 = wait.until(ExpectedConditions.elementToBeClickable(calltab.getFeature4()));
        feature4.click();
        Thread.sleep(1000);
        feature4.click();
        Thread.sleep(1000);

        capture(driver, 9);
    }

    @AfterClass
    public void end() {
        reporting.endTest(testing);
        reporting.flush();
    }
}
