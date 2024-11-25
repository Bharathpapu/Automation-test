package BasicScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.navigate().to("file:///C:/Users/Lenovo/Desktop/HTML/font%20color/drowpdown/cars.html");
          Thread.sleep(2000);
          WebElement dropdown = driver.findElement(By.id("cars"));
	      Select fetc = new Select(dropdown);
	      List<WebElement> opt = fetc.getOptions();
	      int count = opt.size();
	      System.out.println(count);
	      ArrayList<String> option = new ArrayList<String>();
	      for(int i=0; i<count; i++)
	      {
	    	  WebElement give = opt.get(i);
	    	  String text = give.getText();
	    	  option.add(text);
	    	//, System.out.println(text);
	    	  
	    	  
	    	  
	    	  
	      }
	      Collections.sort(option);
	      for(String loop : option)
	      {
	    	  System.out.println(loop);
	      }
	      Thread.sleep(2000);
	      driver.quit();
	      
	
	
	
	
	
	}
	
	
	
}