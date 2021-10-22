package Pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//url visit
		driver.get("https://www.nexchar.com/");
		
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("r@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(1000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
       // driver.findElement(By.xpath("//span[contains(text(),'Sign Up')]")).click();
        
		

	}

}