package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver fb=new ChromeDriver();
		fb.get("https://www.redbus.in/");		
		fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		fb.manage().window().maximize();
		 fb.findElement(By.xpath("//input[@id='src']")).sendKeys("Madiwala, Bangalore",Keys.ENTER);
		 fb.findElement(By.xpath("//input[@id='dest']")).sendKeys("Koyambedu, Chennai",Keys.ENTER);
		 fb.findElement(By.xpath("//input[@id='onward_cal']")).click();
		 fb.findElement(By.xpath("//div[@class='rb-calendar']/table/tbody/tr[7]/td[7]")).click();
		 fb.findElement(By.xpath("//button[@id='search_btn']")).click();
		 System.out.println(fb.getTitle());

	}

}
