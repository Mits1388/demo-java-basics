package by.itacademy.artsiommitskevich;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {

    @Test
    public void testClick(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        String xPathButton = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        String xPathName = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By byName = By.xpath(xPathName);
        By by = By.xpath(xPathButton);
        WebElement webElementName = webDriver.findElement(byName);
        webElementName.sendKeys("Artsiom");
        WebElement webElementButton = webDriver.findElement(by);
        webElementButton.click();
    }
    @Test
    public void testName(){

    }
    @Test
    public void testHeight(){

    }
}
