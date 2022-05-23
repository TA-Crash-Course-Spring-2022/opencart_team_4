package steps;

import org.testng.Assert;
import pages.MyAccountPage;
import pages.SuccessfulLogoutPage;

public class SuccessfulLogoutPageBL {

    private SuccessfulLogoutPage successfulLogoutPage;
    public SuccessfulLogoutPageBL(){successfulLogoutPage = new SuccessfulLogoutPage();}

    public SuccessfulLogoutPageBL verifySuccessfulUserLogout(){
        String expectedMessage = "Account Logout";
        Assert.assertEquals(successfulLogoutPage.getSuccessfulLogoutMessage().getText(),expectedMessage,"Error - user has not been logouted");
        return this;
    }

    public HomePageBL clickOnContinueButton(){
        successfulLogoutPage.getContinueButton().click();
        return new HomePageBL();
    }
}
