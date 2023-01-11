package POM_Classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import UtilClasses.UtilClass1;

public class ProfileDetial extends UtilClass1 {
WebDriver driver;
	
	@FindBy(xpath=("(//input[@type='text'])[1]"))
	private WebElement Name;
	
	@FindBy(xpath=("(//input[@type='text'])[2]"))
	private WebElement IEcode;
	
	@FindBy(xpath=("(//textarea[@id='ctl00_ContentPlaceHolder1_txtaddress'])"))
	private WebElement Addres;
	
	@FindBy(xpath=("(//input[@type='text'])[4]"))
	private WebElement City;
	
	@FindBy(xpath=("(//input[@type='text'])[5]"))
	private WebElement PostalCode;
	
	@FindBy(xpath=("(//input[@type='text'])[8]"))
	private WebElement TelephoneCountryCode;
	
	@FindBy(xpath=("(//input[@type='text'])[9]"))
	private WebElement AreaCode;
	
	@FindBy(xpath=("(//input[@type='text'])[10]"))
	private WebElement PhoneNumber;
	
	@FindBy(xpath=("(//input[@type='text'])[15]"))
	private WebElement MobaileNumber;
	
	@FindBy(xpath=("(//input[@type='text'])[16]"))
	private WebElement Email;
	
	@FindBy(xpath=("(//input[@type='text'])[17]"))
	private WebElement KeyPerson1;
	
	@FindBy(xpath=("(//input[@type='text'])[18]"))
	private WebElement KeyPerson2;
	
	@FindBy(xpath=("(//input[@type='text'])[19]"))
	private WebElement Designation1;
	
	@FindBy(xpath=("(//input[@type='text'])[20]"))
	private WebElement Designation2;
	
	@FindBy(xpath=("(//input[@type='text'])[21]"))
	private WebElement ContactNo1;

	@FindBy(xpath=("(//input[@type='text'])[22]"))
	private WebElement ContactNo2;
	
	@FindBy(xpath=("(//input[@type='text'])[23]"))
	private WebElement Email_1;
	
	@FindBy(xpath=("(//input[@type='text'])[24]"))
	private WebElement Email_2;
	
	@FindBy(xpath=("(//input[@type='text'])[25]"))
	private WebElement Country1;
	
	@FindBy(xpath=("(//input[@type='text'])[26]"))
	private WebElement Country2;

	@FindBy(xpath=("//*[@id='ctl00_ContentPlaceHolder1_txtremarks']"))
	private WebElement TextRemark;
	
	@FindBy(xpath=("//*[@id='ctl00_ContentPlaceHolder1_ddlsp']"))
	private WebElement SalesPerson;
	
	@FindBy(xpath=("(//input[@type='text'])[27]"))
	private WebElement   PIN_PAN;
;
	
	@FindBy(xpath=("//select[@id='ctl00_ContentPlaceHolder1_ddlcurrency']"))
	private WebElement Currency;
	

	@FindBy(xpath=("//*[@id='ctl00_ContentPlaceHolder1_ddl_classification']"))
	private WebElement Classification;
	
	@FindBy(xpath=(" //*[@id='ctl00_ContentPlaceHolder1_btnAdditem']"))
	private WebElement ContentPlaceHolderHistary;
	
	@FindBy(xpath=("(//*[@id='Dragable']/div[1]/button)[2]"))
	private WebElement close;
	
	
	
	public  ProfileDetial (WebDriver driver ) {
		PageFactory.initElements(driver, this);
		this.driver = driver ;
	}
	
	public void is_name1() throws IOException, InterruptedException {
		
		expliciteWait(driver,Name).sendKeys("JBM/Amplitude Software Systems Pvt. Ltd.");
     	 Thread.sleep(3000);

	}
	
	public void is_IEcode2() throws IOException, InterruptedException {
		
		expliciteWait(driver,IEcode).sendKeys("1234567890");
     	 Thread.sleep(2000);

	
	}
	
	public void is_addres3() throws IOException, InterruptedException {
		
		expliciteWait(driver,Addres).sendKeys("Powai, Mumbai, Maharashtra");
    	 Thread.sleep(2000);

	
	}
	
	public void is_city4() throws IOException, InterruptedException {
		
		expliciteWait(driver,City).sendKeys("Mumbai");
    	 Thread.sleep(2000);

	}
	

	public void is_PostalCode5() throws IOException, InterruptedException {
		
		expliciteWait(driver,PostalCode).sendKeys("400076");
     	 Thread.sleep(1000);
	
	}
	
	public void is_TelephoneCountryCode6() throws IOException, InterruptedException {
		
		expliciteWait(driver,TelephoneCountryCode).sendKeys("+91");
    	 Thread.sleep(2000);

	
	}
	public void is_AreaCode7() throws IOException, InterruptedException {
		
		expliciteWait(driver,AreaCode).sendKeys("022");
    	 Thread.sleep(2000);

	
	}
	
         public void is_PhoneNumber8() throws IOException, InterruptedException {
		
		expliciteWait(driver,PhoneNumber).sendKeys("7798600169");
    	 Thread.sleep(2000);

	
	}
         public void is_MobaileNumber9() throws IOException, InterruptedException {
     		
     		expliciteWait(driver,MobaileNumber).sendKeys("7798600165");
        	 Thread.sleep(2000);

     	
     	}
	
         public void is_Email10() throws IOException, InterruptedException {
      		
      		expliciteWait(driver,Email).sendKeys("JBM7744@gmail.com");
        	 Thread.sleep(2000);

      	
      	}
         public void is_KeyPerson1_11() throws IOException, InterruptedException  {       		
       		expliciteWait(driver,KeyPerson1).sendKeys("12002");
        	 Thread.sleep(2000);
        	}
         
         public void is_KeyPerson2_12() throws IOException, InterruptedException {	
        		expliciteWait(driver,KeyPerson2).sendKeys("11001");
            	 Thread.sleep(2000);
        }
         
         public void is_Designation1_13() throws IOException, InterruptedException  {
     		expliciteWait(driver,Designation1).sendKeys("Software Enginer");
        	 Thread.sleep(2000);	
         }
         
         public void is_Designation2_14() throws IOException, InterruptedException  {
     		expliciteWait(driver,Designation2).sendKeys("Software Enginer");
        	 Thread.sleep(2000);
     	}
         
         public void is_ContactNo1_15() throws IOException, InterruptedException {
      		expliciteWait(driver,ContactNo1).sendKeys("7798600164");
        	 Thread.sleep(2000);
      	}
         
         public void is_ContactNo2_16() throws IOException, InterruptedException {     		
      		expliciteWait(driver,ContactNo2).sendKeys("7798600165");
        	 Thread.sleep(2000);  	
      	}
         
         public void is_Email1_17() throws IOException, InterruptedException {	
      		expliciteWait(driver,Email_1).sendKeys("JBM123@gmail.com");
        	 Thread.sleep(2000);
      	}
         
         public void is_Email2_18() throws IOException, InterruptedException {
      		expliciteWait(driver,Email_2).sendKeys("JBM4456@gmail.com");      
        	 Thread.sleep(2000);
      	}
         
         public void is_Country1_19() throws IOException, InterruptedException {	
      		expliciteWait(driver,Country1).sendKeys("India");
        	 Thread.sleep(2000);
      	}
         
         public void is_Country2_20() throws IOException, InterruptedException {
        	 
        		expliciteWait(driver,Country2).sendKeys("India");
        	 Thread.sleep(2000);
      	}
         
         public void is_TextRemark21() throws IOException, InterruptedException {
     		expliciteWait(driver,TextRemark).sendKeys("NO Comment");
        	 Thread.sleep(2000);
       	}
         
         public void is_SalesPerson22() throws IOException, InterruptedException {   	 
        	 expliciteWait(driver,SalesPerson).click();
        	 Thread.sleep(1000);
        	 Select s = new Select(SalesPerson);
        	 s.selectByValue("BLNK568");
     	    s.getFirstSelectedOption().getText();
     	    Thread.sleep(2000);
        	}
         
         public void is_PIN_PAN23() throws IOException, InterruptedException {
        		expliciteWait(driver,PIN_PAN).sendKeys("GJQPN2519X");
            	 Thread.sleep(2000);
        	}
         
         public void is_Currency24() throws IOException, InterruptedException {
        	 expliciteWait(driver,Currency).click(); 
        	 Thread.sleep(1000);
        	 Select s = new Select(Currency);
        	 s.selectByValue("TEST2");
     	    s.getFirstSelectedOption().getText();
        	 Thread.sleep(2000);
     	   }
         
         public void is_Classification25() throws IOException, InterruptedException {
        	 expliciteWait(driver,Classification).click();
        	 Thread.sleep(1000);
        	 Select s = new Select(Classification);
        	 s.selectByVisibleText("NEW CUSTOMERS");
     	    s.getFirstSelectedOption().getText();
       	 Thread.sleep(2000);
     	    }
         
         public void is_Histary26() throws IOException, InterruptedException {
        	 expliciteWait(driver,ContentPlaceHolderHistary);
          	 Thread.sleep(2000);      	
     	    }
}
