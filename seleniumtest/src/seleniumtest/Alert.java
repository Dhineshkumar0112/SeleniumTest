package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement alertbox = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		alertbox.click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement alertwithokandcancel = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		alertwithokandcancel.click();
		WebElement confirm = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		confirm.click();
		org.openqa.selenium.Alert confirmbox = driver.switchTo().alert();
		confirmbox.dismiss();
		
		WebElement alertwithtextbox = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		alertwithtextbox.click();
		WebElement promptbox = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		promptbox.click();
		org.openqa.selenium.Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("Dhinesh");
		promptalert.accept();
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
