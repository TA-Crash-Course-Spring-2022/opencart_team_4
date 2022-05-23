package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class AdminNavigationPage extends BasePage {

    @FindBy (xpath = "//a[text() = ' System']")
    private WebElement adminNavigationSystem;

    @FindBy (xpath = "//a[text() = 'Localisation']")
    private WebElement adminNavigationLocalisation;

    @FindBy (xpath = "//a[text() = 'Currencies']")
    private WebElement adminNavigationCurrencies;

    public WebElement getAdminNavigationSystem () {
        return adminNavigationSystem;
    }
    public WebElement getAdminNavigationLocalisation () {
        return adminNavigationLocalisation;
    }
    public WebElement getAdminNavigationCurrencies () {
        return adminNavigationCurrencies;
    }
}
