package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irail {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver fb=new ChromeDriver();
		fb.get("https://erail.in/");		
		fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		fb.manage().window().maximize();
		fb.findElement(By.xpath("//input[@id='txtStationFrom']")).click();
	    fb.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("mas",Keys.ENTER);
     	fb.findElement(By.xpath("//input[@id='txtStationTo']")).click();
    	fb.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("mdu",Keys.ENTER);
    	fb.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
    	fb.findElement(By.xpath("//input[@id='buttonFromTo']")).click();		
		List<WebElement> cs=fb.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]/tbody/tr/td[2]"));
	   int csz=cs.size();	  
	   List<String> lt=new ArrayList<String>();
	   int cz=cs.size();
	   for(int i=0;i<=csz;i++)
	   {
  	   String nam=fb.findElement(By.xpath("//div[@id='divTrainsList']/table/tbody/tr/td[2]")).getText();	   
        lt.add(nam);
            
	  }
	  
	  Set<String> nw=new LinkedHashSet<String>(lt);
      System.out.println(csz);
	  System.out.println(cz);
	
	}
	
}
