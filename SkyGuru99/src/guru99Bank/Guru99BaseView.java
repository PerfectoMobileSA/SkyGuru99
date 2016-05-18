package guru99Bank;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Guru99BaseView {
	RemoteWebDriver driver;
	By newCustomerButton = By.xpath("/html/body/div[2]/div/ul/li[2]/a");
	By editCustomerButton = By.xpath("/html/body/div[2]/div/ul/li[3]/a");
	
	public Guru99BaseView(RemoteWebDriver driver){
		this.driver = driver;
	}
	public newCustomerView clickNewCustomer(){
		driver.findElement(newCustomerButton).click();
		return new newCustomerView(driver);
	}
	protected void checkTitle(String title){
		
	}

}
