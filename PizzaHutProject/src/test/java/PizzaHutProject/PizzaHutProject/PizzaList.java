package PizzaHutProject.PizzaHutProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PizzaList {
	WebDriver driver;
	@FindBy(xpath="//p[text()= 'Cheese Pizza']")WebElement PizzaCheese;
	//WebElement SelectPizzaCheese=driver.findElement(By.xpath("//p[text()='Cheese Pizza']"));
	

	
	public void PizzaCheeseClick() {
		
		PizzaCheese.click();				
	}
	
	
	public void PizzaCheeseClick1() {
		try {PizzaCheese.click();}
		catch(StaleElementReferenceException e){
			WebElement SelectPizzaCheese=driver.findElement(By.xpath("//p[text()= 'Cheese Pizza']"));
			SelectPizzaCheese.click();
		}
	}
	
	public PizzaList(WebDriver driver) { //create the constructor
		 this.driver=driver;
		 PageFactory.initElements(driver, this); //it help us initialize all the elements
	
}

}
