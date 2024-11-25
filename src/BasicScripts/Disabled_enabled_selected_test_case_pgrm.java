package BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled_enabled_selected_test_case_pgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./softwers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("file:///C:/Users/Lenovo/Desktop/HTML/Enabled.html");
WebElement us = driver.findElement(By.xpath("//input[@type='text']"));
if(us.isDisplayed())
{
	System.out.println("us is disabled");
}
else
{
	System.out.println("us isn't disabled");
}
WebElement cb = driver.findElement(By.xpath("//input[@type='checkbox']"));
if(cb.isDisplayed())
{
	if(cb.isEnabled())
	{
		if(cb.isSelected())
	{
		System.out.println("cb is displayed");
		cb.click();
	}
	else
	{
     System.out.println("cb isn't disabled");
	}
}
		else
		{
			System.out.println("cb is not enabled");
		}
}
	else
	{
          System.out.println("cb isn't selected");
	}
	}
}
