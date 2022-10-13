package TesNG;

import java.io.File;
import java.io.IOException;

import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PizzaHutProject.PizzaHutProject.DeliveryPizzaCheese;
import PizzaHutProject.PizzaHutProject.HomePage;
import PizzaHutProject.PizzaHutProject.PizzaList;
import PizzaHutProject.PizzaHutProject.PizzaTopper;

public class PizzaHut_Checkout {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException, IOException {
	  HomePage obj1= new HomePage(driver);
	  obj1.MenuBarClick();
	  obj1.PizzaOptionClick();
	  PizzaList obj2=new PizzaList(driver);
	  obj2.PizzaCheeseClick();
	  DeliveryPizzaCheese obj3=new DeliveryPizzaCheese(driver);
	  obj3.DeliveryClick();
	  obj3.AddressFKeys();
	  obj3.AptNumber();
	  obj3.CityField();
	  obj3.StateField();
	  obj3.ZipCodeField();
	  obj3.SearchClick();
	  obj3.ContinueClick();
	 //stale
	  obj2.PizzaCheeseClick1();
	  PizzaTopper obj4=new PizzaTopper(driver);
	  obj4.CrustClick();
	  obj4.SizeClick();
	  obj4.TypeClick();
	  obj4.AddOrderClick();
	  Thread.sleep(5000);
	  obj4.ViewOrderClick();
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  Browser("Chrome");
	  
  }

  @AfterClass
  public void afterClass() throws InterruptedException, IOException {
	Thread.sleep(4000);
	Screenshots();
	 driver.close();
  }
  public void Browser (String NameOfBrowser) {
		if(NameOfBrowser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Celia\\eclipse-workspace\\PizzaHutProject\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.pizzahut.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
  }else if(NameOfBrowser.equalsIgnoreCase("Edge")) {
  	System.setProperty("webdriver.edge.driver","C:\\Users\\Celia\\eclipse-workspace\\PizzaHutProject\\Drivers\\msedgedriver.exe" );
  	driver=new EdgeDriver();
  	driver.get("https://www.pizzahut.com/");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  	driver.manage().window().maximize();


}
}
public void Screenshots() throws IOException {
	  Date multiScreen=new Date();
		String ShotEdited= multiScreen.toString().replace(" ", "-").replace(":", "_");
	  File HomePage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(HomePage, new File("C:\\Users\\Celia\\eclipse-workspace\\PizzaHutProject\\ScreenShots\\"+ShotEdited+"Desktop.jpg"));

}

}
