import models.RegisterUserModel;
import  navigation.Navigation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import repository.RegisterUserModelRepository;
import steps.HomePageBL;
import steps.MyAccountPageBL;

import static enums.URLs.BASE_URL;

public class UserLoginAndLogoutTest extends BaseTest{

    RegisterUserModel validUserModel;

    @BeforeMethod
    public void registerValidUser(){
        validUserModel  = RegisterUserModelRepository.getValidRegisterUser();
        new Navigation().navigateByUrl(BASE_URL);
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewUser(validUserModel)
                .verifySuccessfulUserRegistration()
                .clickOnContinueButton();
    }

    @Test
    public void loginAndLogoutUserPositiveTest(){
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL.clickOnLogoutButton()
                .verifySuccessfulUserLogout()
                .clickOnContinueButton()
                .getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginUser(validUserModel)
                .verifySuccessfulUserLogin();
    }

    @Test
    public void loginUserWithoutPasswordNegativeTest(){
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL.clickOnLogoutButton()
                .verifySuccessfulUserLogout()
                .clickOnContinueButton()
                .getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginUserWithoutPassword(validUserModel)
                .verifyUnsuccessfulUserLoginWithoutPassword();
    }

    @Test
    public void loginUserWithoutEmailNegativeTest(){
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL.clickOnLogoutButton()
                .verifySuccessfulUserLogout()
                .clickOnContinueButton()
                .getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginUserWithoutEmail(validUserModel)
                .verifyUnsuccessfulUserLoginWithoutEmail();
    }
}
