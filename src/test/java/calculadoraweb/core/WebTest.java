package calculadoraweb.core;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

/**
 * Exemplo Selenium/Firefox Driver com Junit 5.
 */
public class WebTest {
    private static WebDriver driver;
    // private JavascriptExecutor js = (JavascriptExecutor) driver;

    /**
     * Firefox Driver.
     */
    @BeforeAll
    public static void setUp() {
        WebTest.driver = new FirefoxDriver();
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @SuppressWarnings("checkstyle:magicnumber")
    @Test
    public void web() {
        driver.get("http://localhost:8080/calculadoraweb/calcular");
        driver.manage().window().setSize(new Dimension(952, 704));
        driver.findElement(By.id("num1")).click();
        driver.findElement(By.id("num1")).sendKeys("3");
        driver.findElement(By.id("num2")).click();
        driver.findElement(By.id("num2")).sendKeys("2");
        driver.findElement(By.id("operacao")).click();
        driver.findElement(By.cssSelector("option:nth-child(1)")).click();
        driver.findElement(By.id("btnCalcular")).click();
        driver.findElement(By.id("operacao")).click();
        {
            WebElement dropdown = driver.findElement(By.id("operacao"));
            dropdown.findElement(By.xpath("//option[. = 'Subtrair']")).click();
        }
        driver.findElement(By.cssSelector("option:nth-child(2)")).click();
        driver.findElement(By.id("btnCalcular")).click();
        driver.findElement(By.id("operacao")).click();
        {
            WebElement dropdown = driver.findElement(By.id("operacao"));
            dropdown.findElement(By.xpath("//option[. = 'Multiplicar']")).click();
        }
        driver.findElement(By.cssSelector("option:nth-child(3)")).click();
        driver.findElement(By.id("btnCalcular")).click();
        driver.findElement(By.id("operacao")).click();
        {
            WebElement dropdown = driver.findElement(By.id("operacao"));
            dropdown.findElement(By.xpath("//option[. = 'Dividir']")).click();
        }
        driver.findElement(By.cssSelector("option:nth-child(4)")).click();
        driver.findElement(By.id("btnCalcular")).click();
    }

}
