package Tests;

import Driver.Web;
import Pages.Homepage;
import Pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLogin extends Web {
    @Test(description = "User should not be able to login with valid credentials")
    public void testCase2(){

        Homepage hpage = new Homepage();
        WelcomePage wpage = new WelcomePage();
        hpage.login("steterbas@gmail.com", "Ilyas5,");
        Assert.assertTrue(wpage.isDisplayed(), "Hi certify is not displayed");


    }
}
