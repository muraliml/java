package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert1 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		ChromeDriver fb=new ChromeDriver();
		fb.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		fb.manage().window().maximize();
		fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		fb.findElement(By.xpath("//input[@name='alert']")).click();
		
		Alert alert=fb.switchTo().alert();
	 String	text=alert.getText();
	 System.out.println(text);
	 alert.accept();
	 fb.findElement(By.xpath("//input[@name='confirmation']")).click();
	 alert.dismiss();
	 fb.findElement(By.xpath("//input[@name='prompt']")).click();
	 alert.sendKeys("murali");
	 alert.accept();
	}

}
