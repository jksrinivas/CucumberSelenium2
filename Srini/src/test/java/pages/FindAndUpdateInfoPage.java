package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindAndUpdateInfoPage {
    WebDriver driver;

    public FindAndUpdateInfoPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy (css="#site-search-text")
    WebElement companyNameInputField;
    @FindBy (id="search-submit")
    WebElement searchButton;
    @FindBy (linkText = "GREGGS PLC")
    WebElement greggsLink;

    public void enterCompanyDetails(String companyName) throws InterruptedException {
        companyNameInputField.sendKeys(companyName);
        Thread.sleep(5000);
        searchButton.click();
        Thread.sleep(6000);
    }
    public void clickOnGreggsLink(){
       greggsLink.click();
    }
}
