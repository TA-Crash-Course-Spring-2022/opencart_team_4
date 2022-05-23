import navigation.Navigation;
import org.testng.annotations.Test;
import steps.AdminForgottenPasswordBL;

import static enums.URLs.ADMIN_URL;

public class AdminForgottenPasswordTest extends BaseTest{

    @Test
    public void adminForgottenPasswordTest () {
        new Navigation().navigateByUrl(ADMIN_URL);
        AdminForgottenPasswordBL adminForgottenPasswordBL = new AdminForgottenPasswordBL();
        adminForgottenPasswordBL.clickOnAdminForgottenPasswordButton();
        adminForgottenPasswordBL.inputAdminForgottenPassword("admin@gmail.com");
        adminForgottenPasswordBL.clickOnAdminResetPasswordButton();
    }

    @Test
    public void adminForgottenPasswordCloseButtonTest () {
        new Navigation().navigateByUrl(ADMIN_URL);
        AdminForgottenPasswordBL adminForgottenPasswordBL = new AdminForgottenPasswordBL();
        adminForgottenPasswordBL.clickOnAdminForgottenPasswordButton();
        adminForgottenPasswordBL.clickOnAdminCancelPasswordButton();
    }
}
