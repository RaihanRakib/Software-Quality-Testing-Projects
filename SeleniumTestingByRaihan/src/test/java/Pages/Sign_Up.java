package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sign_Up {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.nexchar.com/signup");
		driver.findElement(By.id("Name")).sendKeys("Raihan");
		Thread.sleep(1000);
		Select obj=new Select(driver.findElement(By.id("CategoryId")));
		
		obj.selectByVisibleText("Sporting & Outdoor");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("r@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.id("NotReceiveNewsLetter")).click();
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);

	}

}
