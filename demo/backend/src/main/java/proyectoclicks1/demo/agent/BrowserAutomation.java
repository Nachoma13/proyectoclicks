package proyectoclicks1.demo.agent.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;

@Component
public class BrowserAutomation {

    private WebDriver driver;

    public void openYoutubeViaGoogleSearch() {

        System.out.println("INICIANDO SELENIUM...");

        try {
            WebDriverManager.chromedriver().setup();
            System.out.println("CHROMEDRIVER OK");

            driver = new ChromeDriver();
            System.out.println("CHROME ABIERTO");

            driver.manage().window().maximize();

            driver.get("https://www.google.com/search?q=youtube");

            System.out.println("NAVEGACION OK");

        } catch (Exception e) {
            System.out.println("ERROR SELENIUM:");
            e.printStackTrace();
        }
    }
}