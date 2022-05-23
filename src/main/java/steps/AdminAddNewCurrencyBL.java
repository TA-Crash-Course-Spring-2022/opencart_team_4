package steps;

import org.openqa.selenium.support.ui.Select;
import pages.AdminAddNewCurrencyPage;

public class AdminAddNewCurrencyBL {

    private AdminAddNewCurrencyPage adminAddNewCurrencyPage;

    public AdminAddNewCurrencyBL(){
        adminAddNewCurrencyPage = new AdminAddNewCurrencyPage();
    }
    public AdminAddNewCurrencyBL inputAdminCurrencyTitle(String title){
        adminAddNewCurrencyPage.getAdminCurrencyTitleInput().clear();
        adminAddNewCurrencyPage.getAdminCurrencyTitleInput().sendKeys(title);
        return this;
    }
    public AdminAddNewCurrencyBL inputAdminCurrencyCode(String code){
        adminAddNewCurrencyPage.getAdminCurrencyCodeInput().clear();
        adminAddNewCurrencyPage.getAdminCurrencyCodeInput().sendKeys(code);
        return this;
    }
    public AdminAddNewCurrencyBL inputAdminCurrencySymbol(String symbol){
        adminAddNewCurrencyPage.getAdminCurrencySymbolInput().clear();
        adminAddNewCurrencyPage.getAdminCurrencySymbolInput().sendKeys(symbol);
        return this;
    }
    public AdminAddNewCurrencyBL inputAdminCurrencyDecPlaces(String dec){
        adminAddNewCurrencyPage.getAdminCurrencyDecPlacesInput().clear();
        adminAddNewCurrencyPage.getAdminCurrencyDecPlacesInput().sendKeys(dec);
        return this;
    }
    public AdminAddNewCurrencyBL inputAdminCurrencyValue(String value){
        adminAddNewCurrencyPage.getAdminCurrencyValueInput().clear();
        adminAddNewCurrencyPage.getAdminCurrencyValueInput().sendKeys(value);
        return this;
    }
    public AdminAddNewCurrencyBL selectAdminCurrencyStatus(){;
        Select adminCurrencyStatus = new Select(adminAddNewCurrencyPage.getAdminCurrencyStatusSelect());
        adminCurrencyStatus.selectByValue("1");
        return this;
    }
    public AdminAddNewCurrencyBL clickOnAdminCurrencySaveButton(){
        adminAddNewCurrencyPage.getAdminCurrencySaveButton().click();
        return this;
    }
}
