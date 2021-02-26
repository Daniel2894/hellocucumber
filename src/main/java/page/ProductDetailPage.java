package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage {
    protected WebDriver driver;

    private By addToCartButton = By.cssSelector("#add_to_cart > button");

    public ProductDetailPage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public void addToCart(){
        driver.findElement(addToCartButton).click();
    }

}
