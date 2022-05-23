import navigation.Navigation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AdminAddNewCurrencyPage;
import steps.AdminAddNewCurrencyBL;
import steps.AdminLoginPageBL;
import steps.AdminNavigationPageBL;
import steps.AdminCurrenciesPageBL;

import static enums.URLs.ADMIN_URL;

public class AdminCurrencyTest extends BaseTest{

    @BeforeMethod
    public void login(){
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        new Navigation().navigateByUrl(ADMIN_URL);
        adminLoginPageBL.inputAdminLogin("admin");
        adminLoginPageBL.inputAdminPassword("1234");
        adminLoginPageBL.clickOnAdminLoginButton();
        AdminNavigationPageBL adminNavigationPageBL = new AdminNavigationPageBL();
        adminNavigationPageBL.clickOnAdminNavigationSystem();
        adminNavigationPageBL.selectAdminLocalisationSystem();
        adminNavigationPageBL.selectAdminCurrenciesSystem();
    }

    @Test
    public void adminAddNewCurrency() {
        AdminCurrenciesPageBL adminCurrenciesPageBL = new AdminCurrenciesPageBL();
        adminCurrenciesPageBL.clickOnAdminAddNewCurrencyButton();
        AdminAddNewCurrencyBL adminAddNewCurrencyPage = new AdminAddNewCurrencyBL();
        adminAddNewCurrencyPage.inputAdminCurrencyTitle("Ukrainian hryvnia");
        adminAddNewCurrencyPage.inputAdminCurrencyCode("UAH");
        adminAddNewCurrencyPage.inputAdminCurrencySymbol("₴");
        adminAddNewCurrencyPage.inputAdminCurrencyDecPlaces("2");
        adminAddNewCurrencyPage.inputAdminCurrencyValue("29.56");
        adminAddNewCurrencyPage.selectAdminCurrencyStatus();
        adminAddNewCurrencyPage.clickOnAdminCurrencySaveButton();
    }
}
