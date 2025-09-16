package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AwrsRegisterTaxPage;
import pages.commonPage;

import static pages.commonPage.getUrl;
import static utilis.driver.driver;


public class AwrsRegisterSteps {
    static commonPage common;
    static AwrsRegisterTaxPage taxPage;

    @Given("Navigate to the AWRS UI {string}")
    public static void iNavigateToUrl(String url) throws InterruptedException {
        common = new commonPage();
        getUrl(url);
    }
    @And("Search for a {string}")
    public void enterAWRSDetails(String text) throws InterruptedException {
        taxPage = new AwrsRegisterTaxPage(driver);
        taxPage.enterUrnValue(text);
    }
    @When("Not found page is returned")
    public void notFoundText(){
        String actual = taxPage.getNotFoundText();
        System.out.println(actual);
        Assert.assertEquals("Not found", actual);
    }
    @Then("search for XXAA 000 0044 5444")
    public void searchForUrn() throws InterruptedException {
        taxPage.clickCheckUrnLink("XXAA 000 0044 5444");
        Thread.sleep(5000);
    }
    @And("Invalid page is returned")
    public void invalidText(){
        String actualText = taxPage.getNoResultText();
        Assert.assertEquals("You must enter a valid Unique Reference Number", actualText);

    }
}
