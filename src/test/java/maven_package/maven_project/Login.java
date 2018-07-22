package maven_package.maven_project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import extent.packag.TestBase;

public class Login extends TestBase{
	fb_elements_methods ob=new 	fb_elements_methods();

  @Test
 public void login() throws IOException
 {
	  ob.open_browser();
		ob.max_window();
	 ob.login_email();
	 ob.login_pwd();
	 ob.login_submit();
	 ob.close();
	  
	 File src=((TakesScreenshot)ob).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(src, new File("F:\\Workspace\\maven_project\\trial\\snap1.jpg"));
	 
	 
	  
  }
}
