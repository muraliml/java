package MARATHON;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver fb=new ChromeDriver();
		fb.get("https://in.bookmyshow.com/");
		fb.manage().window().maximize();
		fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
      
		fb.findElement(By.xpath("//input[contains(@placeholder,'Search for your city')]")).sendKeys("Rajapa");
		fb.findElement(By.xpath("//span[contains(@class,'sc-fihHvN fUfZof')]/strong")).click();
		
		String v=fb.findElement(By.xpath("//span[@class='sc-LKuAh kxVdmj ellipsis']")).getText();
		System.out.println(v);
	
		Thread.sleep(500);
		fb.findElement(By.xpath("//div[(text()='Ponniyin Selvan - Part 1')]")).click();
		fb.findElement(By.xpath("//div[@class='sc-1vmod7e-2 iBonLL']/span[1]")).click();
	
	   fb.findElement(By.xpath("(//a[@class='date-href'])[3]")).click();
	
		String m=fb.findElement(By.xpath("(//div[@class='__title'])[3]/a")).getText();
		System.out.println(m);
		
		fb.findElement(By.xpath("(//div[@class='venue-info-text'])")).click();
		String p=fb.findElement(By.xpath("(//div[@class='facility-text'])[2]")).getText();
		System.out.println(p);
		
		
		fb.findElement(By.xpath("(//div[@class='cross-container'])")).click();
		
		fb.findElement(By.xpath("(//a[@class='showtime-pill'])")).click();
		fb.findElement(By.xpath("(//div[@id='btnPopupAccept'])")).click();
			

		fb.findElement(By.xpath("(//ul[@id='popQty'])/li[1]")).click();
	
		fb.findElement(By.xpath("(//div[@id='proceed-Qty'])")).click();	
		
		fb.findElement(By.xpath("(//a[@class='_available'])[4]")).click();	
		
		fb.findElement(By.xpath("(//a[@id='btmcntbook'])")).click();
		
		String  total=fb.findElement(By.xpath("//span[@id='ttPrice']")).getAttribute("innerHTML");
		System.out.println(total);
		
	}

	
	
}
