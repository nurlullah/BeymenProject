package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.Keys;
import pages.BeymenHomePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.FileInputStream;
import java.io.IOException;

public class HomePageStepDefs {

    BeymenHomePage homePage = new BeymenHomePage();

    @When("user click on searchbox")
    public void user_click_on_searchbox() {
        homePage.searchBox.click();

    }
    @And("user types sort on searchbox")
    public void user_types_sort_on_searchbox() throws IOException {

        String path = "src/test/resources/testdata/arananurun.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet1 = workbook.getSheetAt(0);
        Row row1 = sheet1.getRow(0);//index start at 0
        Cell cell1 = row1.getCell(0);
        homePage.searchBox.sendKeys(cell1.toString());
        Driver.wait(2);


    }
    @And("user delete the word on the searchbox")
    public void user_delete_the_word_on_the_searchbox() {

        ReusableMethods.doubleClick(homePage.searchBox);
        homePage.searchBox.sendKeys(Keys.DELETE);
        Driver.wait(2);

    }
    @And("user types gomlek on searchbox")
    public void user_types_gomlek_on_searchbox() throws IOException {
        String path = "src/test/resources/testdata/arananurun.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet1 = workbook.getSheetAt(0);
        Row row1 = sheet1.getRow(0);//index start at 0
        Cell cell1 = row1.getCell(1);
        homePage.searchBox.sendKeys(cell1.toString());
    }
    @And("user do enter for the research")
    public void user_do_enter_for_the_research() {
        Driver.wait(2);
        homePage.searchBox.sendKeys(Keys.ENTER);
    }
    @And("user choose a random product from selection")
    public void user_choose_a_random_product_from_selection() {
        ReusableMethods.selectRandomProduct(homePage.products);
    }
}