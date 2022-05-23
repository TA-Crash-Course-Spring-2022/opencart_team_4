package steps;

import org.testng.Assert;
import pages.MyAccountPage;
import pages.RegisterPage;
import pages.SuccessfulRegisterPage;

public class SuccessfulRegisterPageBL {

    private SuccessfulRegisterPage successfulRegisterPage;

    public SuccessfulRegisterPageBL(){
        successfulRegisterPage = new SuccessfulRegisterPage();
    }

    public SuccessfulRegisterPageBL verifySuccessfulUserRegistration(){
        String expectedMessage = "Your Account Has Been Created!";
        Assert.assertEquals(successfulRegisterPage.getSuccessfulRegistrationMessage().getText(),expectedMessage,"Error - user has not been registered");
        return this;
    }

    public MyAccountPageBL clickOnContinueButton(){
        successfulRegisterPage.getContinueButton().click();
        return new MyAccountPageBL();
    }
}
