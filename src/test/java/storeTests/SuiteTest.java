package storeTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Testes da Store")

public class SuiteTest {
    @Test
    @DisplayName("LayoutTela")
    public void testLayoutTela() {
        //abrir o chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

        //abrir o site Store
        navegador.get("https://www.demoblaze.com/");

        //fechar o site
        navegador.quit();


    }

}
