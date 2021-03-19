package Tests;

import Driver.Web;
import Pages.Homepage;
import Pages.WelcomePage;
import Utils.Helper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Web {


    @Test(description = "User can login with valid credentials")
    public void testCase1(){


        Homepage hpage = new Homepage();
        WelcomePage wpage = new WelcomePage();


        hpage.login("steterbas@gmail.com", "Ilyas532,");
        Assert.assertTrue(wpage.isDisplayed(), "Hi certify is not displayed");


    }

}
