package maven_package.maven_project;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class read_excel_2 {
	
	

public static void main(String[] args) throws IOException {
		
		File f=new File("F:\\Workspace\\maven_project\\Read_Excel\\sj.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
	
		
		
		String x=sh.getRow(9).getCell(7).getStringCellValue();
		System.out.println(x);
		
	
	
}
}

