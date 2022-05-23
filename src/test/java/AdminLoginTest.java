import navigation.Navigation;
import org.testng.annotations.Test;
import repository.AdminLoginPageRepository;
import steps.AdminLoginPageBL;

import static enums.URLs.ADMIN_URL;

public class AdminLoginTest extends BaseTest {

    @Test
    public void validAdminLoginTest() {
        new Navigation().navigateByUrl(ADMIN_URL);
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL.inputAdminLogin("admin");
        adminLoginPageBL.inputAdminPassword("1234");
        adminLoginPageBL.clickOnAdminLoginButton();
    }

    @Test
    public void inValidAdminLoginTest () {
        new Navigation().navigateByUrl(ADMIN_URL);
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL.invalidAdminLogin(AdminLoginPageRepository.getInvalidAdminLogin());
        adminLoginPageBL.verifyUnsuccessfulLoginMessage();
    }
}

