package javaExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class onlineBanking {
	public static void main (String args[])throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://183.82.103.245:8888/BankingProject/LoginFormBuild1.jsp");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("nareshit");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("nareshit");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		System.out.println("Login completed");
		//mouse over Branches
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.name("link7"))).perform();
		Thread.sleep(2000);
		//mouse over view Branches
		ac.moveToElement(driver.findElement(By.id("menuItemHilite1"))).perform();
		Thread.sleep(2000);
		//click on view Branches
		driver.findElement(By.id("menuItemHilite1")).click();
		Thread.sleep(2000);
		//row
		int row=driver.findElements(By.xpath("/html/body/table/tbody/tr/td/table[3]/tbody/tr/td/center/h3/form/table/tbody/tr")).size();
		System.out.println(row);
		Thread.sleep(2000);
		//col
		int col=driver.findElements(By.xpath("/html/body/table/tbody/tr/td/table[3]/tbody/tr/td/center/h3/form/table/tbody/td")).size();
		System.out.println(col);
		Thread.sleep(2000);
		//row
		int row_col=driver.findElements(By.xpath("/html/body/table/tbody/tr/td/table[3]/tbody/tr/td/center/h3/form/table/tbody/tr/td")).size();
		System.out.println(row_col);
		Thread.sleep(2000);
		String cellData=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[3]/tbody/tr/td/center/h3/form/table/tbody/tr[9]/td[2]/a")).getText();
		System.out.println(cellData);
	    Thread.sleep(2000);
	    
	    	String rowdata=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[3]/tbody/tr/td/center/h3/form/table/tbody/tr[7]")).getText();
	    	System.out.println(rowdata);
	    

	    for(int i=1;i<=row;i++)
	    {
	    	String data=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[3]/tbody/tr/td/center/h3/form/table/tbody/tr["+i+"]")).getText();
	    	System.out.println(data);
	    }
	    driver.close();
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


}
}