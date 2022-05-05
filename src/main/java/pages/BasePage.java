package pages;

import driver.DriverRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        driver = DriverRepository.DRIVERS.get();
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        PageFactory.initElements(driver,this);
    }
}
