package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AwrsRegisterTaxPage {
    WebDriver driver;
    WebDriverWait wait;

    public AwrsRegisterTaxPage( WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }
    @FindBy (id = "query")
    WebElement searchText;
    @FindBy (id = "search")
    WebElement searchButton;
    @FindBy (id = "not-found")
    WebElement notFoundText;
    @FindBy (linkText = "Check a URN")
    WebElement checkUrnLink;
    @FindBy (id = "no-results-search-term")
    WebElement noResultText;

    public void enterUrnValue(String value){
        wait.until(ExpectedConditions.visibilityOf(searchText));
        searchText.sendKeys(value);
        searchButton.click();
    }
    public String getNotFoundText(){
      return notFoundText.getText();

    }
    public void clickCheckUrnLink(String value){
        checkUrnLink.click();
        searchText.sendKeys(value);
        searchButton.click();
    }
    public String getNoResultText(){
        return noResultText.getText();
    }

}
