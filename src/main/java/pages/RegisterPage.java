package pages;

import  org.openqa.selenium.By;
import  org.openqa.selenium.WebElement;
import  org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

    @FindBy(id = "input-firstname")
    private WebElement firstNameInput;

    @FindBy(id = "input-lastname")
    private WebElement lastNameInput;

    @FindBy(id = "input-email")
    private WebElement emailInput;

    @FindBy(id = "input-telephone")
    private WebElement telephoneInput;

    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @FindBy(id = "input-confirm")
    private WebElement passwordConfirmInput;

    @FindBy(xpath = ".//*[@type='checkbox']")
    private WebElement privacyPolicyCheckbox;

    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"account\"]/div[2]/div/div"  )
    private WebElement firstNameDangerText;

    public WebElement getRadioButton(int value){
        return driver.findElement(By.xpath(".//*[@class='radio-inline']/*[@type='radio' and @value='"+value+"']"));
    }

    public WebElement getFirstNameInput(){
        return firstNameInput;
    }

    public WebElement getLastNameInput(){
        return lastNameInput;
    }

    public WebElement getEmailInput(){
        return emailInput;
    }

    public WebElement getTelephoneInput(){
        return telephoneInput;
    }

    public WebElement getPrivacyPolicyCheckbox(){
        return privacyPolicyCheckbox;
    }

    public WebElement getPasswordInput(){
        return passwordInput;
    }

    public WebElement getPasswordConfirmInput(){
        return passwordConfirmInput;
    }

    public WebElement getContinueButton(){
        return continueButton;
    }

    public WebElement getUnsuccessfulRegistrationMessage(){
        return firstNameDangerText;
    }
}
