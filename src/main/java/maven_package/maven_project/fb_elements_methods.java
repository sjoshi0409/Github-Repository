package maven_package.maven_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fb_elements_methods extends read_excel_2 {
	
	
	
	
	FirefoxDriver fx=new FirefoxDriver();
	
By FirstName= By.xpath(".//*[@id='u_0_j']");

By Surname= By.xpath(".//*[@id='u_0_l']");

By Mobile= By.xpath(".//*[@id='u_0_o']");

By Newpassword= By.xpath(".//*[@id='u_0_v']");

By date= By.xpath(".//*[@id='day']");

By month= By.xpath(".//*[@id='month']");

By year= By.xpath(".//*[@id='year']");

By maleradio= By.xpath(".//*[@id='u_0_a']");

By femaleradio= By.xpath(".//*[@id='u_0_6']");

By submit= By.xpath(".//*[@id='u_0_11']");

By hover_logout= By.xpath(".//*[@id='userNavigationLabel']");

By login_email=By.xpath(".//*[@id='email']");
By login_pwd=By.xpath(".//*[@id='pass']");

By login_button=By.xpath(".//*[@id='loginbutton']");




//methods



public void open_browser()
{
	fx.get("https://www.facebook.com/");
	
}

public void max_window()
{

fx.manage().window().maximize();
}


public void FirstName()
{
	
	fx.findElement(FirstName).sendKeys("TOM");
String fc =	fx.findElement(FirstName).getAttribute("value");
	
	System.out.println(fc);
	//;

}

public void surName()
{
	
fx.findElement(Surname).sendKeys("crusj");
}

public void Mobile()
{
	
fx.findElement(Mobile).sendKeys("9834627811");
}

public void pwd() throws IOException {
File f=new File("F:\\Workspace\\maven_project\\Read_Excel\\sj.xlsx");
	FileInputStream fis=new FileInputStream(f);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sh=wb.getSheetAt(0);
	
	
		fx.findElement(Newpassword).sendKeys(sh.getRow(9).getCell(7).getStringCellValue());	
		

}


public void month()
{
	
fx.findElement(month).sendKeys("July");
}

public void date()
{
	
fx.findElement(date).sendKeys("25");
}
public void year()
{
	
fx.findElement(year).sendKeys("1992");
}
public void timeout() throws InterruptedException
{
	
Thread.sleep(2000);
}

public void radio()
{
	
fx.findElement(maleradio).click();
}

public void submit()
{
	fx.findElement(submit).click();
}

public void close()
{
fx.close();

}

public void login_email()
{
	fx.findElement(login_email).sendKeys("9834627811");
}


public void login_pwd()
{
	fx.findElement(login_pwd).sendKeys();
}


public void login_submit()
{
	fx.findElement(login_button).click();
}




}





