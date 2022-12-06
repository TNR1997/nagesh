package javaExamples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Test {
	   public static void main(String args[])throws InterruptedException{
	       
	        System.setProperty("webdriver.chrome.driver","C:\\Automation\\Driver\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	            driver.get("http://183.82.103.245:8888/BankingProject/LoginFormBuild1.jsp");
	            driver.manage().window().maximize();
	            System.out.println("Application Is opened");
	            Thread.sleep(2000);
	        driver.navigate().refresh();
	        System.out.println("Refresh Completed");
	           
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        String domain=js.executeScript("return document.domain;").toString();
	        System.out.println("Domain is:" + domain);
	        Thread.sleep(2000);
	        String url=js.executeScript("return document.URL;").toString();
	        System.out.println("Url Is:"+ url);
	        Thread.sleep(2000);
	       
	        String title=js.executeScript("return document.title;").toString();
	        System.out.println("Title is:" + title);
	        Thread.sleep(2000);
	       
	       
	        WebElement uid=driver.findElement(By.name("username"));
	       
	        js.executeScript("arguments[0].value='nareshit'",uid );
	       
	        String text=(String) js.executeScript("return arguments[0].value",uid);
	        System.out.println("UserId:"+text);
	       
	        WebElement pass=driver.findElement(By.name("password"));
	       
	        js.executeScript("arguments[0].value='nareshit'",pass);
	       
	        String text1=(String)js.executeScript("return arguments[0].value",pass);
	        System.out.println("Password:" +text1);
	       
	        driver.findElement(By.name("Submit")).click();
	        Thread.sleep(2000);
	        System.out.println("Login Completed");
	       
	        if(driver.getPageSource().contains("Welcome To Administrator"))
	        {
	            System.out.println("Welcome Text Is Displayed");
	        }
	        else
	        {
	            System.out.println("Is not Displayed");
	        }
	           
	    Thread.sleep(2000);
	   
	    driver.navigate().back();
	    System.out.println("Page Back Completed");
	    Thread.sleep(2000);
	    driver.navigate().forward();
	    System.out.println("Page Forward Completed");
	   
	    WebElement logout=driver.findElement(By.linkText("Logout"));
	   
	    js.executeScript("arguments[0].click();",logout);
	    System.out.println("Logout Completed");
	   
	    Thread.sleep(2000);
	   
	    driver.close();
	    System.out.println("Application is Closed");
	   
	  }
	}

