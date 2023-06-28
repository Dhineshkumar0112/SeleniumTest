package seleniumtest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandelling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.leafground.com/window.xhtml");
			
			String oldwindow = driver.getWindowHandle();
			WebElement openwindow = driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span"));
			openwindow.click();
			
			Set<String> handles =driver.getWindowHandles();

			for (String newWindow : handles) {
				
				driver.switchTo().window(newWindow);
			}
			driver.close();
			
			driver.switchTo().window(oldwindow);
			
			WebElement openmultiple = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span"));
			openmultiple.click();
			
		int windowsize =	driver.getWindowHandles().size();
		System.out.println("No of windows opened : "+windowsize);
		
		WebElement closewindows = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		closewindows.click();
		
		Set<String> newhandles= driver.getWindowHandles();
		for (String allwindows : newhandles) {
			
			if (!allwindows.equals(oldwindow)) {
				driver.switchTo().window(allwindows);
				driver.close();
					}
		
			}
		
		driver.switchTo().window(oldwindow);
		
		WebElement delayWindow = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]/span"));
		delayWindow.click();
			
		Set<String> lasthandles =driver.getWindowHandles();

		for (String newWindow1 : lasthandles) {
		if (!newWindow1.equals(oldwindow)) {
			driver.switchTo().window(newWindow1);
			driver.close();
		}
			
		}
		
		
		driver.switchTo().window(oldwindow);
			
		driver.quit();	

	}

}
