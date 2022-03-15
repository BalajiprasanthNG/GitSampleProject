package org.test.project;
	
	import java.io.File;
	import java.time.Duration;
	import java.util.LinkedHashMap;
	import java.util.Map;
	import java.util.concurrent.TimeUnit;

	import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.opera.OperaDriver;
	import org.openqa.selenium.safari.SafariDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {

		public static WebDriver driver;

		// 1. chrome launcher:

		public static WebDriver chromeLaunch() {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			return driver;

		}

		// 2, edge launcher:

		public static WebDriver edgeLaunch() {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			return driver;

		}

		// 3, firefox launcher:

		public static WebDriver firefoxLaunch() {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			return driver;

		}

		// 4, impwait

		public static void impwait(int sec) {

			driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

		}

		// 5,InternetExplorerDriver

		public static WebDriver ieLaunch() {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			return driver;

		}

		// 6,safariLaunch

//		public static WebDriver SafariLaunch() {
//			WebDriverManager.SafariDriver().setup();
//			driver = new SafariDriver();
//			return driver;
//		}

		// 7, operaLaunch

		public static WebDriver OperaLaunch() {

			WebDriverManager.operadriver();

			driver = new OperaDriver();

			return driver;
		}

		// 8 Url launch

		public static void UrlLaunch(String url) {

			driver.get(url);
			driver.manage().window().maximize();

		}

		// 9 Send keys;

		public static void sendKeys(WebElement sk, String data) {

			sk.sendKeys(data);

		}

		// 10 getTittle;

		public static String getTittle() {
			String title = driver.getTitle();

			return title;
		}



		// 11 getText;

		public static void getText(WebElement gt1, String data) {     
			
			gt1.getText();
				
			}



		// 12 getAttribute

		public static String getAttribute(WebElement s) {

			String a = s.getAttribute("value");
			return a;
		}

		// 13simplealert

		public static void SimpleAlert1() {

			Alert alert = driver.switchTo().alert();

			alert.accept();

		}

		// 14.browser launch

		public static void browserLaunch(String browsername) {

			switch (browsername) {

			case "chrome":

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			case "edge":

				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();

			}

		}

		// 15,if condition

		public static void browserLaunchh(String browsername) {

			if (browsername.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			} else if (browsername.equalsIgnoreCase("Edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();

			}
		}

		// 16, drag and drop

		public static void dragAndDrop(WebElement from, WebElement to) {

			Actions a= new Actions(driver);

			a.dragAndDrop(from, to).perform();

		}

		// 17,simple

		public static void simpleAlert() {

			Alert alert = driver.switchTo().alert();
			alert.accept();

		}

		// 18,frames

		public static void switchToFrames(int index) {

			driver.switchTo().frame(index);

		}

		// 19, select by index

		public static void selectByIndex(WebElement e, int index) {
			Select s = new Select(e);
			s.selectByIndex(index);
		}

		// 20, close

		public static void close(String close) {

			driver.close();
		}
		// 21, clear

		public static void clear(String clear, WebElement li) {

			li.clear();
		}

		// 22,equals

		public static void equals(int index) {

			boolean equals = driver.equals(index);
		}

		// 23, screenshot

		public static void screenshot() {

			TakesScreenshot ts = (TakesScreenshot) driver;
			File from = ts.getScreenshotAs(OutputType.FILE);

		}

		// 24,navigation

		public static void Navigation(String url) {

			driver.navigate().to(url);

		}

		// 25, Confirmation alert accept ;
		
		public static void conformationAlert() { 
			
			Alert calert1 = driver.switchTo().alert();    
	    
	    calert1.accept();
	    
		}
		
		
		// 26, Confirmation alert dismiss;  
		
		public static void conformationAlert2() {     
			
			Alert calert2 = driver.switchTo().alert();    
			calert2.dismiss();
			
		}
		
		// 27,getClass
		
	    public static void getClass(WebElement gt1, String data) {     
			
			gt1.getClass();
				
			}
	  
		
		
		// 28 Double Click   
			
			public static void Doubleclick(WebElement from, WebElement to) {     
				
				Actions dc = new Actions(driver);    
				
				dc.doubleClick().perform();  
				
			} 
			
		
			// 29 context Click    
			
			public static void contextclick(WebElement from, WebElement to) {     
				Actions dc = new Actions(driver);     
				dc.contextClick().perform();    
				
			}    
			
			
			
			
			
			// 30 Release   
			
			public static void realse(WebElement from, WebElement to) {     
				
				Actions r = new Actions(driver);    
				
				r.release().perform();     
				}    
			
			
			// 31 Select by index    
			
			public static void SelectByIndex(WebElement i, int index) { 
		    Select s = new Select(i);     
		    s.selectByIndex(index);  
		    
			}   
		
		
		
		
		
		// 32 Select by value    
			public static void SelectByValue(WebElement v, String value) {    
				
				Select s = new Select(v);    
				
				s.selectByValue(value);   
				}
			
			// 33 deSelect by index    
			
			
			public static void deSelectByIndex(WebElement di, int index) {    
				Select s = new Select(di);    
				s.deselectByIndex(index);   
				 
			}
			
			
			// 34 deSelectByvisibletext    
			
			public static void deSelectByvisibletext(WebElement dt, String text) {     
				
				Select s = new Select(dt);     
				
				s.deselectByVisibleText(text);      
			}
			
			
			
			//35 deSelectall    
			
			public static void deSelectall(WebElement dt, String text) {     
				
				Select s = new Select(dt);     
				
				s.deselectAll();   
				
			}
			
			
			// 36 Frames using index    
			
			public static void FramesIndex(int index) {     
				
				driver.switchTo().frame(index);    
			}
			
			
			
			  // 37 Frames using string   
			
			public static void FramesSting(String string) {     
				
				driver.switchTo().frame(string); 
				}   
			
			
			// 38 Frames using WebElement    
			
			public static void FramesWebelement(WebElement WebElement) {     
				
				driver.switchTo().frame(WebElement);   
				}    
			
			
			
			// 39 Frames using WebElement    
			
			public static void FramesParent(WebElement parentFrame) {    
				
				driver.switchTo().parentFrame();  
			}
			
			
			// 40, Frames default    
			
			public static void FramesDefaultContent(WebElement parentFrame) {     
				
				driver.switchTo().defaultContent(); 
			}
			
			
		
	   // 41, FindElement    
			
			public static void FindElement(WebDriver FindElement) {     
				
				driver.findElement((By) FindElement);
				
			}
			
			// 42, FindElements    
			
			public static void FindElements1(WebDriver FindElements) {    
				
				driver.findElements((By) FindElements);
				
			}
			
			// 43, FindElementbyclassname    
			
			public static void Byclassname(String cn) {    
				
				driver.findElement((By.className(cn))); 
				
			}
			
			// 44, FindElementid   
			
			public static void Byid(String id) {     
				
				driver.findElement((By.id(id))); 
				
			}
			
			
			
			// 45,FindElementlinkText   
			
			public static void Bylinktext(String lt) {     
				
				driver.findElement((By.linkText(lt)));
				
			}
			
			
			
			// 46,FindElementname    
			
			public static void Byname(String name) {     
				
				driver.findElement((By.name(name)));
				
			}
			   // 47, FindElementtagname    
			
			public static void Bytagname(String tagname) {     
				
				driver.findElement((By.tagName(tagname)));
				
			}
			
			
			// 48, FindElementxpath    
			
			public static void Byxpath(String tagname) {     
				
				driver.findElement((By.xpath(tagname)));
				
			}
			
			
			
			// 49, FindElemenstbyclassname    
			public static void Byclassnames(String cns) {     
				
				driver.findElements((By.className(cns))); 
				
			}
			
			
			
			// 50, FindElementsid   
			
			public static void Byids(String ids) {     
				driver.findElements((By.id(ids)));  
				
			}
			
			
			
			// 51, FindElemenstlinkText   
			
			public static void Bylinktexts(String lts) {   
				driver.findElements((By.linkText(lts)));       
			}
			
			
			
			// 52, FindElemenstname    
			public static void Bynames(String names) {    
				driver.findElements((By.name(names)));   
			}
			
			
			
			// 53, FindElementstagname    
			
			public static void Bytagnames(String tagnames) {   
				
				driver.findElements((By.tagName(tagnames)));   
			}
			
			
			
			// 54, FindElementxpath   
			
			public static void Byxpaths(String xpaths) {     
				
				driver.findElements((By.xpath(xpaths)));    
			}
			
			
	        // 55, getLocation;
			
			 public static void getLocation(WebElement gl1, String data) {     
					
					gl1.getLocation();
			
			 }
		
			
			//56, getSize
			
			 public static void getSize(WebElement gs1, String data) {     
					
					gs1.getSize();
			
			 }
			 
			 
			 
			 
			 //57,getCssValue
			 
			 public static void getCssValue (WebElement gcs1, String data) {     
					
					gcs1.getCssValue(data);
					
			 }
			
			 //58, getRect
			 
			 public static void getRect (WebElement grt1, String data) {     
					
					grt1.getRect(); 
			 }
			 
			 
			 //59,getClass1
			 
			 public static void getClass1 (WebElement gc, String data) {     
					
					gc.getClass();
			 }
			 
			 
			 //60, submit
			 
			 public static void submit (WebElement sm, String data) {     
					
					sm.submit();
			 }
			
			
			 //61, Click
			 
			 
			 public static void click(WebElement from) {     
					Actions c = new Actions(driver);     
					c.click();
			 }
			 
			 
			
			
			//62, size
	
	public static void size (WebElement sm, String data) {     
		
		sm.getSize();
 }

	}

