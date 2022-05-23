package steps;

import org.testng.Assert;
import pages.HomePage;
import pages.MyAccountPage;

public class MyAccountPageBL {

    MyAccountPage myAccountPage;

    public MyAccountPageBL(){
        myAccountPage = new MyAccountPage();
    }

    public MyAccountPageBL clickOnMyAccountButton(){
        myAccountPage.getMyAccountPageButton().click();
        return this;
    }

    public EditMyAccountPageBL clickOnEditAccountButton(){
        myAccountPage.getEditAccountButton().click();
        return new EditMyAccountPageBL();
    }

    public ChangeMyAccountPasswordPageBL clickOnChangePasswordButton(){
        myAccountPage.getChangePasswordButton().click();
        return new ChangeMyAccountPasswordPageBL();
    }

    public SuccessfulLogoutPageBL clickOnLogoutButton(){
        myAccountPage.getLogoutButton().click();
        return new SuccessfulLogoutPageBL();
    }

    public MyAccountPageBL verifySuccessfulUserLogin(){
        String expectedMessage = "My Account";
        Assert.assertEquals(myAccountPage.getSuccessfulLoginMessage().getText(),expectedMessage,"Error - user has not been logined");
        return this;
    }

    public MyAccountPageBL verifySuccessfulChangePassword(){
        String expectedMessage = "Success: Your password has been successfully updated.";
        Assert.assertEquals(myAccountPage.getSuccessfulChangePasswordMessage().getText(),expectedMessage,"Error - user has not been changed password");
        return this;
    }
}
