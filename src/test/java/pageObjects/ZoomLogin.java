package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZoomLogin extends BasePage {

    public ZoomLogin(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//a[@class='zdcm-main-nav__link js-analytics-cta'])[2]")
    WebElement signInLink;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailInput;

    @FindBy(xpath = "(//span[@class='zm-button__slot'])[4]")
    WebElement nextButton;

    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordInput;

    @FindBy(xpath = "//span[@class='zm-checkbox__inner']")
    WebElement rememberButton;

    @FindBy(xpath = "//button[@id='js_btn_login']")
    WebElement loginButton;

    public void signInClick() {
        explicitWait(signInLink);
        signInLink.click();
    }

    public void setEmailInput(String email) {
        explicitWait(emailInput);
        emailInput.sendKeys(email);
    }

    public void clickNextButton() {
        nextButton.click();
    }

    public void setPasswordInput(String password) {
        explicitWait(passwordInput);
        passwordInput.sendKeys(password);
        rememberButton.click();
    }

    public void clickLoginButton() {
        explicitWait(loginButton);
        loginButton.click();
    }
}
