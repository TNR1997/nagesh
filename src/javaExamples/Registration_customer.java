package javaExamples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Registration_customer {
	public static void main(String args[])throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://183.82.103.245:8888/BankingProject/LoginFormBuild1.jsp");
		Thread.sleep(2000);
		System.out.println("Application Opend");
		if(driver.getPageSource().equals("If you(only Customer) entered wrong password three times your account will be locked"))
		{
			System.out.println("Test case Fail");
		}
		else
		{
			System.out.println("Test Case Pass");
		}
		driver.findElement(By.name("username")).sendKeys("Nagesh");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Nagesh9026");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		System.out.println("Login Completed");
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//a[@id='link1']"))).perform();
		Thread.sleep(2000);
		ac.moveToElement(driver.findElement(By.id("menuItemHilite0"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("menuItemHilite0")).click();
		Thread.sleep(2000);
		Select st =new Select(driver.findElement(By.name("branchaddress")));
		st.selectByIndex(4);
		Thread.sleep(2000);
		driver.findElement(By.name("accountInitialBalance")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Nagesh");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("tarra");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[5]/td[2]/a[1]/img[1]")).click();
		 Set<String>All=driver.getWindowHandles();
		    String parent=(String)All.toArray()[0];
		    String child=(String)All.toArray()[1];
		    System.out.println(driver.switchTo().window(child).getTitle());
		    Thread.sleep(2000);
		    driver.findElement(By.name("time")).clear();
		    Thread.sleep(2000);
		    driver.findElement(By.name("time")).sendKeys("1998");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@class='clsOTable']/tbody/tr/td/table/tbody/tr[8]/td/input")).click();
		    Thread.sleep(2000);
		    String month="June 1998";
 			String date="19";
 			while(true)
 			{
 				String text=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font")).getText();
 				if(text.equals(month))
 				{
 					driver.findElement(By.xpath("//tbody/tr[5]/td[5]/a[1]/font[1]")).click();
 					break;
 				}
 				else
 				{
 					driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td[3]/a/img")).click();
 				}	
 				
 			}
 		
 			driver.switchTo().window(parent);
 			Thread.sleep(2000);
 			driver.findElement(By.name("hno")).sendKeys("1-45");
 			Thread.sleep(2000);
 			driver.findElement(By.name("street")).sendKeys("JawaharaNagr");
 			Thread.sleep(2000);
 			//Drop Down City
 			Select st1=new Select(driver.findElement(By.name("city")));
 			st1.selectByIndex(1);
 			Thread.sleep(2000);
 			//Drop Down state
 			Select st2=new Select(driver.findElement(By.name("state")));
 			st2.selectByIndex(1);
 			Thread.sleep(2000);
 			//Drop Down Country
 			Select st3=new Select(driver.findElement(By.name("country")));
 			st3.selectByIndex(0);
 			Thread.sleep(2000);
 			driver.findElement(By.name("pincode")).sendKeys("500036");
 			Thread.sleep(2000);
 			driver.findElement(By.name("email")).sendKeys("nagesh@gmail.com");
 			Thread.sleep(2000);
 			driver.findElement(By.name("loginID")).sendKeys("sairam");
 			Thread.sleep(2000);
 			driver.findElement(By.id("password")).sendKeys("sairam9026");
 			Thread.sleep(2000);
 			//Drop Down Secret Question
 			Select st4=new Select(driver.findElement(By.name("secretqid")));
 			st4.selectByIndex(3);
 			Thread.sleep(2000);
 			driver.findElement(By.name("secretqans")).sendKeys("aa");
 			Thread.sleep(2000);
 			driver.findElement(By.name("Input")).click();
 			Thread.sleep(2000);
 			
 			 if(driver.getPageSource().equalsIgnoreCase("Registeration Fail"))
 	        {                                            
 				                                         
 	        	System.out.println("Test Case Fail");
 	        	
 	        }
 	        else
 	        {
 	        	System.out.println("Test Case Pass");
 	        	 	        }
 	        String bgclr=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[3]/tbody/tr[1]/td/font/b")).getCssValue("color");
 	         System.out.println(bgclr);
 	        
 		 		}   
 			
 			

}
