package maven_package.maven_project;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import extent.packag.TestBase;


@Listeners (listner.my_file.class)

public class Registration_calling extends TestBase{
	
	
	
	
	
	Logger log=Logger.getLogger(Registration_calling.class);
	
	
	FirefoxDriver fx;
	fb_elements_methods ob=new 	fb_elements_methods();
	
	
	
@Test
	public void user_reg() throws InterruptedException, IOException
	{
		
		PropertyConfigurator.configure("F:\\Workspace\\maven_project\\log4j.properties");


		ob.open_browser();
		ob.max_window();
	    ob.FirstName();
		ob.surName();
		ob.Mobile();
		ob.pwd();
		ob.month();
		ob.date();
		ob.year();
		ob.timeout();	
		ob.radio();
		ob.submit();
		System.out.println("User is registered succesfully");
		
		log.info("This is a print from loginfo");
		
		
/*	String Expected="";
	String Actual=fx.findElementByXPath(".//*[@id='bluebar_profile_and_home']/div[1]/div/a/span/span").getText();
	log.info(Actual);
	Assert.assertEquals(Actual, Expected,"User is not registered");*/
		
		
	}
	
	


	
}
