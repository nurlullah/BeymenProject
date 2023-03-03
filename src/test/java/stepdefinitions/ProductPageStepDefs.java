package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.ProductDetailsPage;
import pojos.Gomlek;
import utilities.Driver;
import utilities.ReusableMethods;

public class ProductPageStepDefs {

    Gomlek gomlek = new Gomlek();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();


    @Then("user verify that he is on the product page")
    public void user_verify_that_he_is_on_the_product_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(productDetailsPage.productBrand.getText()));
    }

    @When("user select a size")
    public void user_select_a_size() {

        ReusableMethods.selectRandomSize(productDetailsPage.productSize);

    }

    @And("user store informations on a file")
    public void user_store_informations_on_a_file() {
        gomlek.setName(productDetailsPage.productBrand.getText());
        gomlek.setDescription(productDetailsPage.productDetails.getText());
        gomlek.setPrice(productDetailsPage.productPrice.getText());
        ReusableMethods.storeObjectInAFile(gomlek,"product.txt");
    }


    @And("user clicks on add to bag button")
    public void user_clicks_on_add_to_bag_button() {
        productDetailsPage.addToBasketButton.click();
        Driver.wait(6);
    }
    @Then("user verify that process is successful")
    public void user_verify_that_process_is_successful() {
        Assert.assertTrue(productDetailsPage.basketSize.getText().equals("(1)"));
    }
    @When("user clicks on the bag")
    public void user_clicks_on_the_bag() {
        productDetailsPage.goToBasket.click();
    }


}