package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BankPaymentPage {
    protected WebDriver driver;
    private By confirmButton = By.cssSelector("#cart_navigation > button > span");

    public BankPaymentPage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public void confirmOrder(){
        driver.findElement(confirmButton).click();
    }
}
