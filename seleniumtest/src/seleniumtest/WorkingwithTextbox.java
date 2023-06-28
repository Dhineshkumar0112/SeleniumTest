package seleniumtest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithTextbox {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
	    System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]"));
		element.click();
		WebElement textbox = driver.findElement(By.xpath("//*[@id=\"menuform:m_input\"]/a"));
		textbox.click();
		
		WebElement namebox = driver.findElement(By.id("j_idt88:name"));
		namebox.sendKeys("Dhinesh kumar");
		
		WebElement city = driver.findElement(By.id("j_idt88:j_idt91"));
		city.clear();
		city.sendKeys("Erode");
		
		WebElement disabledbox = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div[3]/div"));
		boolean disable = disabledbox.isEnabled();
		System.out.println("The box disabled is "+ disable);
		
		WebElement clearit = driver.findElement(By.id("j_idt88:j_idt95"));
		clearit.clear();
		
		WebElement retrieve = driver.findElement(By.id("j_idt88:j_idt97"));
		String retrivetext =retrieve.getAttribute("value");
		System.out.println(retrivetext);
		
		WebElement emailbox = driver.findElement(By.id("j_idt88:j_idt99"));
	    emailbox.sendKeys("12345@gmail.com");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		
		WebElement about =driver.findElement(By.id("j_idt88:j_idt101"));
		about.sendKeys("Hi!, I,m Dhinesh!!...");
		
	
		WebElement message = driver.findElement(By.id("j_idt106:thisform:age"));
		
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_ENTER); 
		
		
		

	}

}
