package maps;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CadastroMap {

    @AndroidFindBy(accessibility = "inputNome_register")
    protected WebElement inpNome;
    @AndroidFindBy(accessibility = "inputEmail_register")
    protected WebElement inpEmail;
    @AndroidFindBy(accessibility = "inputSenha_register")
    protected WebElement inpSenha;
    @AndroidFindBy(accessibility = "inputConfirmarSenha_register")
    protected WebElement inpConfirmaSenha;
    @AndroidFindBy(accessibility = "buttonCadastrar_register")
    protected WebElement btnCadastrar;
    @AndroidFindBy(accessibility = "nomeError")
    protected  WebElement txtNomeError;
    @AndroidFindBy(accessibility = "emailError")
    protected WebElement txtEmailError;
    @AndroidFindBy(accessibility = "passwordError")
    protected WebElement txtSenhaError;
    @AndroidFindBy(accessibility = "confirmPasswordError")
    protected WebElement txtConfirmaSenhaError;
}
