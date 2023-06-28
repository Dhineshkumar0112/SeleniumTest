package seleniumtest;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Textboxdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://nxtgenaiacademy.com/demo-site/");
			
			WebElement firstname = driver.findElement(By.name("vfb-5"));
			firstname.sendKeys("Dhinesh");
			
			WebElement lastname = driver.findElement(By.name("vfb-7"));
			lastname.sendKeys("R");
			
			WebElement gender = driver.findElement(By.name("vfb-31"));
			gender.click();
			
			WebElement address = driver.findElement(By.name("vfb-13[address]"));
			address.sendKeys("123,");
			
			WebElement street = driver.findElement(By.name("vfb-13[address-2]"));
			street.sendKeys("gandhiji street");
			
		   WebElement city = driver.findElement(By.name("vfb-13[zip]"));
			city.sendKeys("coimbatore");
			
			WebElement state = driver.findElement(By.name("vfb-13[state]"));
			state.sendKeys("Tamil nadu");
			
			WebElement country = driver.findElement(By.name("vfb-13[country]"));
			Select select = new Select(country);
			select.selectByVisibleText("India");
			
			WebElement email = driver.findElement(By.name("vfb-14"));
			email.sendKeys("abcd@gmail.com");
			
			WebElement date = driver.findElement(By.name("vfb-18"));
			date.sendKeys("06/01/2022"+Keys.ENTER);
			
			WebElement hour = driver.findElement(By.name("vfb-16[hour]"));
			Select hrtime = new Select(hour);
			hrtime.selectByValue("05");
			
			WebElement min = driver.findElement(By.name("vfb-16[min]"));
			Select mintime = new Select(min);
			mintime.selectByIndex(6);
			
			WebElement mobile = driver.findElement(By.name("vfb-19"));
			mobile.sendKeys("9876543210");
			
			
			WebElement checkbox1 = driver.findElement(By.id("vfb-20-0"));
			checkbox1.click();
			WebElement checkbox2 = driver.findElement(By.id("vfb-20-2"));
			checkbox2.click();
			WebElement checkbox3 = driver.findElement(By.id("vfb-20-3"));
			checkbox3.click();
			WebElement checkbox4 = driver.findElement(By.id("vfb-20-4"));
			checkbox4.click();
			
			WebElement query = driver.findElement(By.name("vfb-23"));
			query.sendKeys(".....");
			
			WebElement verify = driver.findElement(By.name("vfb-3"));
			verify.sendKeys("99");
			
			WebElement submit = driver.findElement(By.name("vfb-submit"));
			submit.click();
				
			driver.quit();
	}

	
}
