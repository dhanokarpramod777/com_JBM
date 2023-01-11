package POM_Classes;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass1;

public class MainPage extends UtilClass1{
	
WebDriver driver;
	
	@FindBy(xpath=("(//span[@id='ctl00_SUserName'])"))
	private WebElement ProfileID;
	
	@FindBy(xpath=("//*[@id=\"navbarMenu\"]/div[2]/ul/li[5]/div/a[8]/text()"))
	private WebElement LogOut;
	
	@FindBy(xpath=("(//img[@title='JBM'])[1]"))
	private WebElement JBM;
	
	public MainPage (WebDriver driver ) 
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;
	}
	
	public void is_MainPage1() throws IOException, InterruptedException
	{
		String MainPage = driver.getWindowHandle();
	    System.out.println(MainPage);
	    Thread.sleep(2000);
	    driver.switchTo().window(MainPage);
	    System.out.println(driver.getTitle());     
	}
	
	public void is_ProfileID2 () throws IOException, InterruptedException
	{
		try{
			expliciteWait(driver,ProfileID).click();
		}
		catch(Exception e) 	
		{
 		System.err.println(e);
		}
	}
	public void is_logOut3() throws IOException, InterruptedException {
		
		try{
			expliciteWait(driver,LogOut).click();
			String pageTitle=driver.getTitle();
			
		   }
	   catch(Exception e) 	
		    {
 		System.err.println(e);
		    }
	    }

	public boolean is_JBM4() throws IOException {
	try {
		WebElement element = expliciteWait(driver, JBM);
		return true;
      	}
	catch(Exception e)
	   {
		return false;
	   }
    }

}

	