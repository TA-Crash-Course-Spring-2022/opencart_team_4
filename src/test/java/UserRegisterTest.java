import  navigation.Navigation;

import org.testng.annotations.Test;
import repository.RegisterUserModelRepository;
import steps.HomePageBL;

import static enums.URLs.BASE_URL;

public class UserRegisterTest extends BaseTest{

    @Test
    public void registerValidUserPositiveTest(){
        new Navigation().navigateByUrl(BASE_URL);
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewUser(RegisterUserModelRepository.getValidRegisterUser())
                .verifySuccessfulUserRegistration();
    }

    @Test
    public void registerWithoutInfoUserNegativeTest(){
        new Navigation().navigateByUrl(BASE_URL);
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewUserWithoutInfo(RegisterUserModelRepository.getInvalidRegisterUser())
                .verifyUnsuccessfulUserRegistration();
    }

    @Test
    public void registerUserWithInvalidEmailNegativeTest(){
        new Navigation().navigateByUrl(BASE_URL);
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewUserWithInvalidEmail(RegisterUserModelRepository.getUserWithInvalidEmail())
                .verifyInvalidEmailInput();
    }

    @Test
    public void registerUserWithInvalidConfirmPasswordNegativeTest(){
        new Navigation().navigateByUrl(BASE_URL);
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewUserWithInvalidConfirmPassword(RegisterUserModelRepository.getUserWithInvalidConfirmPassword())
                .verifyInvalidConfirmPasswordInput();
    }
}
