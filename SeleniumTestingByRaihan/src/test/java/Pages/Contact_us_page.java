package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contact_us_page {
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//url visit
		driver.get("https://www.nexchar.com/contactus");
		
		driver.findElement(By.id("FullName")).sendKeys("Rakib");
		driver.findElement(By.id("Email")).sendKeys("r@gmail.com");
		Select obj=new Select(driver.findElement(By.id("Query")));
		obj.selectByVisibleText("Report a bug");
		
		driver.findElement(By.id("Message")).sendKeys("Hi");
		//driver.findElement(By.linkText("Send")).click();
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		
        
        
		

	}

}
