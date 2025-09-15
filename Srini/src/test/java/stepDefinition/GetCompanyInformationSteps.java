package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GetCompanyInformationPage;
import utilis.driver;


public class GetCompanyInformationSteps extends driver {
    GetCompanyInformationPage getCompanyInfo;
    String actualUrl = "https://www.gov.uk/get-information-about-a-company";

    @Then("I should be on the {string} page")
    public void getCurentUrl(String actual){
        getCompanyInfo = new GetCompanyInformationPage(driver);
        String url = driver.getTitle();
        //String[] myText = url.split("-");
        System.out.println("Current URL: " + url);
        Assert.assertEquals(url,actual);
        //Assert.assertTrue(Arrays.asList(myText).contains(actual));

    }
    @And("I click the Start now button")
    public void i_click_start_now_button() {
        getCompanyInfo.clickStartNowButton();
    }

}
