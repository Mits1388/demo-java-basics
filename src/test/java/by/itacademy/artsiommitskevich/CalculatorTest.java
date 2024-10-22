package by.itacademy.artsiommitskevich;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {

    @Test
    public void testSite1(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        String xPathButton = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By by = By.xpath(xPathButton);
        WebElement webElement = webDriver.findElement(by);
        webElement.click();
    }
    @Test
    public void testSite2(){

    }
    @Test
    public void testSite3(){

    }
}