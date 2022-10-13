package PizzaHutProject.PizzaHutProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath="//span[@class='MuiButton-label']")WebElement Menu;
	@FindBy(xpath="//div[text()='Pizza']")WebElement PIZZA;

	
	public void MenuBarClick() {
		Menu.click();				
	}
	public void PizzaOptionClick() {
		PIZZA.click();				
	}
	public HomePage(WebDriver driver) { //create the constructor
		 this.driver=driver;
		 PageFactory.initElements(driver, this); //it help us initialize all the elements
	
}
}