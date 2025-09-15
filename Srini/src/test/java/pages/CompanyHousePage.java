package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyHousePage {
    WebDriver driver;

    public CompanyHousePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Find company information")
    WebElement findCompanyInfoLink;

    public void findByCompany(){
            findCompanyInfoLink.click();

    }
}
