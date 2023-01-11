package POM_Classes;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass1;

public class LoginPage extends UtilClass1 {
	
	WebDriver driver;

	@FindBy(xpath="(//input[@id='txtName'])")
	private WebElement loginEmail;                         
	
	@FindBy(xpath="(//input[@id='txtPassword'])")
	private WebElement PassWord;
	
	@FindBy(xpath=("(//button[@id='btnLogin'])"))
	private WebElement ClickSubmitButton;
	
	
	public LoginPage (WebDriver driver ) 
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;
	}
	
	public void is_Enetr_Email() throws IOException {
		loginEmail.sendKeys(getDataFromPropertyFile("email"));
		
	}
	
	public void is_Enter_PassWord() throws IOException
	{
		expliciteWait(driver, PassWord).sendKeys(getDataFromPropertyFile("password"));
		
	}
	
	public void is_Click_SubmitButton5() 
	{
		expliciteWait(driver, ClickSubmitButton);
		ClickSubmitButton.click();
	}

}


