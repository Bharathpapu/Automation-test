package BasicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class puma_app2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
       WebDriver driver  = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
       driver.navigate().to("https://puma.com");
       Thread.sleep(3000);
       
       WebDriverWait wait = new WebDriverWait(driver,100);
       WebElement nwe = driver.findElement(By.xpath("(//span[@class='text-base block mt-1 pb-1 whitespace-nowrap nav-underline group-hover:nav-underline-selected group-focus:nav-underline-selected'])[1]"));
      wait.until(ExpectedConditions.visibilityOf(nwe));
       nwe.click();
      // Thread.sleep(3000);
       
       
       WebElement travelstore = driver.findElement(By.xpath("//a[.='Travel Store']"));
       wait.until(ExpectedConditions.visibilityOf(travelstore));
       travelstore.click();
      // Thread.sleep(20000);
       
     
       WebElement tailored = driver.findElement(By.xpath("//h2[@class='font-bold leading-tight mobile:text-2xl tablet:text-3xl desktop:text-4xl xl:text-5xl']"));
       JavascriptExecutor java = (JavascriptExecutor)driver;
       java.executeScript("arguments[0].scrollIntoView(true)", tailored);
       
       
	
	
	
	
	
	
	
	
	
	}

}
