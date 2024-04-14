package testsChronos;

import core.Driver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.CadastroPage;
import pages.LoginPage;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CadastroTests {

    LoginPage loginPage;
    CadastroPage cadastroPage;

    @BeforeEach
    public void inicializaDriver() throws MalformedURLException {
        Driver.inicializaDriver();
        loginPage = new LoginPage();
        cadastroPage = new CadastroPage();
    }
    @Test
    public void testRealizarCadastro(){
        loginPage.clickLinkCadastrar();
        cadastroPage.realizarCadastro("teste jardeson santos", Math.random()+"testejardo1@bol.com.br","teste123", "teste123");

    }
    @Test
    public void testRealizarCadastroNomeObrigatorio(){
        loginPage.clickLinkCadastrar();
        cadastroPage.realizarCadastro("", Math.random()+"testejardo1@bol.com.br","teste123", "teste123");

        assertEquals("O campo de nome é obrigatório.",cadastroPage.getErrorNome());
    }
    @Test
    public void testRealizarCadastroSenhasNaoCoincidem(){
        loginPage.clickLinkCadastrar();
        cadastroPage.realizarCadastro("teste", Math.random()+"testejardo1@bol.com.br","teste123", "teste1234");

        assertEquals("As senhas não coincidem.",cadastroPage.getErrorConfirmaSenha());
    }
    @Test
    public void testRealizarCadastroEmailObrigatorio(){
        loginPage.clickLinkCadastrar();
        cadastroPage.realizarCadastro("teste jardo1", "","teste123", "teste123");

        assertEquals("O campo de email é obrigatório.",cadastroPage.getErrorEmail());
    }
    @Test
    public void testRealizarCadastroSenhaObrigatorio(){
        loginPage.clickLinkCadastrar();
        cadastroPage.realizarCadastro("teste jardo1", "testejardo2@bol.com.br","", "teste123");

        assertEquals("O campo de senha é obrigatório.",cadastroPage.getErrorSenha());
    }

    @Test
    public void testRealizarCadastroConfirmaSenhaObrigatorio(){
        loginPage.clickLinkCadastrar();
        cadastroPage.realizarCadastro("teste jardo1", "testejardo2@bol.com.br","teste123", "");

        assertEquals("O campo de Confirmar senha é obrigatório.",cadastroPage.getErrorConfirmaSenha());
    }
}
