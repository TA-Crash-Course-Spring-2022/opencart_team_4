package steps;

import driver.DriverRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AdminNavigationPage;

import java.time.Duration;

public class AdminNavigationPageBL {

    private AdminNavigationPage adminNavigationPage;

    public AdminNavigationPageBL() {
        adminNavigationPage = new AdminNavigationPage();
    }

    public AdminNavigationPageBL clickOnAdminNavigationSystem() {
        adminNavigationPage.getAdminNavigationSystem().click();
        return this;
    }
    public AdminNavigationPageBL selectAdminLocalisationSystem() {
        WebDriver driver = DriverRepository.DRIVERS.get();
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(1)).until(ExpectedConditions.elementToBeClickable(adminNavigationPage.getAdminNavigationLocalisation()));
        adminNavigationPage.getAdminNavigationLocalisation().click();
        return this;
    }
    public AdminCurrenciesPageBL selectAdminCurrenciesSystem() {
        WebDriver driver = DriverRepository.DRIVERS.get();
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.elementToBeClickable(adminNavigationPage.getAdminNavigationLocalisation()));
        adminNavigationPage.getAdminNavigationCurrencies().click();
        return new AdminCurrenciesPageBL();
    }
}
