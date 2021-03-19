package Pages;

import org.openqa.selenium.By;

public class WelcomePage extends Basepage{


    By findCertify = By.xpath("//h3[@class='title']");




    public boolean isDisplayed(){ return isElementDisplayed(findCertify); }

}
