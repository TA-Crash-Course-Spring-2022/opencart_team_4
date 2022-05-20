package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangeMyAccountPasswordPage extends BasePage{

    @FindBy(id = "input-password")
    private WebElement inputPassword;

    @FindBy(id = "input-confirm")
    private WebElement inputConfirmPassword;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/input")
    private WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/a")
    private WebElement backButton;

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getInputConfirmPassword() {
        return inputConfirmPassword;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getBackButton() {
        return backButton;
    }
}
