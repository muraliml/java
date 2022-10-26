package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lefgnd {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver fb=new ChromeDriver();
		fb.get("https://www.leafground.com/menu.xhtml");		
		fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		fb.manage().window().maximize();
		 fb.findElement(By.xpath("(//a[@role='menuitem'])[9]")).click();
		 WebElement hse = fb.findElement(By.xpath("(//a[@role='menuitem'])[9]"));
		 
		 Actions act= new Actions(fb);
		 act.moveToElement(hse).perform();
		 act.contextClick(hse).perform();
		 fb.findElement(By.xpath("(//span[text()='Options'])[2]")).click();
		 
		 WebElement hsa = fb.findElement(By.xpath("(//a[@role='menuitem'])[36]"));
		 act.moveToElement(hsa).perform();
		 act.click(hsa).perform();
		 WebElement hsi=fb.findElement(By.xpath("(//div[@style='display: block;'])[2]"));
		 act.moveToElement(hsi).perform();
		 act.click(hsi).perform();
	}

}
