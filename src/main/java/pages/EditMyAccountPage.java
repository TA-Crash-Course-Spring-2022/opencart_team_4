package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditMyAccountPage extends BasePage{

    @FindBy(id = "input-firstname")
    private WebElement inputFirstName;

    @FindBy(id = "input-lastname")
    private WebElement inputLastName;

    @FindBy(id = "input-email")
    private WebElement inputEmail;

    @FindBy(id = "input-telephone")
    private WebElement inputTelephone;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/input")
    private WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/a")
    private WebElement backButton;

    public WebElement getFirstNameInput() {
        return inputFirstName;
    }

    public WebElement getLastNameInput() {
        return inputLastName;
    }

    public WebElement getEmailInput() {
        return inputEmail;
    }

    public WebElement getTelephoneInput() {
        return inputTelephone;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getBackButton() {
        return backButton;
    }
}
