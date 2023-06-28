package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.leafground.com/link.xhtml");;
			
			WebElement dashboard = driver.findElement(By.linkText("Go to Dashboard"));
			dashboard.click();
			driver.navigate().back();
			
			WebElement wheretogo = driver.findElement(By.partialLinkText("Find the URL"));
			String where =wheretogo.getAttribute("href");
			System.out.println("Link is going to : "+where);
			
			WebElement broken = driver.findElement(By.linkText("Broken?"));
			broken.click();
		String title =	driver.getTitle();
			if (title.contains("404")) {
				System.out.println("Link is broken");
				
			}
			driver.navigate().back();
			
			WebElement dashboard1 = driver.findElement(By.linkText("Go to Dashboard")); 
			dashboard1.click();
			driver.navigate().back();
			
			List<WebElement> count =	driver.findElements(By.tagName("a"));
			int links = count.size();
			System.out.println("Total links are : " +links);
			
			
	}

}
