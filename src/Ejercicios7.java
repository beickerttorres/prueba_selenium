import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import java.util.List;

public class Ejercicios7 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        List<WebElement> casillas = driver.findElements(By.cssSelector("input[type='checkbox']"));
        casillas.get(0).click();

        if (casillas.get(0).isSelected()) {
            System.out.println("Casilla seleccionada");
        } else {
            System.out.println("Casilla no seleccionada");
        }

        driver.quit();
    }
}