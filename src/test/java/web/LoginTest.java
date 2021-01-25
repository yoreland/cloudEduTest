package web;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void test(){
        System.out.println("start test!");
        System.setProperty("webdriver.chrome.driver", "/Users/xianing/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://solutions.agora.io/education/web_v2/");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div[1]/div/input")).sendKeys("automation1");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/input")).sendKeys("teacher");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div[4]/div/label[1]/span[1]/span[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/button")).click();
    }
}
