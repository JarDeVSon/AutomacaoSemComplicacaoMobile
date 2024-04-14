package pages;

import core.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import maps.LoginMap;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginMap {

    public LoginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    public void realizarLogin(String email, String senha) {
        inpEmail.sendKeys(email);
        inpPassword.sendKeys(senha);
        btnEntrar.click();
    }
    public void clickLinkCadastrar(){
        linkCadastrar.click();
    }
}
