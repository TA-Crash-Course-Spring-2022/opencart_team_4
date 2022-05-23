package steps;

import models.RegisterUserModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import pages.ChangeMyAccountPasswordPage;
import pages.MyAccountPage;

public class ChangeMyAccountPasswordPageBL {

    ChangeMyAccountPasswordPage changeMyAccountPasswordPage;
    MyAccountPage myAccountPage;

    public ChangeMyAccountPasswordPageBL(){
        changeMyAccountPasswordPage = new ChangeMyAccountPasswordPage();
    }

    public MyAccountPageBL changeUserPasswordPositiveScenario(RegisterUserModel registerUserModel){
        String password = RandomStringUtils.randomAlphabetic(12);
        registerUserModel.setPassword(password);
        registerUserModel.setPasswordConfirm(password);
        inputPassword(registerUserModel.getPassword());
        inputConfirmPassword(registerUserModel.getPasswordConfirm());
        clickOnContinueButton();
        myAccountPage = new MyAccountPage();
        return new MyAccountPageBL();
    }

    public ChangeMyAccountPasswordPageBL changeUserPasswordNegativeScenario(RegisterUserModel registerUserModel){
        registerUserModel.setPassword(RandomStringUtils.randomAlphabetic(12));
        registerUserModel.setPasswordConfirm(RandomStringUtils.randomAlphabetic(12));
        inputPassword(registerUserModel.getPassword());
        inputConfirmPassword(registerUserModel.getPasswordConfirm());
        clickOnContinueButton();
        return this;
    }

    public ChangeMyAccountPasswordPageBL verifyInvalidChangePasswordInput(){
        String expectedMessage = "Password confirmation does not match password!";
        Assert.assertEquals(changeMyAccountPasswordPage.getConfirmPasswordDangerText().getText(),expectedMessage,"Error - email was changed!");
        return this;
    }

    private void inputPassword(String password){
        changeMyAccountPasswordPage.getInputPassword().clear();
        changeMyAccountPasswordPage.getInputPassword().sendKeys(password);
    }

    private void inputConfirmPassword(String confirm){
        changeMyAccountPasswordPage.getInputConfirmPassword().clear();
        changeMyAccountPasswordPage.getInputConfirmPassword().sendKeys(confirm);
    }

    private void clickOnContinueButton(){
        changeMyAccountPasswordPage.getContinueButton().click();
    }

    private void clickOnBackButton(){
        changeMyAccountPasswordPage.getBackButton().click();
    }
}
