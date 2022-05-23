package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminAddNewCurrencyPage extends BasePage{

    @FindBy (id = "input-title")
    private WebElement adminCurrencyTitleInput;

    @FindBy (id = "input-code")
    private WebElement adminCurrencyCodeInput;

    @FindBy (id = "input-symbol-right")
    private WebElement adminCurrencySymbolInput;

    @FindBy (id = "input-decimal-place")
    private WebElement adminCurrencyDecPlacesInput;

    @FindBy (id = "input-value")
    private WebElement adminCurrencyValueInput;

    @FindBy (id = "input-status")
    private WebElement adminCurrencyStatusSelect;

    @FindBy (xpath = "//*[contains(@class,'btn btn-primary')]")
    private WebElement adminCurrencySaveButton;

    public WebElement getAdminCurrencyTitleInput(){
        return adminCurrencyTitleInput;
    }
    public WebElement getAdminCurrencyCodeInput(){
        return adminCurrencyCodeInput;
    }
    public WebElement getAdminCurrencySymbolInput(){
        return adminCurrencySymbolInput;
    }
    public WebElement getAdminCurrencyDecPlacesInput(){
        return adminCurrencyDecPlacesInput;
    }
    public WebElement getAdminCurrencyValueInput(){
        return adminCurrencyValueInput;
    }
    public WebElement getAdminCurrencyStatusSelect(){
        return adminCurrencyStatusSelect;
    }
    public WebElement getAdminCurrencySaveButton(){
        return adminCurrencySaveButton;
    }
}
