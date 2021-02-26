package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage {
    protected WebDriver driver;
    private By proceedToCheckoutButton = By.cssSelector("button[name=\"processAddress\"]");

    public AddressPage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public void proceedToCheckout(){
        driver.findElement(proceedToCheckoutButton).click();
    }
}
