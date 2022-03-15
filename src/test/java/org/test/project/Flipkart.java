package org.test.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.list;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart extends BaseClass {

	@BeforeClass
	public static void BeforeClass() throws Exception {
		chromeLaunch();
		UrlLaunch("https://www.flipkart.com/");
		impwait(10);

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws AWTException {
		loginpageflipkart l = new loginpageflipkart();
		l.getProducttext().sendKeys("samsung s22 ultra");

		Robot a = new Robot();
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		impwait(10);
	}

	@Test
	public void test2() throws AWTException {

		List<WebElement> lb = driver.findElements(By.xpath("//div[@class='_4rR01T']"));

		WebElement phonelist;

		for (int i = 0; i < lb.size(); i++) {
			phonelist = lb.get(i);
			System.out.println(phonelist.getText());
			impwait(10);

		}
		System.out.println("-------------------------pricelist--------------------------------");

	}

	@Test
	public void test3() throws AWTException {

		List<WebElement> lb1 = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

		WebElement pricelist;

		for (int i = 0; i < lb1.size(); i++) {
			pricelist = lb1.get(i);
			System.out.println(pricelist.getText());
			impwait(10);
		}

	}

	@Test
	public void test4() throws AWTException {
		loginpageflipkart l = new loginpageflipkart();
		l.getHightolow();
		
		Robot a = new Robot();
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		l.getHighest().getText();
		System.out.println("highest price is = rs " + l.getHighest().getText());
		impwait(10);
	}

	@Test
	public void test5() throws AWTException {
		loginpageflipkart l = new loginpageflipkart();
		l.getLowtohigh();
		
		Robot a = new Robot();
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		l.getLowestprice().getText();
		System.out.println("lowset price is = rs " + l.getHighest().getText());
		impwait(10);
	}

}