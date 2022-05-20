package steps;

import models.RegisterUserModel;
import org.testng.Assert;
import pages.EditMyAccountPage;
import pages.MyAccountPage;

public class EditMyAccountPageBL {

    private EditMyAccountPage editMyAccountPage;
    private MyAccountPage myAccountPage;

    public EditMyAccountPageBL(){
        editMyAccountPage = new EditMyAccountPage();
    }

    public MyAccountPageBL changeUserInfo(RegisterUserModel registerUserModel){
        inputFirstName(registerUserModel.getFirstName());
        inputLastName(registerUserModel.getLastName());
        inputEmail(registerUserModel.getEmail());
        inputTelephone(registerUserModel.getTelephone());
        clickOnContinueButton();
        myAccountPage = new MyAccountPage();
        return new MyAccountPageBL();
    }

    public EditMyAccountPageBL vefifyChangeUserInfo(RegisterUserModel registerUserModel){
        Assert.assertEquals(registerUserModel.getFirstName(),getFirstName(),"Error - First name not changed");
        Assert.assertEquals(registerUserModel.getLastName(),getLastName(),"Error - Last name not changed");
        Assert.assertEquals(registerUserModel.getEmail(),getEmail(),"Error - Email not changed");
        Assert.assertEquals(registerUserModel.getTelephone(),getTelephone(),"Error - Telephone not changed");
        return this;
    }


    private void inputFirstName(String firstName){
        editMyAccountPage.getFirstNameInput().clear();
        editMyAccountPage.getFirstNameInput().sendKeys(firstName);
    }

    private void inputLastName(String lastName){
        editMyAccountPage.getLastNameInput().clear();
        editMyAccountPage.getLastNameInput().sendKeys(lastName);
    }

    private void inputEmail(String email){
        editMyAccountPage.getEmailInput().clear();
        editMyAccountPage.getEmailInput().sendKeys(email);
    }

    private void inputTelephone(String telephone){
        editMyAccountPage.getTelephoneInput().clear();
        editMyAccountPage.getTelephoneInput().sendKeys(telephone);
    }

    private void clickOnContinueButton(){
        editMyAccountPage.getContinueButton().click();
    }

    private void clickOnBackButton(){
        editMyAccountPage.getBackButton().click();
    }

    private String getFirstName(){
        return editMyAccountPage.getFirstNameInput().getAttribute("value");
    }

    private String getLastName(){
        return editMyAccountPage.getLastNameInput().getAttribute("value");
    }

    private String getEmail(){
        return editMyAccountPage.getEmailInput().getAttribute("value");
    }

    private String getTelephone(){
        return editMyAccountPage.getTelephoneInput().getAttribute("value");
    }
}
