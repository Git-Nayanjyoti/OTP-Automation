package OTPAutomation.main;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginOTP {

	public static final String accountSID = "ACce0a7cdce281fb6773ec233ca3ef6a7a";
	public static final String authToken = "2c3f766b52ee2649d1191fd6c4fc070b";

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		
		driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[text()=\"New to Flipkart? Create an account\"]")).click();
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		WebElement Id = driver.findElement(By.xpath("//iframe[title=\"Sign in with Google Button\"]"));
		driver.switchTo().frame(Id);
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
