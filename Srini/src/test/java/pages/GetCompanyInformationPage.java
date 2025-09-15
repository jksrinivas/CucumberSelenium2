package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetCompanyInformationPage {
    WebDriver driver;
    public GetCompanyInformationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "(//a[@class='gem-c-button govuk-button govuk-button--start gem-c-button--bottom-margin'])[1]")
    WebElement startNowButton;

    public void clickStartNowButton(){
        startNowButton.click();
    }
}
