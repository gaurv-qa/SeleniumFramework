package dataProvider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceldataProvider 
{
	XSSFWorkbook wb;
	
	public  ExceldataProvider()
	{

		File src = new File("./ApplicationTestData/AppData.xlsx");
		
		try
		{
			
			FileInputStream fis = new FileInputStream(src);
			
			wb= new XSSFWorkbook(fis);
		}
		
		catch(Exception e)
		{
			System.out.println("Exception is "+ e.getMessage());	
		}
		
	}
	
	public String getData(int sheetIndex, int Row, int Column)
	{
		
		String data = wb .getSheetAt(sheetIndex).getRow(Row).getCell(Column).getStringCellValue();
		return data;
		
	}
	
	
	
	public String getData(String sheetName, int Row, int Column)
	{
		
		String data = wb .getSheet(sheetName).getRow(Row).getCell(Column).getStringCellValue();
		return data;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
