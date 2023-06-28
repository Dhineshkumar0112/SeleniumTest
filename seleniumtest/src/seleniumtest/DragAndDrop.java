package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node0jdbhdqnvsz0s10zv3e1w8l758331645.node0");
			
			WebElement draggable = driver.findElement(By.id("form:drag"));
			WebElement droppable = driver.findElement(By.id("form:drop"));
			Actions action = new Actions(driver);
			action.dragAndDrop(draggable, droppable).build().perform();
			
			
			
			
			
			
	}

}
