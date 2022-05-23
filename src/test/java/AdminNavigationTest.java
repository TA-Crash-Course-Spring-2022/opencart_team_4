import navigation.Navigation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.AdminLoginPageBL;
import steps.AdminNavigationPageBL;

import static enums.URLs.ADMIN_URL;

public class AdminNavigationTest extends BaseTest {

    @BeforeMethod
    public void login(){
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        new Navigation().navigateByUrl(ADMIN_URL);
        adminLoginPageBL.inputAdminLogin("admin");
        adminLoginPageBL.inputAdminPassword("1234");
        adminLoginPageBL.clickOnAdminLoginButton();
    }

    @Test
    public void adminNavigationTest() {
        AdminNavigationPageBL adminNavigationPageBL = new AdminNavigationPageBL();
        adminNavigationPageBL.clickOnAdminNavigationSystem();
        adminNavigationPageBL.selectAdminLocalisationSystem();
        adminNavigationPageBL.selectAdminCurrenciesSystem();
    }
}
