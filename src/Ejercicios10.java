import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class Ejercicios10 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("incorrecto");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        WebElement mensaje = driver.findElement(By.id("error"));
        String texto = mensaje.getText();
        System.out.println("Mensaje: " + texto);

        if (driver.getCurrentUrl().contains("login")) {
            System.out.println("Prueba exitosa: el usuario no pudo ingresar");
        } else {
            System.out.println("Prueba fallida");
        }

        driver.quit();
    }
}