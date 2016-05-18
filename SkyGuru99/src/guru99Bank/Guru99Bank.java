package guru99Bank;

import org.openqa.selenium.remote.RemoteWebDriver;

public class Guru99Bank {
	RemoteWebDriver driver;
	private final String PAGE_TITLE = "Guru99 Bank Manager HomePage";
	
	public Guru99Bank(RemoteWebDriver driver){
		this.driver = driver;
		String title = driver.getTitle();
		if(!title.equals(PAGE_TITLE)){
			throw new IllegalStateException();
		}
	}
}
