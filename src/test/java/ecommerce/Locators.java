package ecommerce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locators extends BaseClass {

	@Test(priority = 1)
	public void test1() {
		System.out.println("Get title of the webpage:" + driver.getTitle());
		System.out.println("Get Current Url of the page:" + driver.getCurrentUrl());

	}

	@Test(enabled = false)
	public void locator() {
		WebElement name_Locator_search = driver.findElement(By.name("q"));
		WebElement ID_Locator = driver.findElement(By.id(""));
		WebElement className_locator = driver.findElement(By.className("Pke_EE"));
		List<WebElement> tagname_locator = driver.findElements(By.tagName("a"));
		WebElement xpath_locator = driver.findElement(By.xpath("//*[text()='Mobiles']"));
		WebElement lintext_locator = driver.findElement(By.linkText(""));
		WebElement partialLinktext = driver.findElement(By.partialLinkText(""));

		System.out.println("search text" + name_Locator_search.getAttribute("placeholder"));
	}

}
