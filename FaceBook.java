package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver fb=new ChromeDriver();
		fb.get("https://en-gb.facebook.com/");
		fb.manage().window().maximize();
		fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		fb.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		fb.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Murali");
		fb.findElement(By.xpath("//input[@name='lastname']")).sendKeys("tharan");
		fb.findElement(By.xpath("//input[contains(@aria-label,'email address')]")).sendKeys("xyz@gmail.com");
		fb.findElement(By.xpath("//input[contains(@aria-label,'Re-enter ')]")).sendKeys("xyz@gmail.com");
		fb.findElement(By.xpath("//input[contains(@data-type,'password')]")).sendKeys("tharan456");
	
		WebElement Date = fb.findElement(By.name("birthday_day"));
		Select vlu=new Select(Date);
		vlu.selectByVisibleText("18");
		
		
		WebElement month = fb.findElement(By.name("birthday_month"));
		Select vl=new Select(month);
		vl.selectByVisibleText("Apr");
		
	
		WebElement year = fb.findElement(By.name("birthday_year"));
		Select vly=new Select(year );
		vly.selectByVisibleText("1994");
		fb.findElement(By.xpath("//label[text()='Female']")).click();
		
		
	}


}
