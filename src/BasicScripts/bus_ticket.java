package BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bus_ticket {

	public static void main(String[] args) throws InterruptedException {
		// TO DO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://busonlineticket.com/booking/bus-tickets.aspx");
        Thread.sleep(4000);
        WebElement fr = driver.findElement(By.xpath("//input[@id='txtOriginGeneral']"));
        fr.click();
        Thread.sleep(1000);
        WebElement to = driver.findElement(By.xpath("//div[@class='select2-result-label']"));
        to.click();
        Thread.sleep(1000);
        WebElement depart = driver.findElement(By.xpath("//span[.='Depart Date']"));
        depart.click();
        Thread.sleep(1000);
        WebElement da = driver.findElement(By.xpath("//a[.='19']"));
        da.click();
        Thread.sleep(1000);
        WebElement ret = driver.findElement(By.xpath("//a[.='24']"));
        ret.click();
        Thread.sleep(1000);
        WebElement sear = driver.findElement(By.xpath("//input[@id='btnBusSearchNewGeneral']"));
        sear.click();
        
        
        
        
        
        
        
        
	}

}
