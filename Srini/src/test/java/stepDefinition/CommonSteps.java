package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.commonPage;
import utilis.driver;

import java.time.Duration;
import java.util.List;

import static pages.commonPage.getUrl;

public class CommonSteps extends driver {
    static commonPage common;

    @Given("I go to url {string}")
    public static void iGoToUrl(String url) throws InterruptedException {
    common = new commonPage();
        getUrl(url);
    }
    @Then("I validate that the details are displayed")
    public void iValidateThatTheDetailsAreDisplayed(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        String CompanyStatusExpected = data.get(1).get(1);
        String CompanyTypeExpected = data.get(2).get(1);
        String IncorporatedExpected = data.get(3).get(1);


        System.out.println("CompanyStatus " + CompanyStatusExpected);
        System.out.println("CompanyType " + CompanyTypeExpected);
        System.out.println("Incorporated " + IncorporatedExpected);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("company-status")));

        String CompanyStatusActual = driver.findElement(By.id("company-status")).getText();
        String CompanyTypeActual = driver.findElement(By.id("company-type")).getText();
        String IncorporatedActual = driver.findElement(By.id("company-creation-date")).getText();


        Assert.assertEquals(CompanyStatusExpected, CompanyStatusActual);
        Assert.assertEquals(CompanyTypeExpected, CompanyTypeActual);
        Assert.assertEquals(IncorporatedExpected, IncorporatedActual);
    }
}
