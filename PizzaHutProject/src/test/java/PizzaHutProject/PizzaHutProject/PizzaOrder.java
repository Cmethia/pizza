package PizzaHutProject.PizzaHutProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PizzaOrder {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		Browser("Chrome");
		
	WebElement Menu=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
	Menu.click();
	ScreenShots();
	WebElement PizzaOption=driver.findElement(By.xpath("//div[text()='Pizza']"));
	PizzaOption.click();
	ScreenShots();
	WebElement PizzaSelect=driver.findElement(By.xpath("//p[text()='Cheese Pizza']"));
	PizzaSelect.click();
   WebElement DelivSelect=driver.findElement(By.xpath("//div[contains(text(),'DELIVERY')]"));
   DelivSelect.click();
   WebElement StreetAdd=driver.findElement(By.id("w2-address"));
   StreetAdd.sendKeys("80 Broadmeadows Blvd");
   WebElement AptNumAdd=driver.findElement(By.id("w2-address2"));
   AptNumAdd.sendKeys("29");
   WebElement cityField=driver.findElement(By.id("w2-city"));
   cityField.sendKeys("columbus");
   WebElement stateField=driver.findElement(By.id("w2-state"));
   stateField.sendKeys("OH");
   WebElement zipCodeField=driver.findElement(By.id("w2-zip"));
   zipCodeField.sendKeys("43214");
   ScreenShots();
   WebElement SearchButton=driver.findElement(By.xpath("//span[text()= 'Search']"));
   SearchButton.click();
   
   WebElement ContinuButton=driver.findElement(By.xpath("//span[text()='Continue']"));
	   ContinuButton.click();
	
   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
   
   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='Cheese Pizza']")));
  wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(PizzaSelect)));
  WebElement PizzaSelect1=driver.findElement(By.xpath("//p[text()='Cheese Pizza']"));
  PizzaSelect1.click();
  Thread.sleep(6000);
  WebElement CrustOption=driver.findElement(By.xpath("//div[@data-testid='crust-open']"));
  CrustOption.click();
  WebElement SelectSize=driver.findElement(By.xpath("//p[text()= 'Large']"));
  SelectSize.click();
  WebElement SelectType=driver.findElement(By.xpath("//p[text()= 'Hand Tossed Pizza']"));
  SelectType.click();
 
  WebElement AddToOrder=driver.findElement(By.xpath("//span[text()='add to order']"));
  AddToOrder.click();
  WebElement ViewOrder=driver.findElement(By.xpath("//span[text()='View order'] "));
  ViewOrder.click();
 

	//driver.quit();
	
	}
		
		 public static void Browser (String NameOfBrowser) {
				if(NameOfBrowser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Celia\\eclipse-workspace\\PizzaHutProject\\Drivers\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.get("https://www.pizzahut.com");
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		        }else if(NameOfBrowser.equalsIgnoreCase("Edge")) {
		        	System.setProperty("webdriver.edge.driver","C:\\Users\\Celia\\eclipse-workspace\\PizzaHutProject\\Drivers\\msedgedriver.exe" );
		        	driver=new EdgeDriver();
		        	driver.get("https://www.pizzahut.com");
		      	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		        	driver.manage().window().maximize();
				
		
										
	}
				
		 }

		private static void ScreenShots() throws IOException {
		//we can use date class in java then create an object of the date class
		//then save the date into string format after that we do some manipulation in that string where we replace 
		//the old character with spaces and new characters with colons
			Date ShotDate=new Date();
			String ShotDateEdited=ShotDate.toString().replace(" ", "-").replace(":", "_");
			File Shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(Shots,new File("C:\\Users\\Celia\\eclipse-workspace\\PizzaHutProject\\ScreenShots\\"+ShotDateEdited+"PizzaHutShot.jpg"));
			
		}
		 }
