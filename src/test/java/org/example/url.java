package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class url {
    @Test
    public void test(){
        System.out.println("welcome");
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.hackerrank.com/auth/login");
        driver.findElement(By.name("username")).sendKeys("2000031571@kluniversity.in");
        driver.findElement(By.name("password")).sendKeys("vyshu@030503");
        //driver.findElement(By.className("header-logo"));
        driver.findElement(By.linkText("Forgot your password?")).click();

    }
}
