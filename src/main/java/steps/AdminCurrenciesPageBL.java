package steps;

import driver.DriverRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AdminCurrenciesPage;

import java.time.Duration;

public class AdminCurrenciesPageBL {

    private AdminCurrenciesPage adminCurrenciesPage;

    public AdminCurrenciesPageBL(){
        adminCurrenciesPage = new AdminCurrenciesPage();
    }

    public AdminCurrenciesPageBL clickOnAdminAddNewCurrencyButton(){
        WebDriver driver = DriverRepository.DRIVERS.get();
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(1)).until(ExpectedConditions.elementToBeClickable(adminCurrenciesPage.getAdminAddNewCurrencyButton()));
        adminCurrenciesPage.getAdminAddNewCurrencyButton().click();
        return new AdminCurrenciesPageBL();
    }
}
