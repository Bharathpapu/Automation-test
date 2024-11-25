package BasicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class blazedemo_com_app_booking_flight_ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://blazedemo.com/index.php");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
       WebElement designationofthelink = driver.findElement(By.xpath("//a[.='destination of the week! The Beach!']"));
       wait.until(ExpectedConditions.visibilityOf(designationofthelink));
       designationofthelink.click();
       
       WebElement home = driver.findElement(By.xpath("//a[.='Travel The World']"));
       wait.until(ExpectedConditions.visibilityOf(home));
       home.click();
       
       WebElement deaparturecity = driver.findElement(By.xpath("//option[.='Mexico City']"));
       wait.until(ExpectedConditions.visibilityOf(deaparturecity));
       deaparturecity.click();
       
       WebElement destinationcity = driver.findElement(By.xpath("//option[.='London']"));
       wait.until(ExpectedConditions.visibilityOf(destinationcity));
       destinationcity.click();
       
       WebElement sumbit = driver.findElement(By.xpath("//input[@type='submit']"));
       wait.until(ExpectedConditions.visibilityOf(sumbit));
       sumbit.click();
       
        WebElement chooseflight2 = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
        wait.until(ExpectedConditions.visibilityOf(chooseflight2));
        chooseflight2.click();
        
       WebElement fn = driver.findElement(By.xpath("//input[@id='inputName']"));
       wait.until(ExpectedConditions.visibilityOf(fn));
       fn.sendKeys("Bharath");
       
       WebElement address = driver.findElement(By.xpath("//input[@name='address']"));
       wait.until(ExpectedConditions.visibilityOf(address));
       address.sendKeys("123 main Sit");
        
      WebElement city = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
      wait.until(ExpectedConditions.visibilityOf(city));
      city.sendKeys("Banagalore");
      
      WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
      wait.until(ExpectedConditions.visibilityOf(state));
      state.sendKeys("karnataka");
      
      WebElement zipcode = driver.findElement(By.xpath("//input[@name='zipCode']"));
      wait.until(ExpectedConditions.visibilityOf(zipcode));
      zipcode.sendKeys("1234");
      
      WebElement cardtype = driver.findElement(By.xpath("//option[.='Visa']"));
      wait.until(ExpectedConditions.visibilityOf(cardtype));
      cardtype.click();
      
      WebElement creditnumber = driver.findElement(By.xpath("//input[@id='creditCardNumber']"));
      wait.until(ExpectedConditions.visibilityOf(creditnumber));
      creditnumber.sendKeys("123456");
       
      WebElement month = driver.findElement(By.xpath("//input[@id='creditCardMonth']"));
      wait.until(ExpectedConditions.visibilityOf(month));
      month.sendKeys("11");
      
      WebElement year = driver.findElement(By.xpath("//input[@id='creditCardYear']"));
      wait.until(ExpectedConditions.visibilityOf(year));
      year.sendKeys("2024");
       
      WebElement name = driver.findElement(By.xpath("//input[@id='nameOnCard']"));
      wait.until(ExpectedConditions.visibilityOf(name));
      name.sendKeys("jesus");
      
      WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
      wait.until(ExpectedConditions.visibilityOf(checkbox));
      checkbox.click();
      
      WebElement purchaseflight = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
      wait.until(ExpectedConditions.visibilityOf(purchaseflight));
      purchaseflight.click();
      
          
        
        
        
        
        
        
        
        
        
	}

}
