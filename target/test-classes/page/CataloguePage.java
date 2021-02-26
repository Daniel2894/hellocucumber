package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CataloguePage {
    protected WebDriver driver;

    public CataloguePage(WebDriver webDriver){
        this.driver = webDriver;
    }

    private By searchProductByName(String name){
        return By.cssSelector(".product-image-container > a[title='" + name + "']");
    }

    public void selectProduct(String name){
        driver.findElement(this.searchProductByName(name)).click();
    }
}
