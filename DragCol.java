package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragCol {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver fb=new ChromeDriver();
		fb.get("https://www.leafground.com/drag.xhtml");		
		fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		fb.manage().window().maximize();
		 WebElement wbe = fb.findElement(By.xpath("//div[@class='ui-datatable-tablewrapper']/table/thead/tr/th"));
		
		 WebElement wbe1 = fb.findElement(By.xpath("//div[@class='ui-datatable-tablewrapper']/table/thead/tr/th[3]"));
		 
		 Actions act= new Actions(fb);
		 act.moveToElement(wbe).perform();
		 act.dragAndDrop(wbe, wbe1).perform();
		 
		 WebElement wbe2 = fb.findElement(By.xpath("//div[@id='form:msgs_container']"));
		System.out.println(wbe2.getText());
		 WebElement wbe3 = fb.findElement(By.xpath("(//div[@class='ui-datatable-tablewrapper'])[2]/table/tbody/tr[3]"));
		 WebElement wbe4 = fb.findElement(By.xpath("(//div[@class='ui-datatable-tablewrapper'])[2]/table/tbody/tr[4]"));
		 Actions act1= new Actions(fb);
		 
		 act1.moveToElement(wbe3).perform();
		 act1.dragAndDrop(wbe3,wbe4).perform();
		 WebElement wbe5 = fb.findElement(By.xpath("//div[@id='form:msgs_container']"));
			System.out.println(wbe5.getText());
//			fb.close();
	
	}

}
