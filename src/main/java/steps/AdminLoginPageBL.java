package steps;

import io.qameta.allure.Step;
import models.AdminLoginPageModel;
import org.testng.Assert;
import pages.AdminLoginPage;

import java.sql.SQLOutput;

public class AdminLoginPageBL {

    private AdminLoginPage adminLoginPage;

    public AdminLoginPageBL() {
        adminLoginPage = new AdminLoginPage();
    }

    public AdminLoginPageBL clickOnAdminLoginButton() {
        adminLoginPage.getAdminLoginButton().click();
        return this;
    }

    public AdminLoginPageBL inputAdminLogin(String login) {
        adminLoginPage.getAdminLoginInput().clear();
        adminLoginPage.getAdminLoginInput().sendKeys(login);
        return this;
    }

    public AdminLoginPageBL inputAdminPassword(String password) {
        adminLoginPage.getAdminPasswordInput().clear();
        adminLoginPage.getAdminPasswordInput().sendKeys(password);
        return this;
    }

    public AdminLoginPageBL verifyUnsuccessfulLoginMessage() {
        Assert.assertTrue(adminLoginPage.getUnsuccessfulLoginMessage().getText().contains("No match for Username and/or Password."));
        return this;
    }

    @Step("InvalidAdminLogin")
    public AdminLoginPageBL invalidAdminLogin(AdminLoginPageModel adminLoginPageModel){
        inputAdminLogin(adminLoginPageModel.getAdminUsername());
        inputAdminPassword(adminLoginPageModel.getAdminPassword());
        clickOnAdminLoginButton();
        return this;
    }
}
