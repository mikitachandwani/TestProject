package Array;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\selenium\\chromedriver-win64 (2)\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Logout(driver);
		driver.findElement(By.linkText("Log out")).click();
		
	
	}

	private static String Logout(WebDriver driver) {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[contains(@id,'submit')]")).click();
		return null;
	}

}
