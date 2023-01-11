package TestClass;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BaseClasses.BaseClass1;
import POM_Classes.ChildWin;
import POM_Classes.ContactDetails1;
import POM_Classes.HomePage;
import POM_Classes.LoginPage;
import POM_Classes.MainPage;
import POM_Classes.ProfileDetial;
import UtilClasses.UtilClass1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v100.profiler.model.Profile;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class VerifyUsercanLogin extends UtilClass1 {
	WebDriver driver ;
	LoginPage lp;
	HomePage hp;
	ChildWin cw;
	ProfileDetial pd ;	
	ContactDetails1 cd;
	MainPage mp ;
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	ExtentTest test;
	
	  @BeforeClass
	  
	  public void beforeClass() throws InterruptedException { 
		  driver = BaseClass1.getChromeDriver();
		  htmlReporter = BaseClass1.gethtmlReporter();
		  report = BaseClass1.getExtentReports();
		  test = BaseClass1.getTestForReproter("VerifyUsercanLogin");
			
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() throws IOException, InterruptedException {
		 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  lp = new LoginPage(driver);
		  hp=  new HomePage(driver);
		  cw = new ChildWin(driver);
		  pd = new ProfileDetial (driver);
		  cd = new ContactDetails1(driver);  
		  mp = new MainPage(driver);
	  }
	  
	  @Test(priority=1)
	  public void LoginUser() throws IOException, InterruptedException {
		    lp.is_Enetr_Email();
		    lp.is_Enter_PassWord();
		    lp.is_Click_SubmitButton5();
		    Thread.sleep(2000);
	  }
	 
	  @Test(priority=2)
	  public void HomePage() throws IOException, InterruptedException {
		  	hp.is_profileName0();   
		    hp.is_ClickCUSTOMERRELATIONMANAGEMENT2();
		    hp.is_CRM_Master3();
		    hp.is_CustomerProfileCRM4();   
	  }
	 
	  @Test(priority=3)
	  public void chiledwin() throws IOException, InterruptedException {
		    Thread.sleep(2000);
	        cw.is_NEWTag1();
	        System.out.println("Please wait More than 120 second");
	  }
	  
	  @Test(priority=4)
	  public void ProfilePage() throws IOException, InterruptedException {
		  
	pd.is_name1();
	pd.is_IEcode2();
	pd.is_addres3();
	pd.is_city4();
	pd.is_PostalCode5();
	pd.is_TelephoneCountryCode6();
	pd.is_AreaCode7();
	pd.is_PhoneNumber8();
	pd.is_MobaileNumber9();
	pd.is_Email10();
	pd.is_KeyPerson1_11();
	pd.is_KeyPerson2_12();
	pd.is_Designation1_13();
	pd.is_Designation2_14();
	pd.is_ContactNo1_15();
	pd.is_ContactNo2_16();
	pd.is_Email1_17();
	pd.is_Email2_18();
	pd.is_Country1_19();
	pd.is_Country2_20();pd.is_TextRemark21();
	pd.is_SalesPerson22();
	pd.is_PIN_PAN23();
	pd.is_PIN_PAN23();
	pd.is_Currency24();
	pd.is_Classification25();
	
	cw.is_ClickSave2();
	cw.is_ClickYES3();
	cw.is_ClickClose4();
	Thread.sleep(3000);
	
	  }
	  
	  @Test(priority=5)
	  public void ContactDetails() throws IOException, InterruptedException {
	cd.is_Button1();
	cd.is_Name2();
	cd.is_Designation3();
	cd.is_Mobile4();
	cd.is_Phone5();
	cd.is_Email6();
	cd.is_ContactType7();
	cd.is_ADD8();
	
	cw.is_ClickSave2();
	cw.is_ClickYES3();
	cw.is_ClickClose4();
    Thread.sleep(2000);
	  }
	  @Test(priority=6)
	  public void MainPage() throws IOException, InterruptedException {
		   mp.is_MainPage1();
		   mp.is_ProfileID2();
		   mp.is_logOut3(); 
		   mp.is_JBM4();
	  }
	  
	  
	  @AfterMethod
	  public void afterMethod(ITestResult result) throws IOException {

		  if(result.getStatus() == ITestResult.SUCCESS){
				test.log(Status.PASS, "Test is passed " + result.getName());
			}
			else
			{
				String path = hp.getScreenShot(driver, result.getName());
				test.log(Status.FAIL, "Test is failed " + result.getName(), 
				MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			}  			  
	  } 
  @AfterClass
  public void afterClass() {
	  report.flush();
	  driver.quit();  
  }
}
