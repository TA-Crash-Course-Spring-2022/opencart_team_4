package steps;

import models.RegisterUserModel;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;
import pages.RegisterPage;
import pages.SuccessfulRegisterPage;

public class RegisterPageBL {

    private RegisterPage registerPage;
    private SuccessfulRegisterPage successfulRegisterPage;

    public RegisterPageBL(){
        registerPage = new RegisterPage();
    }

    public SuccessfulRegisterPageBL registerNewUser(RegisterUserModel registerUserModel){
        inputFirstName(registerUserModel.getFirstName());
        inputLastName(registerUserModel.getLastName());
        inputEmail(registerUserModel.getEmail());
        inputTelephone(registerUserModel.getTelephone());
        inputPassword(registerUserModel.getPassword());
        inputPasswordConfirm(registerUserModel.getPasswordConfirm());
        clickSubscribeButton(1);
        selectPrivacyPolicyCheckbox();
        clickOnContinueButton();
        successfulRegisterPage = new SuccessfulRegisterPage();
        return new SuccessfulRegisterPageBL();
    }

    public RegisterPageBL registerNewUserWithoutInfo(RegisterUserModel registerUserModel){
        selectPrivacyPolicyCheckbox();
        clickOnContinueButton();
        return this;
    }

    public RegisterPageBL registerNewUserWithInvalidEmail(RegisterUserModel registerUserModel){
        inputFirstName(registerUserModel.getFirstName());
        inputLastName(registerUserModel.getLastName());
        inputEmail(registerUserModel.getEmail());
        inputTelephone(registerUserModel.getTelephone());
        inputPassword(registerUserModel.getPassword());
        inputPasswordConfirm(registerUserModel.getPasswordConfirm());
        clickSubscribeButton(1);
        selectPrivacyPolicyCheckbox();
        clickOnContinueButton();
        return this;
    }

    public RegisterPageBL registerNewUserWithInvalidConfirmPassword(RegisterUserModel registerUserModel){
        inputFirstName(registerUserModel.getFirstName());
        inputLastName(registerUserModel.getLastName());
        inputEmail(registerUserModel.getEmail());
        inputTelephone(registerUserModel.getTelephone());
        inputPassword(registerUserModel.getPassword());
        inputPasswordConfirm(registerUserModel.getPasswordConfirm());
        clickSubscribeButton(1);
        selectPrivacyPolicyCheckbox();
        clickOnContinueButton();
        return this;
    }

    private void inputFirstName(String name){
        try{
            registerPage.getFirstNameInput().clear();
        }catch (StaleElementReferenceException ex){
            registerPage.getFirstNameInput().clear();
        }
        registerPage.getFirstNameInput().sendKeys(name);
    }

    private void inputLastName(String lastName){
        registerPage.getLastNameInput().clear();
        registerPage.getLastNameInput().sendKeys(lastName);
    }

    private void inputEmail(String email){
        registerPage.getEmailInput().clear();
        registerPage.getEmailInput().sendKeys(email);
    }

    private void inputTelephone(String telephone){
        registerPage.getTelephoneInput().clear();
        registerPage.getTelephoneInput().sendKeys(telephone);
    }

    private void inputPassword(String password){
        registerPage.getPasswordInput().clear();
        registerPage.getPasswordInput().sendKeys(password);
    }

    private void inputPasswordConfirm(String passwordConfirm){
        registerPage.getPasswordConfirmInput().clear();
        registerPage.getPasswordConfirmInput().sendKeys(passwordConfirm);
    }

    private void clickSubscribeButton(int value){
        registerPage.getRadioButton(value).click();
    }

    private void selectPrivacyPolicyCheckbox(){
        registerPage.getPrivacyPolicyCheckbox().click();
    }

    private void clickOnContinueButton(){
        registerPage.getContinueButton().click();
    }

    public RegisterPageBL verifyUnsuccessfulUserRegistration(){
        String expectedMessage = "First Name must be between 1 and 32 characters!";
        Assert.assertEquals(registerPage.getUnsuccessfulRegistrationMessage().getText(),expectedMessage,"Error - user has been registered");
        return this;
    }

    public RegisterPageBL verifyInvalidEmailInput(){
        String expectedMessage = "E-Mail Address does not appear to be valid!";
        Assert.assertEquals(registerPage.getEmailDangerText().getText(),expectedMessage,"Error - user has been registered");
        return this;
    }

    public RegisterPageBL verifyInvalidConfirmPasswordInput(){
        String expectedMessage = "Password confirmation does not match password!";
        Assert.assertEquals(registerPage.getConfirmPasswordDangerText().getText(),expectedMessage,"Error - user has been registered");
        return this;
    }


}
