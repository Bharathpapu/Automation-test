package BasicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitywait_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.driver.chrome","./softwares/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.facebook.com");
        WebDriverWait wat = new WebDriverWait(driver, 10);
        wat.until(ExpectedConditions.titleContains("Fxacebook"));
        String titl = driver.getTitle();
        System.out.println(titl);
        wat.until(ExpectedConditions.urlContains("facebook"));
        String url = driver.getCurrentUrl();
        System.out.println(url);
        WebElement mail = driver.findElement(By.xpath("inputtext _55r1 _6luy"));
        wat.until(ExpectedConditions.visibilityOf(mail));
        mail.sendKeys("bharath.rmgm03@gmail.com");
        WebElement psw = driver.findElement(By.xpath("//div[@id='passContainer']"));
        wat.until(ExpectedConditions.visibilityOf(psw));
        psw.sendKeys("Bhrath@07");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        )
	}

}
