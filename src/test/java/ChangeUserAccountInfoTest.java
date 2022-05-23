import models.RegisterUserModel;
import  navigation.Navigation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import repository.RegisterUserModelRepository;
import steps.HomePageBL;
import steps.MyAccountPageBL;

import static enums.URLs.BASE_URL;

public class ChangeUserAccountInfoTest extends BaseTest{

    RegisterUserModel validUserModel;
    RegisterUserModel validChangedUserModel;
    RegisterUserModel invalidEmailUserModel;

    @BeforeMethod
    public void registerValidUser(){
        validUserModel = RegisterUserModelRepository.getValidRegisterUser();
        validChangedUserModel = RegisterUserModelRepository.getValidRegisterUser();
        invalidEmailUserModel = RegisterUserModelRepository.getUserWithInvalidEmail();
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
    public void changeUserAccountInfoPositiveTest(){
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL.clickOnEditAccountButton()
                .changeUserInfo(validChangedUserModel)
                .clickContinueButtonPositiveScenario()
                .clickOnEditAccountButton()
                .verifyChangeUserInfo(validChangedUserModel);
    }

    @Test
    public void changeUserAccountWithInvalidEmailNegativeTest(){
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL.clickOnEditAccountButton()
                .changeUserInfo(invalidEmailUserModel)
                .clickContinueButtonNegativeScenario()
                .verifyInvalidEmailInput();
    }
}
