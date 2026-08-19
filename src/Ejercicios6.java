import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class Ejercicios6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/inputs");

        WebElement campo = driver.findElement(By.tagName("input"));

        campo.sendKeys("20");
        System.out.println("Primer valor: " + campo.getAttribute("value"));

        campo.clear();
        campo.sendKeys("35");

        String valorFinal = campo.getAttribute("value");
        System.out.println("Valor final: " + valorFinal);

        if (valorFinal.equals("35")) {
            System.out.println("Prueba exitosa");
        } else {
            System.out.println("Prueba fallida");
        }

        driver.quit();
    }
}