package proyectoclicks1.demo.agent.automation;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.springframework.stereotype.Component;

@Component
public class BrowserAutomation {

    public void openGoogle() {

        try {

            WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver();

            driver.get("https://www.google.com");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}