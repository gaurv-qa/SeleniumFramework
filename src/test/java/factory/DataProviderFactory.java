package factory;

import dataProvider.ConfigDataProvider;
import dataProvider.ExceldataProvider;

public class DataProviderFactory 
{
	public static ConfigDataProvider getConfig()
	{
		ConfigDataProvider config = new ConfigDataProvider();
		return config;
		
	}
	
	public static ExceldataProvider getExcel()
	{
		ExceldataProvider excel = new ExceldataProvider();
		return excel;
		
	}
}

