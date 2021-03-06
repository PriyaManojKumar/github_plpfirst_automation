package com.ea.SpringBasic.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage {

    @FindBy(how = How.NAME, using="UserName")
    public WebElement txtUserName;
    @FindBy(how = How.NAME, using="Password")
    public WebElement txtPassword;
    @FindBy(how=How.CSS, using=".btn-default")
    public WebElement btnLogin;

    public void Login(String username, String password){
       // txtUserName.sendKeys(username);
       // txtPassword.sendKeys(password);

        System.out.println("Username and Password are"  +username +"-----" +password);
    }

    public HomePage ClickLogin()
    {
        System.out.println("Click login from login page");
        return new HomePage();
    }
}
