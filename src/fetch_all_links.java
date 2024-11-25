import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetch_all_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
             WebDriver driver  = new ChromeDriver();
             driver.navigate().to("https://flipkart.com");
             driver.manage().window().maximize();
            List<WebElement> text = driver.findElements(By.xpath("//a"));
           int ele = text.size();
           for(int i=ele-1; i>=0; i--)
           {
        	 WebElement link = text.get(i);
                 String links = link.getText();
                 System.out.println(i+" "+links);
                 
           }
           driver.quit();
	}

}
