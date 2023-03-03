package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ProductDetailsPage {

    public ProductDetailsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="*//div[3]/div[1]/div[1]/div[2]/div[2]/h1/a")
    public WebElement productBrand;

    @FindBy(xpath="*//div[3]/div[1]/div[1]/div[2]/div[2]/h1/span")
    public WebElement productDetails;

    @FindBy(xpath="*//div[3]/div[1]/div[1]/div[2]/div[2]/div/div/ins")
    public WebElement productPrice;

    @FindBy(xpath="//*[@id='sizes']/div/span")
    public List<WebElement> productSize;

    @FindBy(xpath = "//*[@id='addBasket']")
    public WebElement addToBasketButton;

    @FindBy(xpath = "/html/body/header/div/div/div[3]/div/a[3]")
    public WebElement goToBasket;

    @FindBy(xpath = "/html/body/header/div/div/div[3]/div/a[3]/span/span")
    public WebElement basketSize;

}