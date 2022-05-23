package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminCurrenciesPage extends BasePage{

    @FindBy (xpath = "//*[contains(@class,'btn btn-primary')]")
    private WebElement adminAddNewCurrencyButton;

    public WebElement getAdminAddNewCurrencyButton(){
        return adminAddNewCurrencyButton;
    }
}
