package steps;

import pages.AdminLoginPage;

public class AdminForgottenPasswordBL {
    private AdminLoginPage adminLoginPage;
    public  AdminForgottenPasswordBL () {
        adminLoginPage = new AdminLoginPage();
    }
    public AdminForgottenPasswordBL clickOnAdminForgottenPasswordButton() {
        adminLoginPage.getAdminForgottenPasswordButton().click();
        return this;
    }
    public void inputAdminForgottenPassword (String email) {
        adminLoginPage.getAdminForgottenPasswordInput().clear();
        adminLoginPage.getAdminForgottenPasswordInput().sendKeys(email);
    }
    public AdminForgottenPasswordBL clickOnAdminResetPasswordButton() {
        adminLoginPage.getAdminResetPasswordButton().click();
        return this;
    }
    public AdminForgottenPasswordBL clickOnAdminCancelPasswordButton() {
        adminLoginPage.getAdminCancelPasswordButton().click();
        return this;
    }
}
