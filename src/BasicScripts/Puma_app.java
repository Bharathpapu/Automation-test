package BasicScripts;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc.Role;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Puma_app {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.navigate().to("https://in.puma.com/in/en/mens");
		WebDriverWait wait = new WebDriverWait(driver, 50);
	    Actions act = new Actions(driver);
		
		WebElement black = driver.findElement(By.xpath("//span[.='Black Friday Sale']"));
		wait.until(ExpectedConditions.visibilityOf(black));
		black.click();
		
		WebElement filte = driver.findElement(By.xpath("(//div[.='Filters'])[1]"));
		wait.until(ExpectedConditions.visibilityOf(filte));
		filte.click();
		
		WebElement price = driver.findElement(By.xpath("//span[.='Price']"));
		wait.until(ExpectedConditions.visibilityOf(price));
		price.click();
		
		WebElement cate = driver.findElement(By.xpath("//span[.='Category']"));
		wait.until( ExpectedConditions.visibilityOf(cate));
		cate.click();
		
		WebElement product = driver.findElement(By.xpath("//span[.='Product Type']"));
		wait.until(ExpectedConditions.visibilityOf(product));
		product.click();
		
		WebElement checkbox2 = driver.findElement(By.xpath("(//div[@data-uds-child='indicator'])[2]"));
		wait.until(ExpectedConditions.visibilityOf(checkbox2));
		checkbox2.click();
		
		WebElement box5 = driver.findElement(By.xpath("(//div[@data-uds-child='indicator'])[5]"));
		wait.until(ExpectedConditions.visibilityOf(box5));
		box5.click();
		
		WebElement gender = driver.findElement(By.xpath("//span[.='Gender']"));
		wait.until(ExpectedConditions.visibilityOf(gender));
		gender.click();

		WebElement slider = driver.findElement(By.xpath("(//span[@data-orientation='horizontal'])[1]"));
	    System.out.println("defalut min slider"+ slider.getLocation());
	    act.moveToElement(slider).clickAndHold().moveByOffset(976,383).release().perform();
		
		WebElement role = driver.findElement(By.xpath("(//span[@role='slider'])[1]"));
		System.out.println("default min role"+role.getLocation());
		act.moveToElement(role).clickAndHold().moveByOffset(976, 369).release().perform();
		
		
		
		
	}

}
