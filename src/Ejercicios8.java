import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import java.util.List;

public class Ejercicios8 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        List<WebElement> casillas = driver.findElements(By.cssSelector("input[type='checkbox']"));
        WebElement segundaCasilla = casillas.get(1);

        if (segundaCasilla.isSelected()) {
            segundaCasilla.click();
        }

        System.out.println("Estado final: " + (segundaCasilla.isSelected() ? "seleccionada" : "desmarcada"));

        driver.quit();
    }
}