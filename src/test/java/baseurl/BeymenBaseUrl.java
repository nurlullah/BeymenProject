package baseurl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;

public class BeymenBaseUrl {

    public static RequestSpecification spec;

    public static void beymenSetUp(){
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("beymen_url")).build();
    }

}