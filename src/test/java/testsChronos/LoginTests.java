package testsChronos;

import core.Driver;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.LoginPage;
import pages.ProdutosPage;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTests {
    LoginPage loginPage;
    ProdutosPage produtosPage;

    @Test
    public void imprimirNoConsole(){
        System.out.println("Primeiro teste!!");
    }
    @BeforeEach
    public void inicializaDriver() throws MalformedURLException {
        Driver.inicializaDriver();
        loginPage = new LoginPage();
    }
    @AfterEach
    public void encerraDriver(){
        Driver.getAppiumDriver().quit();
    }

    @Test
    public void realizarLoginValido() throws MalformedURLException {
        Driver.inicializaDriver();
        loginPage = new LoginPage();
        loginPage.realizarLogin("teste@chronosacademy.com.br", "123456");

        produtosPage = new ProdutosPage();
        assertEquals("Conheça todos os nossos cursos", produtosPage.getTxtTituloProdutos());
    }




}








