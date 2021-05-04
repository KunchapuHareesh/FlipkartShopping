package com.qa.FlipkartShopping;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Utility.Excel;

public class FlipkartShoppingInvalidData extends BaseTest {
	@Test(priority=1,dataProvider="getData")
	public void FlipkartShopping(String username,String password,String item) throws InterruptedException, IOException
	{
		
		
		Page.getUsername().sendKeys(username);
		Page.getPassword().sendKeys(password);
		Page.GetLogin().click();
		Thread.sleep(3000);
		CaptureScreenshot(driver,"FlipkartShoppingInvalidData");
		Assert.assertTrue(Page.GetVerification().getText().equalsIgnoreCase("Hareesh"));
		Page.SearchItem().sendKeys("Redmi 11x");;
		
	}

		
		@DataProvider
		public String[][] getData() throws Exception
		{
			String Xlpath ="C:\\Users\\user\\OneDrive\\Desktop\\FlipkartShopping.xlsx";
			String Xpath="Sheet2";
			int rowCount=Excel.GetRowCount(Xlpath, Xpath);
			int columnCount =Excel.GetCellCount(Xlpath, Xpath, rowCount);
			String [][] data = new String[rowCount][columnCount];
			for (int i = 1; i <= rowCount; i++) 
			{
				for (int j = 0; j < columnCount; j++) 
				{
					data[i-1][j]=Excel.GetCallData(Xlpath, Xpath, i, j);
					
				}
				
			}
			return data;
		}
		

}
