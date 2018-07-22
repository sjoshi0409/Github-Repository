package extent.packag;

import org.automationtesting.excelreport.Xl;

public class excel_report {

	public static void main(String[] args)  {
		
	
		try {
			//Xl.generateReport("F:\\Workspace\\maven_project\\trial", "excel_report.xls");
			
			//Xl.generateReport("excel_report.xlsx");
			
			Xl.generateReport("F:\\Workspace\\maven_project\\trial", "exHGVGcel.xlsx");
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

