package guru99Bank;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Guru99Bank extends Guru99BaseView{
	private final String PAGE_TITLE = "Guru99 Bank Manager HomePage";
	private By managerID = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td");
	
	public Guru99Bank(RemoteWebDriver driver){
		super(driver);
		String title = driver.getTitle();
		if(!title.equals(PAGE_TITLE)){
			throw new IllegalStateException();
		}
	}
	public String getManagerID(){
		return driver.findElement(managerID).getText();
	}
}
