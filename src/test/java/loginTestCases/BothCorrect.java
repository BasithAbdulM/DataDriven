package loginTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class BothCorrect {
    WebDriver driver=new ChromeDriver();

    @Test
    @Parameters({"username","password"})
    public void loginwithBC(String Uname,String Pword){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys(Uname);

        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(Pword);

        WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        driver.quit();
    }
}
