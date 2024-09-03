package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class Homepage {
    
    private WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class='arrowNav']")
    private WebElement downElement;

    @FindBy(linkText = "Tablets & Computers")
    private WebElement tabCompElement;

    @FindBy(linkText = "Tablets")
    private WebElement tabElement;

    @FindBy(xpath = "(//li/a[@href='/shop-online/computers-peripherals/tablet/calling-tablets.html'])[2]")
    private WebElement callElement;

    public WebElement getDownElement() {
        return downElement;
    }

    public WebElement getTabCompElement() {
        return tabCompElement;
    }

    public WebElement getTabElement() {
        return tabElement;
    }

    public WebElement getCallElement() {
        return callElement;
    }
}
