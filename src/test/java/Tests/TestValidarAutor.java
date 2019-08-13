package Tests;


import Suporte.Web;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class TestValidarAutor {
    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }

    @Test
    public void PesquisaAutoresOK() {
        new Pagina_Principal(navegador);

        /*Declaração da variável com o nome que consta no site da biblioteca nacional consultado manualmente, pois,
        Não consegui validar o Recaptcha do site da ISBN. Por isso consultei manualmente e criei a variável*/
        String AutorIsbn = "Margaret Atwood";


        //Validação de autores ISBN com autor cadastrado no submarino
        navegador.findElement(By.linkText("Submarino")).click();
        String AutorSubmarino = navegador.findElement(By.linkText("Margaret Atwood")).getText();
        assertTrue(AutorSubmarino.contains("Margaret Atwood"));
        System.out.println("O autor do livro no submarino é: " + AutorSubmarino);

        // Valida Autor da biblioteca nacional igual ao do site no submarino
        if (AutorIsbn.equals(AutorSubmarino)){
            System.out.println("O autor cadastrado na Biblioteca Nacional " +AutorIsbn+ " É Igual ao autor que está no site do Submarino " + AutorSubmarino);
        }
        else {
            System.out.println("Os autores estão errados ");
        }





        //Validação de autores ISBN com autor cadastrado na Americanas
        String americanas = "https://www.americanas.com.br/produto/5588318/livro-o-conto-da-aia?opn=YSMESP&loja=02&epar=bp_pl_00_go_liv_todas_geral_gmv&WT.srch=1&acc=e789ea56094489dffd798f86ff51c7a9&i=5612cbe46ed24cafb5cae011&o=55ce59be9c3238c7d1ac6180&gclid=Cj0KCQjwv8nqBRDGARIsAHfR9wBj3Hf9dEvV4M8PHgIGv0sNS6YZnrVk4Ip4w_y5nzqKVJJoel6KVP0aAm3gEALw_wcB";
        navegador.get(americanas);
        String AutorAmericanas = navegador.findElement(By.cssSelector("tr.Tr-sc-6kkk7q-3:nth-child(3) > td:nth-child(2) > span:nth-child(1)")).getText();
        assertTrue(AutorAmericanas.contains("Margaret Atwood"));
        System.out.println("O autor do livro na americanas é: " + AutorAmericanas);

        // Valida Autor da biblioteca nacional igual ao do site na americanas
        if (AutorIsbn.equals(AutorAmericanas)){
            System.out.println("O autor cadastrado na Biblioteca Nacional " +AutorIsbn+ " É Igual ao autor que está no site da Americanas " + AutorAmericanas);
        }
        else {
            System.out.println("Os autores estão errados ");
        }





        //Validação de autores ISBN com autor cadastrado na Amazon
        String amazon = "https://www.amazon.com.br/Conto-Aia-Margaret-Atwood/dp/8532520669/ref=sr_1_1?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1W3H0DDJJB73C&keywords=o+conto+da+aia&qid=1565730323&s=gateway&sprefix=o+conto+de+%2Caps%2C264&sr=8-1";
        navegador.get(amazon);
        String AutorAmazon = navegador.findElement(By.cssSelector("#bylineInfo > span:nth-child(1) > a")).getText();
        assertTrue(AutorAmazon.contains("Margaret Atwood"));
        System.out.println("O autor do livro na Livraria Cultura é: " + AutorAmazon);

        // Valida Autor da biblioteca nacional igual ao do site na amazon
        if (AutorIsbn.equals(AutorAmazon)){
            System.out.println("O autor cadastrado na Biblioteca Nacional " +AutorIsbn+ " É Igual ao autor que está no site da Amazon " + AutorAmazon);
        }
        else
        {
            System.out.println("Os autores estão errados ");
        }
    }




    @Test
    public void PesquisaAutoresNOK() {
        new Pagina_Principal(navegador);

        /*Declaração da variável com o nome diferente do que consta  no site da biblioteca nacional consultado manualmente, pois,
        Não consegui validar o Recaptcha do site da ISBN. Por isso consultei manualmente e criei a variável com valor diferente para
        receber os testes negativos*/
        String AutorIsbn = "Anonymous";


        //Validação de autores ISBN com autor cadastrado no submarino
        navegador.findElement(By.linkText("Submarino")).click();
        String AutorSubmarino = navegador.findElement(By.linkText("Margaret Atwood")).getText();
        assertTrue(AutorSubmarino.contains("Margaret Atwood"));
        System.out.println("O autor do livro no submarino é: " + AutorSubmarino);

        // Valida Autor da biblioteca nacional igual ao do site no submarino
        if (AutorIsbn == AutorSubmarino){
            System.out.println("O autor cadastrado na Biblioteca Nacional " +AutorIsbn+ " É Igual ao autor que está no site do Submarino " + AutorSubmarino);
        }
        else {
            System.out.println("Os autores estão errados ");
        }





        //Validação de autores ISBN com autor cadastrado na Americanas
        String americanas = "https://www.americanas.com.br/produto/5588318/livro-o-conto-da-aia?opn=YSMESP&loja=02&epar=bp_pl_00_go_liv_todas_geral_gmv&WT.srch=1&acc=e789ea56094489dffd798f86ff51c7a9&i=5612cbe46ed24cafb5cae011&o=55ce59be9c3238c7d1ac6180&gclid=Cj0KCQjwv8nqBRDGARIsAHfR9wBj3Hf9dEvV4M8PHgIGv0sNS6YZnrVk4Ip4w_y5nzqKVJJoel6KVP0aAm3gEALw_wcB";
        navegador.get(americanas);
        String AutorAmericanas = navegador.findElement(By.cssSelector("tr.Tr-sc-6kkk7q-3:nth-child(3) > td:nth-child(2) > span:nth-child(1)")).getText();
        assertTrue(AutorAmericanas.contains("Margaret Atwood"));
        System.out.println("O autor do livro na americanas é: " + AutorAmericanas);

        // Valida Autor da biblioteca nacional igual ao do site na americanas
        if (AutorIsbn == AutorAmericanas){
            System.out.println("O autor cadastrado na Biblioteca Nacional " +AutorIsbn+ " É Igual ao autor que está no site da Americanas " + AutorAmericanas);
        }
        else {
            System.out.println("Os autores estão errados ");
        }





        //Validação de autores ISBN com autor cadastrado na Amazon
        String amazon = "https://www.amazon.com.br/Conto-Aia-Margaret-Atwood/dp/8532520669/ref=sr_1_1?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1W3H0DDJJB73C&keywords=o+conto+da+aia&qid=1565730323&s=gateway&sprefix=o+conto+de+%2Caps%2C264&sr=8-1";
        navegador.get(amazon);
        String AutorAmazon = navegador.findElement(By.cssSelector("#bylineInfo > span:nth-child(1) > a")).getText();
        assertTrue(AutorAmazon.contains("Margaret Atwood"));
        System.out.println("O autor do livro na Livraria Cultura é: " + AutorAmazon);

        // Valida Autor da biblioteca nacional igual ao do site na amazon
        if (AutorIsbn == AutorAmazon){
            System.out.println("O autor cadastrado na Biblioteca Nacional " +AutorIsbn+ " É Igual ao autor que está no site da Amazon " + AutorAmazon);
        }
        else
        {
            System.out.println("Os autores estão errados ");
        }
    }


    @After
    public void tearDown() {

    }


}
