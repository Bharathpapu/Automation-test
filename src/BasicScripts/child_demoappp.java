package BasicScripts;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_demoappp {
      public static void main(String[] args) throws InterruptedException 
      {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='browserButton2']")).click();
		String win = driver.getWindowHandle();
		Set<String> wins = driver.getWindowHandles();
		ArrayList<String> windo = new ArrayList<String>(wins);
		int count = windo.size();
		for(int i=0; i<count; i++)
		{
			String lo = windo.get(i);
			driver.switchTo().window(lo);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			if(lo.equals(win))
			{
				driver.close();
			}
			Thread.sleep(2000);
			driver.quit();
			
			
			
		}
		
		
		
		
		
		
		
	}    
}
//button[@id='browserButton2']