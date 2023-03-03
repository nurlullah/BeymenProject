package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class BeymenHomePage {

    public BeymenHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "/html/body/header/div/div/div[2]/div/div/div/input")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cookiesAcceptButton;

    @FindBy(xpath = "/html/body/div[4]/div[5]/div[2]/div/div[1]/button")
    public WebElement closeButton;

    @FindBy(xpath = "//*[@id='productList']/div/div/div/div[2]/a[2]")
    public List<WebElement> products; // urunlerin isim linklerinin listesi
}