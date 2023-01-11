package POM_Classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass1;

public class HomePage extends UtilClass1{
	
	WebDriver driver;

	@FindBy(xpath="(//span[text()='Boman Irani'])[1]")
	private WebElement profileName;   
	
	@FindBy(xpath="(//button[@type='button'])[1]")
	private WebElement Button;                           
	
	@FindBy(xpath="//*[@id='Mod27']/a")
	private WebElement CUSTOMERRELATIONMANAGEMENT;
	
	@FindBy(xpath=("//*[@id='MNNBLNK957']/a/span"))
	private WebElement CRM_Master;
	
	@FindBy(xpath=("//*[@id='MNLBLNK1044']/a/span"))
	private WebElement CustomerProfileCRM;
	
	@FindBy(xpath=("//*[@id='ctl00_btnNew']"))
	private WebElement NEWTag;
	
	//*[@id="ctl00_btnNew"]
	@FindBy(xpath=("//*[@id='ctl00_btnSave']"))
	private WebElement Save;
	
	@FindBy(xpath=("//*[@id='20487ab2-1432-436d-9ab6-e4efab61be8d']"))
	private WebElement YES;
	
	@FindBy(xpath=("//*[@id='3ef0527e-8699-4610-9531-fc2cd4274968']"))
	private WebElement Close;
	
	
	public HomePage (WebDriver driver ) {
		PageFactory.initElements(driver, this);
		this.driver = driver ;
	}
	
	
	public boolean is_profileName0() throws IOException 
	{
		try {
			
			WebElement element = expliciteWait(driver, profileName);
			return true;
			
		}catch(Exception e)
		{
			return false;
		}
	}
	
	public void is_ClickButton1() throws IOException 
	{
		Button.click();
	}
	
	public void is_ClickCUSTOMERRELATIONMANAGEMENT2() throws IOException
	{
		expliciteWait(driver, CUSTOMERRELATIONMANAGEMENT);
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		WebElement element = expliciteWait(driver,CUSTOMERRELATIONMANAGEMENT);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		element.click();
		
	}
	
	public void is_CRM_Master3() throws IOException
	{
		expliciteWait(driver, CRM_Master).click();	
	}
	
	public void is_CustomerProfileCRM4() throws IOException
	
	{
		String pageTitle=driver.getTitle(); 
		expliciteWait(driver, CustomerProfileCRM).click();
	    
		Set <String> addresses = driver.getWindowHandles();
		List <String> addresses1 = new ArrayList<String>(addresses);
		driver.switchTo().window(addresses1.get(0));
	}	
}
