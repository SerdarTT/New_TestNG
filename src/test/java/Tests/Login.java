package Tests;

import Driver.Web;
import Pages.Homepage;
import Pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Web {


    @Test(description = "User can login with valid credentials")
    public void userCanLoginUsingValidCredentials(){


        Homepage hpage = new Homepage();
        WelcomePage wpage = new WelcomePage();


        hpage.enterUserName("steterbas@gmail.com");
        hpage.password("Ilyas532,");
        hpage.clickToLogIn();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(wpage.isDisplayed(), "Hi certify is not displayed");


    }
}
