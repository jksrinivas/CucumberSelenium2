package stepDefinition;

import io.cucumber.java.en.And;
import pages.CompanyHousePage;
import utilis.driver;

public class CompanyHouseSteps extends driver {
    CompanyHousePage landing;

    @And("I select the {string} link")
    public void clickLink(String text) throws InterruptedException {
        landing = new CompanyHousePage(driver);
        landing.findByCompany();
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        Thread.sleep(6000);
        //Assert.assertEquals(text.contains("Find company information"), true);
        }

    }
