package POM_Classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass1;

public class ChildWin extends UtilClass1{
	
	WebDriver driver;
	
	@FindBy(xpath=("//*[@id='ctl00_HLoggedCompany']/table/tbody/tr[2]/td[1]"))
	private WebElement Profile ;
	
	@FindBy(xpath=("/html/body/form/div[3]/div/div/div[1]/div[1]/ul/li/span[1]/img"))
	private WebElement NEWTag;
	
	//*[@id="ctl00_btnNew"]
	@FindBy(xpath=("//*[@id='ctl00_btnSave']"))
	private WebElement Save;
	
	@FindBy(xpath=("//*[@class='btn btn-primary']"))
	private WebElement YES;
	
	@FindBy(xpath=("(//button[text()='Close'])"))
	private WebElement Close;
	
	public ChildWin (WebDriver driver ) {
		PageFactory.initElements(driver, this);
		this.driver = driver ;
	}
	
	public void is_Profile() throws IOException, InterruptedException
	{
		expliciteWait(driver,Profile).getText();
		Profile.isDisplayed();
	}
	public void is_NEWTag1() throws IOException, InterruptedException 
	{
		Set <String> addresses = driver.getWindowHandles();
	        for(String k : addresses ) {
	        	System.out.println(k);
	        	driver.switchTo().window(k);
	        	try{
	        		   expliciteWait(driver,NEWTag).click();
	        		   String ChildPageTitle=driver.getTitle();  
	        	    }
	        	catch(Exception e) {
	        		System.err.println(e);
	        	    }
	        }	 
	    }
	
	public void is_ClickSave2() throws IOException, InterruptedException 
	{
		expliciteWait(driver,Save);
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		WebElement element = expliciteWait(driver,Save);
		js.executeScript("arguments[0].scrollIntoView(true)",Save);
		Save.click();	
	}
	
	public void is_ClickYES3()throws IOException, InterruptedException {
		expliciteWait(driver,YES);
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		WebElement element = expliciteWait(driver,YES);
		js.executeScript("arguments[0].scrollIntoView(true)",YES);
		YES.click();
	}    
	
	public void is_ClickClose4()throws IOException, InterruptedException {
		expliciteWait(driver,Close);
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		WebElement element = expliciteWait(driver,Close);
		js.executeScript("arguments[0].scrollIntoView(true)",Close);
		Close.click();
	}	
}
