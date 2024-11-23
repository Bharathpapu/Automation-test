import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_all_the_text_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
           WebDriver driver = new ChromeDriver();
           driver.navigate().to("https://www.amazon.com");
           driver.manage().window().maximize();
            List<WebElement> links = driver.findElements(By.xpath("//a"));
           int count = links.size();
           for(int i=0; i<count; i++)
        	   {
        	 WebElement com = links.get(i);
        	String text = com.getText();
        	System.out.println(i+" "+text);
        	   }
        	   driver.quit();}
	}


