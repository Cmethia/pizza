package PizzaHutProject.PizzaHutProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryPizzaCheese {
	WebDriver driver;
	@FindBy(xpath="//div[text()='DELIVERY']")WebElement DeliveryInfo;
	@FindBy(id="w2-address")WebElement StreetAddress;
	@FindBy(id="w2-address2")WebElement APT;
	@FindBy(id="w2-city")WebElement CityF;
	@FindBy(id="w2-state")WebElement StateF;
	@FindBy(id="w2-zip")WebElement ZipCodeF;
	@FindBy(xpath="//span[text()='Search']")WebElement Search;
	@FindBy(xpath="//span[text()='Continue']")WebElement Continue;
	
	

	
	public void DeliveryClick() {
		DeliveryInfo.click();				
	}
	public void AddressFKeys() {
		StreetAddress.sendKeys("80 Broadmeadows Blvd");				
	}

public void AptNumber() {
	APT.sendKeys("29");				
}
public void CityField() {
	CityF.sendKeys("Columbus");				
}
public void StateField() {
	StateF.sendKeys("OH");		
}
public void ZipCodeField() {
	ZipCodeF.sendKeys("43214");		
}

public void SearchClick() {
	Search.click();		
}
public void ContinueClick() {
Continue.click();	
}




	
	public DeliveryPizzaCheese(WebDriver driver) { //create the constructor
		 this.driver=driver;
		 PageFactory.initElements(driver, this);

}
}
