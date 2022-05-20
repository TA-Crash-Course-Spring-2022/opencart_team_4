package steps;

import models.RegisterUserModel;
import org.testng.Assert;
import pages.LoginPage;
import pages.MyAccountPage;

public class LoginPageBL {

    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    public LoginPageBL(){
        loginPage = new LoginPage();
    }

    public MyAccountPageBL loginUser(RegisterUserModel registerUserModel){
        inputEmail(registerUserModel.getEmail());
        inputPassword(registerUserModel.getPassword());
        clickOnLoginButton();
        myAccountPage = new MyAccountPage();
        return new MyAccountPageBL();
    }

    public LoginPageBL loginUserWithoutPassword(RegisterUserModel registerUserModel){
        inputEmail(registerUserModel.getEmail());
        clickOnLoginButton();
        return this;
    }

    public LoginPageBL loginUserWithoutEmail(RegisterUserModel registerUserModel){
        inputPassword(registerUserModel.getPassword());
        clickOnLoginButton();
        return this;
    }

    private void inputEmail(String email){
        loginPage.getEmailInput().clear();
        loginPage.getEmailInput().sendKeys(email);
    }

    private void inputPassword(String password){
        loginPage.getPasswordInput().clear();
        loginPage.getPasswordInput().sendKeys(password);
    }

    private void clickOnLoginButton(){
        loginPage.getLoginButton().click();
    }

    public LoginPageBL verifyUnsuccessfulUserLoginWithoutPassword(){
        String expectedMessage = "Warning: No match for E-Mail Address and/or Password.";
        Assert.assertEquals(loginPage.getUnsuccessfulLoginMessage().getText(),expectedMessage,"Error - user has been logined");
        return this;
    }

    public LoginPageBL verifyUnsuccessfulUserLoginWithoutEmail(){
        String expectedMessage = "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.";
        Assert.assertEquals(loginPage.getUnsuccessfulLoginMessage().getText(),expectedMessage,"Error - user has been logined");
        return this;
    }
}
