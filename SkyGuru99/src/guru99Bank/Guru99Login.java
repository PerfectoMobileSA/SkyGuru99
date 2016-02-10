package guru99Bank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Guru99Login {
	private final String URL = "http://demo.guru99.com/v4/index.php";
	private final long PAGE_LOAD_TIMEOUT = 20;
	private final long IMPLICIT_WAIT = 20;
	private final String PAGE_TITLE = "Guru99 Bank Home Page";
	
	RemoteWebDriver driver;
	By usernameField = By.xpath("//input[@name='uid']");
	By passwordField = By.xpath("//input[@name='password']");
	By loginButton = By.xpath("//input[@name='btnLogin']");
	
	public Guru99Login(RemoteWebDriver driver){
		this.driver = driver;
	}
	public Guru99Login init(){
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(URL);
		
		String title = driver.getTitle();
		if(!title.equals(PAGE_TITLE)){
			throw new IllegalStateException();
		}
		return this;
	}
	
	public Guru99Login setUsername(String username){
		driver.findElement(usernameField).sendKeys(username);
		return this;
	}
	public Guru99Login setPassword(String password){
		driver.findElement(passwordField).sendKeys(password);
		return this;
	}
	public Guru99Bank clickLogin(){
		driver.findElement(loginButton).click();
		return new Guru99Bank(driver);
	}
	public Guru99Bank login(String username, String password){
		setUsername(username);
		setPassword(password);
		clickLogin();
		return new Guru99Bank(driver);
	}
}
