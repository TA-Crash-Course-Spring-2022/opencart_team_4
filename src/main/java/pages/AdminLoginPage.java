package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLoginPage extends BasePage {
    @FindBy (id = "input-username")
    private WebElement adminLoginInput;

    @FindBy (id = "input-password")
    private WebElement adminPasswordInput;

    @FindBy (xpath = "//*[contains(@class,'btn btn-primary')]")
    private WebElement adminLoginButton;

    @FindBy (xpath = "//a[@href = 'http://localhost/opencart/admin/index.php?route=common/forgotten']")
    private WebElement adminForgottenPasswordButton;

    @FindBy (id = "input-email")
    private WebElement adminForgottenPasswordInput;

    @FindBy (xpath = "//*[contains(@class,'btn btn-primary')]")
    private WebElement adminResetPasswordButton;

    @FindBy (xpath = "//*[contains(@class,'btn btn-default')]")
    private WebElement adminCancelPasswordButton;

    @FindBy (xpath = "//*[contains(@class,'alert alert-danger alert-dismissible')]")
    private WebElement unsuccessfulLoginMessage;

    public WebElement getAdminLoginInput (){

        return adminLoginInput;
    }
    public WebElement getAdminPasswordInput (){

        return adminPasswordInput;
    }
    public WebElement getAdminLoginButton (){

        return adminLoginButton;
    }
    public WebElement getAdminForgottenPasswordButton (){

        return adminForgottenPasswordButton;
    }
    public WebElement getAdminForgottenPasswordInput () {

        return adminForgottenPasswordInput;
    }
    public WebElement getAdminResetPasswordButton () {

        return adminResetPasswordButton;
    }
    public WebElement getAdminCancelPasswordButton () {

        return adminCancelPasswordButton;
    }
    public WebElement getUnsuccessfulLoginMessage () {
        return unsuccessfulLoginMessage;
    }
}
