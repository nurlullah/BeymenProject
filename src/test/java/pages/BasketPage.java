package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasketPage {

    public BasketPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/a/strong")
    public WebElement productBrand;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/a/span")
    public WebElement productDescription;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/div/span")
    public WebElement productPrice;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div[2]/ul[1]/li[2]/div[2]")
    public WebElement productSize;

    @FindBy(id="removeCartItemBtn0-key-0")
    public WebElement removeItemButton;

    @FindBy(id="quantitySelect0-key-0")
    public WebElement quantityDropDown;

    @FindBy(xpath = "//*[@id='emtyCart']/div/strong")
    public WebElement emptyCardMessage;


}