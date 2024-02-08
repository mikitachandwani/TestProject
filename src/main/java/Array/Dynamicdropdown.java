package Array;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxOptions")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).clear();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Kochi")).click();
		

		// TODO Auto-generated method stub

	}

	}


