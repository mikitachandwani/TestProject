package Array;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutosuggestive {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjfkKWVrZeEAxWsiK8BHcMgAF0QPAgJ");
		driver.findElement(By.id("APjFqb")).sendKeys("Test");
		Thread.sleep(2000);
List<WebElement> options = driver.findElements(By.cssSelector("ul[role='listbox'] li"));
System.out.println(options.size());

List<WebElement> counts = driver.findElements(By.cssSelector("ul[role='listbox'] li"));
for(WebElement count :counts)
{
	System.out.println(count.getText());
}


		
		for(WebElement option :options)
		{
			
			if(option.getText().equalsIgnoreCase("test match"))
			{
	
				option.click();
			break;
			}
		}
		

	}
}
