package Pages;

import Driver.Web;
import org.openqa.selenium.By;

public class Basepage {

    public void clickThis(By locator){
        Web.getDriver().findElement(locator).click();
    }
    public void type(By locator, String user){
        Web.getDriver().findElement(locator).sendKeys(user);
    }
    public boolean isElementDisplayed(By locator){ return Web.getDriver().findElement(locator).isDisplayed(); }

}
