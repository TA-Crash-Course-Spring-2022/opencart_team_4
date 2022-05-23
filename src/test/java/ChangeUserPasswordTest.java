import models.RegisterUserModel;
import  navigation.Navigation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import repository.RegisterUserModelRepository;
import steps.HomePageBL;
import steps.MyAccountPageBL;

import static enums.URLs.BASE_URL;


public class ChangeUserPasswordTest extends BaseTest{

    RegisterUserModel validUserModel;

    @BeforeMethod
    public void registerValidUser(){
        validUserModel = RegisterUserModelRepository.getValidRegisterUser();
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
    public void changeUserPasswordPositiveTest() {
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL.clickOnChangePasswordButton()
                .changeUserPasswordPositiveScenario(validUserModel)
                .clickOnLogoutButton()
                .verifySuccessfulUserLogout()
                .clickOnContinueButton()
                .getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginUser(validUserModel)
                .verifySuccessfulUserLogin();
    }

    @Test
    public void changeUserPasswordNegativeTest() {
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL.clickOnChangePasswordButton()
                .changeUserPasswordNegativeScenario(validUserModel)
                .verifyInvalidChangePasswordInput();
    }
}
