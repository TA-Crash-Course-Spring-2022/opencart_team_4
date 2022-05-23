import  navigation.Navigation;

import org.testng.annotations.Test;
import repository.RegisterUserModelRepository;
import steps.HomePageBL;

import static enums.URLs.BASE_URL;

public class UserRegisterTest extends BaseTest{

    @Test
    public void registerValidUserTest(){
        new Navigation().navigateByUrl(BASE_URL);
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewUser(RegisterUserModelRepository.getValidRegisterUser())
                .verifySuccessfulUserRegistration();
    }
}
