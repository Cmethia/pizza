package PizzaHutProject.PizzaHutProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PizzaTopper {
	WebDriver driver;

	@FindBy(xpath="//h2[text()='Crust']")WebElement Crust;

	@FindBy(xpath="//p[text()= 'Large']")WebElement CrustSize;
	@FindBy(xpath="//p[text()= 'Hand Tossed Pizza']")WebElement CrustType;
	@FindBy(xpath="//span[text()='add to order']")WebElement AddToOrder;
	//View order
	@FindBy(xpath="//span[text()='View order'] ")WebElement ViewOrd;
	
	public void CrustClick() {
		Crust.click();
	}

	public void SizeClick() {
		CrustSize.click();
	}

	public void TypeClick() {
		CrustType.click();
	}
	public void AddOrderClick() {
		AddToOrder.click();
	}
	public void ViewOrderClick() {
		ViewOrd.click();
	}
			
				
	public PizzaTopper(WebDriver driver) { //create the constructor
		 this.driver=driver;
		 PageFactory.initElements(driver, this); //it help us initialize all the elements
	

}
}