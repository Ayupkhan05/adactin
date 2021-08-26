package org.main;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.utils.BaseClass;

public class Dummy extends BaseClass {

	@Test
	private void testCase3() {
		WebElement table = driver.findElement(By.xpath("//form[@method='post']"));
		
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		for (int i = 0; i < allRows.size(); i++) {
			WebElement iterateOneByOne = allRows.get(i);
		
			List<WebElement> allTdDatas = iterateOneByOne.findElements(By.tagName("td"));
			
			for (int j = 0; j < allTdDatas.size(); j++) {
				
				WebElement datas = allTdDatas.get(j);
				
				String text = datas.getText();
				
				System.out.println(text);
			}	
			
		}
	
}}