package navigation;

import org.openqa.selenium.WebDriver;
import enums.URLs;
import driver.DriverRepository;

public class Navigation {

    private static WebDriver driver;

    public Navigation(){ driver = DriverRepository.DRIVERS.get();}

    public void navigateByUrl(URLs url){
        driver.get(url.getValue());
        driver.manage().window().maximize();
    }
}
