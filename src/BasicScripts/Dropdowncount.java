package BasicScripts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowncount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.navigate().to("file:///C:/Users/Lenovo/Desktop/HTML/background%20color.html/dropdown.html");
       driver.manage().window().maximize();
     WebElement dropdown = driver.findElement(By.id("celebrities"));
     Select s = new Select(dropdown);
      List<WebElement> opts = s.getOptions();
    int optscount = opts.size();
    System.out.println(optscount);
   ArrayList<String> arr = new ArrayList<String>();
    for(int i=0; i<optscount; i++)
    {
    	WebElement opt = opts.get(i);
    	String txt = opt.getText();
    	arr.add(txt);
    	//System.out.println(txt);
    	
    }
    Collections.sort(arr,Collections.reverseOrder());
    for( String ar : arr)
    {
    	System.out.println(ar);
    }
      driver.quit();
      }

}
