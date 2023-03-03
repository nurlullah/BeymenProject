package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.BasketPage;
import pojos.Gomlek;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.FileNotFoundException;

public class BasketStepDefs {

    Gomlek txtFileDakiGomlek = new Gomlek();
    Gomlek sepettekiGomlek = new Gomlek();
    BasketPage basketPage = new BasketPage();
    Select select = new Select(basketPage.quantityDropDown);


    @Then("user verify the price of the product in the bag")
    public void user_verify_the_price_of_the_product_in_the_bag() {

        sepettekiGomlek.setName(basketPage.productBrand.getText());
        sepettekiGomlek.setDescription(basketPage.productDescription.getText());
        sepettekiGomlek.setSize(basketPage.productSize.getText());
        sepettekiGomlek.setPrice(basketPage.productPrice.getText());

        try {
            txtFileDakiGomlek = (Gomlek) ReusableMethods.readFileToGetObject("product.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(sepettekiGomlek.getPrice(),txtFileDakiGomlek.getPrice());

    }
    @When("user upgrade the count of product")
    public void user_upgrade_the_count_of_product() {

        select.selectByVisibleText("2 adet");
        Driver.wait(5);
    }
    @Then("verify if there are two items in the bag")
    public void verify_if_there_are_two_items_in_the_bag() {
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"2 adet");
    }
    @When("clear the items on the bag")
    public void clear_the_items_on_the_bag() {
        basketPage.removeItemButton.click();
        Driver.wait(5);
    }
    @Then("verify that the bag is empty")
    public void verify_that_the_bag_is_empty() {
        Assert.assertTrue(basketPage.emptyCardMessage.isDisplayed());
        Driver.wait(3);

        Driver.closeDriver();
    }

}