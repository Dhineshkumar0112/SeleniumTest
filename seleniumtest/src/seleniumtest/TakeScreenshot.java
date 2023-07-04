package seleniumtest;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class TakeScreenshot {

	
	public static void main(String[] args) throws IOException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\chrome\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
				

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.navigate().to("https://www.leafground.com/alert.xhtml;jsessionid=node06brxlbb6m9i0feqkr49rwdxj343787.node0");
	
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		
		//Take a screenshot here
		/*TakesScreenshot screenshot=(TakesScreenshot) driver;
		File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("E://sample.png");
		FileHandler.copy(sourceFile, destinationFile);*/
		
		Robot robot = new Robot();
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle= new Rectangle(screenSize);
		BufferedImage source=robot.createScreenCapture(rectangle);
		File destinationFile=new File("E://robotsnap.png");
		ImageIO.write(source, "png", destinationFile);
	}

}
