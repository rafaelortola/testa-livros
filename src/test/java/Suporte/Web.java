package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome() {
        //Abrir navegador
        System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
        WebDriver navegador = new FirefoxDriver();
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        navegador.manage().window().maximize();

        //navegando para página do whatsapp web
        navegador.get("file:///C:/Radix/testa-livros/sites.html");
        return navegador;
    }
}
