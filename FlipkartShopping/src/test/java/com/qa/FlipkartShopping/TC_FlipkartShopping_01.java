package com.qa.FlipkartShopping;
import java.io.IOException;
import java.util.Iterator;
import com.qa.Utility.Excel;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Utility.Excel;

public class TC_FlipkartShopping_01 extends BaseTest {
	
	@Test(priority=1,dataProvider="getData")
	public void FlipkartShopping(String username,String password,String item) throws InterruptedException, IOException
	{
		
		
		Page.getUsername().sendKeys(username);
		Page.getPassword().sendKeys(password);
		Page.GetLogin().click();
		Thread.sleep(3000);
		Page.SearchItem().sendKeys(item);
		Thread.sleep(3000);

		Page.SearchItem().sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		Page.SelectItem().click();
		Set<String> windowHandle= driver.getWindowHandles();
		
		String h=null;
		for(String s:windowHandle)
		{
			System.out.println(s);
			h=s;
		}
		System.out.println(h);
		driver.switchTo().window(h);

			Page.BuyNow().click();
			CaptureScreenshot(driver,"FlipkartShopping");
	}
			@DataProvider
			public String[][] getData() throws Exception
			{
				String Xlpath ="C:\\Users\\user\\OneDrive\\Desktop\\FlipkartShopping.xlsx";
				String Xpath="Sheet1";
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

