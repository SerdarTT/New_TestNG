package Pages;

import org.openqa.selenium.By;

public class Homepage extends Basepage{

    By clickLogin = By.xpath("//button[@class='btn btn-primary']");
    By enterUName = By.id("email");
    By enterPwd = By.id("password");




    public void enterUserName(String user){
        type(enterUName, user);
    }
    public void password(String pwd){
        type(enterPwd, pwd);
    }
    public void clickToLogIn(){
        clickThis(clickLogin);
    }



}
