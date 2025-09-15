package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.FindAndUpdateInfoPage;
import utilis.driver;

public class FindAndUpdateCompanyInfoSteps extends driver {
    FindAndUpdateInfoPage infoPage;


    @When("I search for company {string} and view the company details")
    public void enterCompanyName(String company) throws InterruptedException {
        infoPage = new FindAndUpdateInfoPage(driver);
        infoPage.enterCompanyDetails(company);
    }
    @And("I select the GREGGS PLC link")
    public void selectGreggsLink(){
        infoPage.clickOnGreggsLink();
    }


}


