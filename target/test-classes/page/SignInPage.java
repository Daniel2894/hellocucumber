package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    protected WebDriver driver;
    private By emailInput = By.id("email");
    private By passwordInput = By.id("passwd");
    private By signInButton = By.id("SubmitLogin");

    public SignInPage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public void signIn(String email, String password){
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(signInButton).click();
    }
}
