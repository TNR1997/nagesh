package javaExamples;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;


public class WindowHandeler 
{
	public static void main (String args[])throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://183.82.103.245:8888/BankingProject/LoginFormBuild1.jsp");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Nagesh");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Nagesh9026");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		System.out.println("Login Completed");
		Reporter.log("Login Completed");
		Actions ac =new Actions(driver);
		ac.moveToElement(driver.findElement(By.name("link7"))).perform();
		Thread.sleep(2000);
		ac.moveToElement(driver.findElement(By.id("menuItemHilite0"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.id("menuItemHilite0")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[3]/tbody/tr[2]/td/div/form/fieldset/table/tbody/tr[5]/td[2]/a/img")).click();
	    Set<String>All=driver.getWindowHandles();
	    String parent=(String)All.toArray()[0];
	    String child=(String)All.toArray()[1];
	    System.out.println(driver.switchTo().window(child).getTitle());
	    
	    driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td/font/input")).clear();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td/font/input")).sendKeys("1995");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td/input")).click();
	    String month="October 1995";
	    String date="01";
	    while(true)
	    {	
	    	String text=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font")).getText();
	    	if(text.equals(month))
	    	{
	    		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[7]")).click();
	    		
	    		break;
	    	}
	    	else
	    	{
	    		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td[3]/a/img")).click();
	    		
	    	}
	   
	  
	    }
		driver.switchTo().window(parent);	
	}
	
}
	  
		
	


