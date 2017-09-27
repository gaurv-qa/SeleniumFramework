package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConfigDataProvider 
{
	Properties pro;
	public  ConfigDataProvider()
	{
		File src = new File(".Configuration\\config.properties");
		
		try
		{
			
			FileInputStream fis = new FileInputStream(src);
			
			pro = new Properties();
			pro.load(fis);
		}
		
		catch(Exception e)
		{
			System.out.println("Exception is "+ e.getMessage());	
		}
	}	
	
	public String getChromepath()
	{
		String URL= pro.getProperty("Chromepath");
		return URL;
	}
	
	public String getApplicationuurl()
	{
		String URL= pro.getProperty("URL");
		return URL;
	}
	
	
	
	
	
}
