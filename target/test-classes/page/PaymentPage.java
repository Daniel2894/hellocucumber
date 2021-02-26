package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
    protected WebDriver driver;
    private By payByBankButton = By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");

    public PaymentPage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public void payByBankWire(){
        driver.findElement(payByBankButton).click();
    }
}
