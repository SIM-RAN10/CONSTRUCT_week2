package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Set;

public class Callingtablets {

    private WebDriver driver;

    public Callingtablets(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[name='LifeDAPS']")
    private WebElement searchElement;

    @FindBy(xpath = "(//a[@href='/calling-tablets/i-kall-dual-sim-4g-calling-tablet-10000mah-powerbank/p/12610920.html'])[1]")
    private WebElement kallTab;

    @FindBy(xpath = "//ul[@class=\"pro_BuyAction clearfix\"]/li/p[3]/a")
    private WebElement addElement;

    @FindBy(css = "[placeholder='Search product by Pincode']")
    private WebElement enterPin;

    @FindBy(xpath = "(//a[@class='button_1']/span)[1]")
    private WebElement checkPin;

    @FindBy(xpath = "(//li/span[@class='v_bottom'])[1]")
    private WebElement compElement;

    @FindBy(xpath = "(//li/span[@class='v_bottom'])[5]")
    private WebElement compElement2;

    @FindBy(id = "compareButton")
    private WebElement cbuttonElement;

    @FindBy(id = "brandFilterBox38673")
    private WebElement kallElement;

    @FindBy(id = "brandFilterBox38861")
    private WebElement dapsElement;

    @FindBy(id = "brandFilterBox38897")
    private WebElement plusElement;

    @FindBy(id = "brandFilterBox2670")
    private WebElement zyncElement;

    @FindBy(id = "brandFilterBox8313")
    private WebElement brandElement;

    @FindBy(id = "priceFilterBox1")
    private WebElement box1;

    @FindBy(id = "priceFilterBox2")
    private WebElement box2;

    @FindBy(id = "discountFilterBox2")
    private WebElement discount1;

    @FindBy(id = "discountFilterBox1")
    private WebElement discount2;

    @FindBy(id = "featureFilterBox0f5")
    private WebElement feature1;

    @FindBy(id = "featureFilterBox1f6")
    private WebElement feature2;

    @FindBy(id = "featureFilterBox2f7")
    private WebElement feature3;

    @FindBy(id = "featureFilterBox3f8")
    private WebElement feature4;

    @FindBy(xpath = "//div[@class='item_title']/a")
    private List<WebElement> productTile;

    @FindBy(xpath = "//div[@class='item_title']/a")
    private WebElement DapsProduct;

    public WebElement getSearchElement() {
        return searchElement;
    }

    public WebElement getKallTab() {
        return kallTab;
    }

    public WebElement getAddElement() {
        return addElement;
    }

    public WebElement getEnterPin() {
        return enterPin;
    }

    public WebElement getCheckPin() {
        return checkPin;
    }

    public WebElement getCompElement() {
        return compElement;
    }

    public WebElement getCompElement2() {
        return compElement2;
    }

    public WebElement getCbuttonElement() {
        return cbuttonElement;
    }

    public WebElement getKallElement() {
        return kallElement;
    }

    public WebElement getDapsElement() {
        return dapsElement;
    }

    public WebElement getPlusElement() {
        return plusElement;
    }

    public WebElement getZyncElement() {
        return zyncElement;
    }

    public WebElement getBrandElement() {
        return brandElement;
    }

    public WebElement getBox1() {
        return box1;
    }

    public WebElement getBox2() {
        return box2;
    }

    public WebElement getDiscount1() {
        return discount1;
    }

    public WebElement getDiscount2() {
        return discount2;
    }

    public WebElement getFeature1() {
        return feature1;
    }

    public WebElement getFeature2() {
        return feature2;
    }

    public WebElement getFeature3() {
        return feature3;
    }

    public WebElement getFeature4() {
        return feature4;
    }

    public List<WebElement> getProductTile() {
        return productTile;
    }

    public WebElement getDapsProduct() {
        return DapsProduct;
    }

    public void addProductToCart() {
        kallTab.click();
        driver.findElement(By.xpath("(//li/a[@href='javascript:void(0)'])[4]")).click();

        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                addElement.click();
                driver.close();
                driver.switchTo().window(parentWindow);
                break;
            }
        }
    }

    public void enterPin(String pin) {
        enterPin.sendKeys(pin);
        checkPin.click();
    }

    public void compareProducts() {
        compElement.click();
        compElement2.click();
        cbuttonElement.click();
    }

	
}

