package maps;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginMap {

    @AndroidFindBy(accessibility = "inputEmail")
    protected WebElement inpEmail;

    @AndroidFindBy(accessibility = "inputPassword")
    protected WebElement inpPassword;

    @AndroidFindBy(accessibility = "Entrar")
    protected WebElement btnEntrar;

    @AndroidFindBy(accessibility = "naoTemConta_text")
    protected WebElement linkCadastrar;

}
