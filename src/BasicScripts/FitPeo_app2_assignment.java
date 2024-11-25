package BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FitPeo_app2_assignment 
 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
         WebDriver driver  = new ChromeDriver();
         driver.manage().window().maximize();
         driver.navigate().to("https://fitpeo.com/");
         Thread.sleep(2000);
         
       //to perform slider we should use Actions class:
         Actions act = new Actions(driver);
         
      // address of the RevenueCalculator module:
         WebElement RevenueCalculator = driver.findElement(By.xpath("(//div[.='Revenue Calculator'])[1]"));
         RevenueCalculator.click();
         Thread.sleep(2000);
         
       //address of meicareEligiblepatient:  
         WebElement medicareEligiblepatient = driver.findElement(By.xpath("//h4[.='Medicare Eligible Patients']"));  
         
       //to perform scrolldown or enabled element or pass data into textbox withoud using sendkeys or clear the data or handle the scrollbar we use javascriptExecutor  
         JavascriptExecutor java = (JavascriptExecutor)driver;
         java.executeScript("arguments[0].scrollIntoView(true)",medicareEligiblepatient); 
         Thread.sleep(2000);
         
      //address of the slider component:    
        WebElement slider = driver.findElement(By.xpath("//span[@class='MuiSlider-track css-10opxo5']"));     
        System.out.println("default location of the min slider:"+slider.getLocation());//(698,670),(x,y)
        
      //reference variable of Actions class to perform on slider component:
        act.moveToElement(slider).clickAndHold().moveByOffset(108, 0).release().perform();         
        Thread.sleep(5000);
         
      //adress of the slider textfield to enter digit : 560
        WebElement valuefield = driver.findElement(By.xpath("//input[@type='number']")); 
      
      //select all digit in slider textfield: 
        valuefield.sendKeys(Keys.CONTROL+"a");
        
      //remove all from slider textfield: 
        valuefield.sendKeys(Keys.BACK_SPACE);
        
      //enter the value into slider textfield:
        valuefield.sendKeys("560");
        System.out.println("The slider's position is updated to reflect the value is = 560");
        Thread.sleep(2000);
        
      //select all digit from slider textfield: 
        valuefield.sendKeys(Keys.CONTROL+"a");
        
      //remove all digit from slider textfield: 
        valuefield.sendKeys(Keys.BACK_SPACE);
        
      //enter actual value into slider textfield: 
        valuefield.sendKeys("820");
        Thread.sleep(2000);
        
     //address of CPT CODE 99091: AND clickBOX on check box1 :     
       WebElement checkbox1 = driver.findElement(By.xpath("//P[.='CPT-99091']"));  
       Thread.sleep(1000);          
       WebElement CPT99091 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
       CPT99091.click();
       
     //address of the CPT-99453 AND CHECKBOX click on check box2 : 
       WebElement checkbox2 = driver.findElement(By.xpath("//p[.='CPT-99453']"));       
       Thread.sleep(1000);
       WebElement CPT99453 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
       CPT99453.click();
       
     //address of the CPT-99453 AND CHECKBOX click on check box3 : 
       WebElement checkbox3 = driver.findElement(By.xpath("//p[.='CPT-99454']"));
       Thread.sleep(1000);
       WebElement CPT99454 = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
       CPT99454.click();
       
     //address of the CPT-99453 AND CHECKEBOX,  click on check box8 : 
       WebElement checkbox4 = driver.findElement(By.xpath("//p[.='CPT-99474']"));
       Thread.sleep(1000);
       WebElement CPT99474 = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
       CPT99474.click();
       Thread.sleep(2000);
       
     //value of Total Gross Revenue Per Year: 
       WebElement totalgrass = driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 inter css-1xroguk'])[1]"));
       String txt1 = totalgrass.getText();
       System.out.println(txt1);
       
     //value of One Time Reimbursement for all Patients Annually : 
       WebElement PatientsAnnually = driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 inter css-1xroguk'])[2]"));
       String txt2 = PatientsAnnually.getText();
       System.out.println(txt2);
       
     //value of Total Individual Patient/Month: 
       WebElement TotalIndividualPatient = driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 inter css-1xroguk'])[3]"));
       String txt3 = TotalIndividualPatient.getText();
       System.out.println(txt3);
        
     //value of Total Recurring Reimbursement for all Patients Per Month:
       WebElement TotalRecurringReimbursement = driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 inter css-1xroguk'])[4]"));
       String txt4 = TotalRecurringReimbursement.getText();
       System.out.println(txt4);
       Thread.sleep(2000);
       driver.quit();	
        	
        	
        	
     
       
	}

}
