package pages;

import core.Driver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import maps.CadastroMap;
import org.openqa.selenium.support.PageFactory;

public class CadastroPage extends CadastroMap {

    public CadastroPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    public void realizarCadastro(String nome, String email, String senha, String confirmaSenha){
        inpNome.sendKeys(nome);
        inpEmail.sendKeys(email);
        inpSenha.sendKeys(senha);
        inpConfirmaSenha.sendKeys(confirmaSenha);
        btnCadastrar.click();
    }

    public String getCadastroSucesso(){
        return txtCadastroSucesso.getText();
    }
    public String getErrorNome(){
        return txtNomeError.getText();
    }
    public String getErrorEmail(){
       return txtEmailError.getText();
    }
    public String getErrorSenha(){
        return txtSenhaError.getText();
    }
    public String getErrorConfirmaSenha(){
        return txtConfirmaSenhaError.getText();
    }


}
