package POM_Classes;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import UtilClasses.UtilClass1;

public class ContactDetails1 extends UtilClass1{
	
	WebDriver driver;
	
	@FindBy(xpath=("//input[@id='ctl00_ContentPlaceHolder1_btnAdditem']"))
	private WebElement ADDButton ;
	
	@FindBy(xpath=("//*[@id='ctl00_ContentPlaceHolder1_txtcont_name']"))
	private WebElement Name;
	
	//*[@id="ctl00_btnNew"]
	@FindBy(xpath=("//*[@id='ctl00_ContentPlaceHolder1_txtcont_desig']"))
	private WebElement Designation;
	
	@FindBy(xpath=("//*[@id='ctl00_ContentPlaceHolder1_txtcont_mobile']"))
	private WebElement Mobile;
	
	@FindBy(xpath=("//*[@id='ctl00_ContentPlaceHolder1_txtcont_phone']"))
	private WebElement Phone;
	
	@FindBy(xpath=("//*[@id='ctl00_ContentPlaceHolder1_txtcont_email']"))
	private WebElement Email;
	
	@FindBy(xpath=("//*[@id='ctl00_ContentPlaceHolder1_ddl_contact_type']"))
	private WebElement ContactType;
	
	@FindBy(xpath=("//*[@id='ctl00_ContentPlaceHolder1_btnAdd']"))
	private WebElement ADD;
	
	
	
	public ContactDetails1 (WebDriver driver ) {
		PageFactory.initElements(driver, this);
		this.driver = driver ;
	}
	
	
	public void is_Button1() throws IOException, InterruptedException {		
		expliciteWait(driver,ADDButton).click();
	}	
		
	public void is_Name2() throws IOException, InterruptedException {
		expliciteWait(driver, Name).sendKeys("JBM/Amplitude Software Systems  Pvt. Ltd.");		   	   
	}
	
	
	public void is_Designation3() throws IOException, InterruptedException {
	 		expliciteWait(driver,Designation).sendKeys("Software Engineer");
	}
	
	
	public void is_Mobile4()throws IOException, InterruptedException {
		expliciteWait(driver,Mobile).sendKeys("7798600164");
	}    
	
	
	public void is_Phone5()throws IOException, InterruptedException {
		expliciteWait(driver,Phone).sendKeys("7768868534");	
	}    
	
	
	public void is_Email6()throws IOException, InterruptedException {
		expliciteWait(driver,Email).sendKeys("JBM7744@gmail.com");	
	}    
	
	
	public void is_ContactType7()throws IOException, InterruptedException {
		 expliciteWait(driver,ContactType).click();
    	 Select s = new Select(ContactType);
    	 s.selectByValue("jbm4");
    	 s.getFirstSelectedOption().getText();		
	}    
	
	
	public void is_ADD8()throws IOException, InterruptedException {
		expliciteWait(driver,ADD).click();	
	}    	
}
