package BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github_web_app {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.navigate().to("https://github.com/");
         Thread.sleep(3000);
         driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("bharath.rmgm03@gmail.com");
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//span[.='Sign up for GitHub'])[2]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("bharath.rmgm03@gmail.com");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bharath@#07");
         Thread.sleep(2000);
         
         WebElement bharath = driver.findElement(By.xpath("(//a[@class='color-fg-default lh-0 mb-2 markdown-title'])[1]"));
         bharath.click();
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("(//span[@data-component='buttonContent'])[2]")).click();
         Thread.sleep(2000);
         
         WebElement branches = driver.findElement(By.xpath("//h2[.='Active branches']"));
         JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeScript("arguments[0].scollIntoView()",branches);
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("(//a[@class='BranchName__StyledBranchName-sc-sg8jsy-0 ksYiNV'])[3]")).click();
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("(//a[.='my second commit'])[2]")).click();
         Thread.sleep(2000);
         
         JavascriptExecutor js1 = (JavascriptExecutor)driver;
         js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
         Thread.sleep(2000);
         JavascriptExecutor js2 = (JavascriptExecutor)driver;
         js2.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
         Thread.sleep(2000);
         driver.quit();
	
	
	
	
	
	
	
	
	
	
	}

}
