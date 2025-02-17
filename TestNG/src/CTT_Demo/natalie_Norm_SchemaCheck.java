package CTT_Demo;

	import java.time.Duration;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Test;

	public class natalie_Norm_SchemaCheck {
		private static String iframe;
		public static String screenShotSubFoderName;
		public static WebDriver driver;
		private WebElement abcd;
		@BeforeSuite
		public void appLaunch() throws InterruptedException {
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Abhijit.Jadhav\\Downloads\\chromedriver-win64\\chromedriver.exe");
			 driver = (WebDriver) new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				
		}
		 
			
		@Test(priority = 1)
		public void CTT_Login_Page_Displayed_And_Enters_Login_Details() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			driver.get("https://development.d36z6oo50ky8dh.amplifyapp.com/login");
			Thread.sleep(1000);
	        // Wait until the title matches the expected title
	        wait.until(ExpectedConditions.titleIs("Content Transformation Tool"));

	        // Get the title of the page
	        String title = driver.getTitle();

	        // Verify that the title matches the expected title
	        Assert.assertEquals(title, "Content Transformation Tool");

	        // Print the title
	        System.out.println(title);
			
			// Find and fill the username field
	        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
	        usernameField.sendKeys("aarushp123098@gmail.com");

	        // Find and fill the password field
	        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
	        passwordField.sendKeys("OLOtx095");

	        // Find and click the login button
	        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='button']")));
	        loginButton.click();
	        Thread.sleep(6000);
	    }
		@Test(priority = 2)
		public void Verify_Login_Person_Name() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='MuiTypography-root MuiTypography-subtitle2 MuiTypography-noWrap css-1dqgwp4'])[1]")));
			String displayName = element.getText();
			System.out.println("Login Person Name: " + displayName);
			Thread.sleep(1000);
		}
		@Test(priority = 3)
		public void open_Assigne_node() throws InterruptedException {
			
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));

			WebElement parentDiv11w11 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='panel1bh-header']")));
			// Find the specific project name within the parent div class
			WebElement project11e = wait.until(ExpectedConditions.visibilityOf(parentDiv11w11.findElement(By.xpath("(//button[contains(text(),'NewProjectTset')])[2]"))));
			Thread.sleep(1000);
			// Click on the drop down
			WebElement assignUserButton11e = wait.until(ExpectedConditions.elementToBeClickable(project11e.findElement(By.xpath("following::div[@class='MuiAccordionSummary-expandIconWrapper css-1fx8m19']"))));
			assignUserButton11e.click();
			Thread.sleep(1000);
			// Find the specific node (e.g., "Diagnostics & Calibration Systems") within the dropdown
			List<WebElement> nodes = driver.findElements(By.xpath("//*[contains(text(),'Switches')]"));
			Thread.sleep(1000);
			for (WebElement node : nodes) {
			    // Check if the node text matches the desired node name
			    if (node.getText().equalsIgnoreCase("Switches")) {
			        // Click on the node
			        node.click();
			        break; // Exit the loop after clicking on the node
			    }
			}
			Thread.sleep(2000);
		}
		
		@Test(priority = 4)
		public void Verify_The_SKu_Schema_Page_open_Or_Not() throws InterruptedException {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
				// Right-click on root node
				WebElement iframe1 = driver.findElement(By.xpath("(//iframe[@id='iframeD3'])[1]"));
				// Switch to the iframe
				driver.switchTo().frame(iframe1);
				Thread.sleep(7000);
				//Visible buttons checked on VIZ tool screen
				//click on the  pop button on header and Verify aatribuite
				// Click on the infoPop button
				WebElement rootnode112 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Switches')])[2]")));
				WebElement infoPopButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='infoPop']")));
				infoPopButton.click();
				Thread.sleep(4000);
				// Wait for the node to be visible and then perform mouse hover action
				WebElement rootnode11 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Switches')])[2]")));
				Actions actions1s = new Actions(driver);
				actions1s.moveToElement(rootnode11).perform();
				Thread.sleep(2000);
				// Wait for the SKU count element to be visible and get its text
				WebElement swicthes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='barchart']/div[1]")));
				String text = swicthes.getText();
				System.out.println(text);

	}			
		@Test(priority = 5)
		public void Verify_The_Double_Space_in_Attribute_Name() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[2]")));
			skuname.click();
			//Edit Schema Name
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("Product  Series");
			Thread.sleep(1000);
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)"); // Scroll up by 200 pixels
			Thread.sleep(1000); // Optional: Add a brief delay after scrolling
			// Or scroll down by 200 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000); // Optional: Add a brief delay after scrolling
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			// Click on the save button
			saveButton.click();
			Thread.sleep(1000); // Optional: Add delay if needed after clicking the button
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[15]")));
			Thread.sleep(1000);
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);
			
			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n" +textc);
			Thread.sleep(1000);
			
			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);
			
	}	
		@Test(priority = 6)
		public void Verify_The_Double_Space_in_LOV_Values() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("Product Series");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
			lov.sendKeys("A  B  C.");
			Thread.sleep(1000);
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(2000);
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[15]")));
			Thread.sleep(1000);
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);

			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);

			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);

	}	
		@Test(priority = 7)
		public void Verify_The_Trailing_OR_Leading_Space_in_Attribute_Name() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("  Product Series  ");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
			//lov.sendKeys("A  B  C.");
			Thread.sleep(1000);
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[15]")));
			Thread.sleep(1000);
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);

			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);

			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);

	}	
		@Test(priority = 8)
		public void Verify_The_Trailing_OR_Leading_Space_in_Lov_Values() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("Product Series");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
			lov.sendKeys("   A B C.  ");
			Thread.sleep(1000);
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[15]")));
			Thread.sleep(1000);
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);

			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);

			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);

	}	
		@Test(priority = 9)
		public void Verify_The_Characters_in_Attribute_Name_regx() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("Product Series [^a-zA-Z\\- ] ");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
			//lov.sendKeys("A B C.");
			Thread.sleep(1000);
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[15]")));
			Thread.sleep(1000);
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);

			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);

			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);

	}	
		@Test(priority = 10)
		public void Verify_The_Title_Case_Check_in_Attribute_Name() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("product series");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
			//lov.sendKeys("A B C.");
			Thread.sleep(1000);
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[15]")));
			Thread.sleep(1000);
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);

			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);

			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);

	}	
		@Test(priority = 11)
		public void Verify_The_Title_Case_Check_in_LOV_Values() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("Product Series");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
			lov.sendKeys("abC.dfg.");
			Thread.sleep(1000);
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[15]")));
			Thread.sleep(1000);
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);

			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);

			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);

	}	
		@Test(priority = 12)
		public void Verify_The_Unwanted_Capitalization_in_Attribute_Names() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("PrODuCt SeRiEs");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
		//	lov.sendKeys("abC.dfg.");
			Thread.sleep(1000);
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[15]")));
			Thread.sleep(1000);
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);

			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);

			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);

	}
		
		@Test(priority = 13)
		public void Verify_The_Unwanted_Capitalization_in_LOV_Values() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("Product Series");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
			lov.sendKeys("CoLOr");
			Thread.sleep(1000);
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[15]")));
			Thread.sleep(1000);
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);

			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);

			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);

	}
		@Test(priority = 14)
		public void Verify_The_Sample_Values_and_LOV_Contradictions() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("Product Series");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
			lov.sendKeys("ABC.");
			Thread.sleep(1000);
			//Enter sample Value
			WebElement sampleValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Sample']"));
			sampleValue.clear();
			sampleValue.sendKeys("ABC");
			Thread.sleep(1000);
			
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[15]")));
			Thread.sleep(1000);
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);

			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);

			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);

	}
		@Test(priority = 15)
		public void Verify_The_SampleValues_and_UOM_Delimiter_Check_Lovs_as_well() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("Product Series");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
			lov.sendKeys("ABC;");
			Thread.sleep(1000);
			//Enter sample Value
			WebElement sampleValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Sample']"));
			sampleValue.clear();
			sampleValue.sendKeys("ABC;");
			Thread.sleep(1000);
			//Enter Uom Value
			WebElement uomValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='UoM']"));
			uomValue.clear();
			uomValue.sendKeys("ABC;");
			Thread.sleep(1000);
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[15]")));
			Thread.sleep(1000);
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);

			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);

			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);

	}
		
		@Test(priority = 16)
		public void Verify_The_Three_Sample_Values() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("Product Series");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
		//	lov.sendKeys("ABC;");
			Thread.sleep(1000);
			//Enter sample Value
			WebElement sampleValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Sample']"));
			sampleValue.clear();
			sampleValue.sendKeys("ABC. XYZ.");
			Thread.sleep(1000);
			//Enter Uom Value
			WebElement uomValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='UoM']"));
			uomValue.clear();
		//uomValue.sendKeys("ABC;");
			Thread.sleep(1000);
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[15]")));
			Thread.sleep(1000);
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);

			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);

			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);
	}
		
		@Test(priority = 17)
		public void Verify_The_Duplicate_priority_First_Priority_set() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[4]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("Product Series");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "priority" element and enter the value
			WebElement AttPriority = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='AttPriority']"));
			AttPriority.clear();
			AttPriority.sendKeys("1200");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
//			lov.sendKeys("ABC;");
			Thread.sleep(1000);
			//Enter sample Value
			WebElement sampleValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Sample']"));
			sampleValue.clear();
			//sampleValue.sendKeys("ABC. XYZ.");
			Thread.sleep(1000);
			//Enter Uom Value
			WebElement uomValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='UoM']"));
			uomValue.clear();
			//uomValue.sendKeys("ABC;");
			Thread.sleep(1000);
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[1]/td[15]")));
			Thread.sleep(1000);
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);

			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);

			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);

	}
		@Test(priority = 18)
		public void Verify_The_Duplicate_priority_SecondPriority_Set() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[5]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("Model Number");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "priority" element and enter the value
			WebElement AttPriority = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='AttPriority']"));
			AttPriority.clear();
			AttPriority.sendKeys("1200");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
			//lov.sendKeys("ABC;");
			Thread.sleep(1000);
			//Enter sample Value
			WebElement sampleValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Sample']"));
			sampleValue.clear();
		  //sampleValue.sendKeys("ABC. XYZ.");
			Thread.sleep(1000);
			//Enter Uom Value
			WebElement uomValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='UoM']"));
			uomValue.clear();
			uomValue.sendKeys("ABC;");
			Thread.sleep(1000);
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[2]/td[15]")));
			Thread.sleep(1000);
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
		
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);

			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);

			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);
	}
		
		@Test(priority = 19)
		public void Verify_The_Missing_Priority() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[2]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("Test Model Number");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "Priority" element and enter the value
			WebElement AttPriority = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='AttPriority']"));
			AttPriority.clear();
			AttPriority.sendKeys("");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
//			lov.sendKeys("ABC;");
			Thread.sleep(1000);
			//Enter sample Value
			WebElement sampleValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Sample']"));
			sampleValue.clear();
//			sampleValue.sendKeys("ABC. XYZ.");
			Thread.sleep(1000);
			//Enter Uom Value
			WebElement uomValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='UoM']"));
			uomValue.clear();
//			uomValue.sendKeys("ABC;");
			Thread.sleep(1000);
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[22]/td[15]")));
			Thread.sleep(1000);
			
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);		
			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);
			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);
	}	
		@Test(priority = 20)
		public void Verify_The_Attribute_Name_Hex_Check_Set_firstATTName() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[1]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("Anti-Static");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "Priority" element and enter the value
			WebElement AttPriority = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='AttPriority']"));
//			AttPriority.clear();
			//AttPriority.sendKeys("");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
			//lov.sendKeys("ABC;");
			Thread.sleep(1000);
			//Enter sample Value
			WebElement sampleValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Sample']"));
			sampleValue.clear();
			//sampleValue.sendKeys("ABC. XYZ.");
			Thread.sleep(1000);
			//Enter Uom Value
			WebElement uomValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='UoM']"));
			uomValue.clear();
			//uomValue.sendKeys("ABC;");
			Thread.sleep(1000);
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[1]/td[15]")));
			Thread.sleep(1000);
			
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);		
			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);
			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);
	}	
		
		@Test(priority = 21)
		public void Verify_The_Attribute_Name_Hex_Check_Set_secondATTName() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[2]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("Anti Static");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "Priority" element and enter the value
			WebElement AttPriority = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='AttPriority']"));
//			AttPriority.clear();
			//AttPriority.sendKeys("");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
			//lov.sendKeys("ABC;");
			Thread.sleep(1000);
			//Enter sample Value
			WebElement sampleValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Sample']"));
			sampleValue.clear();
			//sampleValue.sendKeys("ABC. XYZ.");
			Thread.sleep(1000);
			//Enter Uom Value
			WebElement uomValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='UoM']"));
			uomValue.clear();
			//uomValue.sendKeys("ABC;");
			Thread.sleep(1000);
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[2]/td[15]")));
			Thread.sleep(1000);
			
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);		
			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);
			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);
	}	
		
		@Test(priority = 22)
		public void Verify_The_Attribute_Name_Hex_Check_Set_FirstLOV() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[1]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("Product Series");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "Priority" element and enter the value
			WebElement AttPriority = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='AttPriority']"));
//			AttPriority.clear();
			//AttPriority.sendKeys("");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
			lov.sendKeys("Water Resistant");
			Thread.sleep(1000);
			//Enter sample Value
			WebElement sampleValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Sample']"));
			sampleValue.clear();
			//sampleValue.sendKeys("ABC. XYZ.");
			Thread.sleep(1000);
			//Enter Uom Value
			WebElement uomValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='UoM']"));
			uomValue.clear();
			//uomValue.sendKeys("ABC;");
			Thread.sleep(1000);
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[1]/td[15]")));
			Thread.sleep(1000);
			
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);		
			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);
			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);
	}	
		@Test(priority = 23)
		public void Verify_The_Attribute_Name_Hex_Check_Set_secondLOV() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[2]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("Product Testabc");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "Priority" element and enter the value
			WebElement AttPriority = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='AttPriority']"));
//			AttPriority.clear();
			//AttPriority.sendKeys("");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
			lov.sendKeys("Water-Resistant");
			Thread.sleep(1000);
			//Enter sample Value
			WebElement sampleValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Sample']"));
			sampleValue.clear();
			//sampleValue.sendKeys("ABC. XYZ.");
			Thread.sleep(1000);
			//Enter Uom Value
			WebElement uomValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='UoM']"));
			uomValue.clear();
			//uomValue.sendKeys("ABC;");
			Thread.sleep(1000);
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[2]/td[15]")));
			Thread.sleep(1000);
			
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);		
			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);
			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);
	}	
		
		@Test(priority = 24)
		public void Verify_The_Definitions_without_Terminal_Punctuation() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[1]/td[2]")));
			skuname.click();
			//Edit Schema Name
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("Product Testbrand");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)"); // Scroll up by 200 pixels
			Thread.sleep(1000); // Optional: Add a brief delay after scrolling
			// Or scroll down by 200 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			//def
			WebElement def = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='Def'])[1]")));
			def.clear();
			def.sendKeys("Product Testabcd Data Testing:;");
			Thread.sleep(1000);
			//clear sample value
			WebElement sampleValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Sample']"));
			sampleValue.clear();
			Thread.sleep(1000);
			//save
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)"); // Scroll up by 200 pixels
			Thread.sleep(1000); // Optional: Add a brief delay after scrolling
			// Or scroll down by 200 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000); // Optional: Add a brief delay after scrolling
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			// Click on the save button
			saveButton.click();
			Thread.sleep(1000); // Optional: Add delay if needed after clicking the button
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[1]/td[15]")));
			Thread.sleep(1000);
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);
			
			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);
			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);

	}	
		@Test(priority = 25)
		public void Verify_The_Same_Definition_Different_Attribute_Name() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[2]/td[2]")));
			skuname.click();
			//Edit Schema Name
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("Product Brandtestasd");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)"); // Scroll up by 200 pixels
			Thread.sleep(1000); // Optional: Add a brief delay after scrolling
			// Or scroll down by 200 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			//def
			WebElement def = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='Def'])[1]")));
			def.clear();
			def.sendKeys("Product Testabcd Data Testing:;");
			Thread.sleep(1000);
			//clear sample value
			WebElement sampleValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Sample']"));
			sampleValue.clear();
			Thread.sleep(1000);
			//save
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)"); // Scroll up by 200 pixels
			Thread.sleep(1000); // Optional: Add a brief delay after scrolling
			// Or scroll down by 200 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000); // Optional: Add a brief delay after scrolling
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			// Click on the save button
			saveButton.click();
			Thread.sleep(1000); // Optional: Add delay if needed after clicking the button
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[2]/td[15]")));
			Thread.sleep(1000);
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);
			
			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);
			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);

	}	
		
		@Test(priority = 26)
		public void Verify_The_Sample_Values_Require_Leading_Zero() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[3]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
			editSchemaName.clear();
			editSchemaName.sendKeys("Product Brand");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "Priority" element and enter the value
			WebElement AttPriority = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='AttPriority']"));
			//AttPriority.clear();
			//AttPriority.sendKeys("");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
			//lov.sendKeys("Water-Resistant");
			Thread.sleep(1000);
			//Enter sample Value
			WebElement sampleValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Sample']"));
			sampleValue.clear();
			sampleValue.sendKeys(".25; .70; .35");
			Thread.sleep(1000);
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[3]/td[15]")));
			Thread.sleep(1000);
			
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);		
			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);
			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);
			
	}
		//*******SKU Data Review- Schema checks (hard) #1**********//
		@Test(priority = 27)
		public void Verify_The_Blank_Meta_Attribute_Check() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[1]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
//			editSchemaName.clear();
//			editSchemaName.sendKeys("Product Brand");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "Priority" element and enter the value
			WebElement AttPriority = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='AttPriority']"));
			//AttPriority.clear();
			//AttPriority.sendKeys("");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
			lov.sendKeys("Water-Resistant");
			Thread.sleep(1000);
			//Enter sample Value
			WebElement sampleValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Sample']"));
			sampleValue.clear();
//			sampleValue.sendKeys(".25; .70; .35");
			Thread.sleep(1000);
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[1]/td[15]")));
			Thread.sleep(1000);
			
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);		
			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);
			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);
				
	}
		@Test(priority = 28)
		public void Verify_The_LOV_Datatype_Missing_LOV() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[1]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
//			editSchemaName.clear();
//			editSchemaName.sendKeys("Product Brand");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "Priority" element and enter the value
			WebElement AttPriority = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='AttPriority']"));
			//AttPriority.clear();
			//AttPriority.sendKeys("");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
			//lov.sendKeys("Water-Resistant");
			Thread.sleep(1000);
			//Enter sample Value
			WebElement sampleValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Sample']"));
			sampleValue.clear();
//			sampleValue.sendKeys("Test");
			Thread.sleep(1000);
			//Enter Uom Value
			WebElement uomValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='UoM']"));
			uomValue.clear();
		////Select data type
		WebElement datatype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='pimdatatypeselect']")));
		datatype.click();
		Thread.sleep(1000);
		// Select drop down numeric option
		WebElement selectATT = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[contains(text(), 'LOV')]")));
		selectATT.click();
		Thread.sleep(1000);
			
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[1]/td[15]")));
			Thread.sleep(1000);
			
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);		
			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);
			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);
			
	}
		@Test(priority = 29)
		public void Verify_The_DataType_Number_with_Text_Sample_Values() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[1]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
//			editSchemaName.clear();
//			editSchemaName.sendKeys("Product Brand");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "Priority" element and enter the value
			WebElement AttPriority = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='AttPriority']"));
			//AttPriority.clear();
			//AttPriority.sendKeys("");
			Thread.sleep(1000);
			//Enter sample Value
			WebElement sampleValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Sample']"));
			sampleValue.clear();
			sampleValue.sendKeys("TestABC");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
//			lov.sendKeys("ABCD");
			Thread.sleep(1000);
			WebElement DefValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Def']"));
            DefValue.clear();
//            DefValue.sendKeys("ABC");
            Thread.sleep(1000);
            ////Select data type
			WebElement datatype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='pimdatatypeselect']")));
			datatype.click();
			Thread.sleep(2000);
			//Select drop down numeric option
			WebElement selectATT = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[contains(text(), 'Numeric')]")));
			selectATT.click();
			Thread.sleep(2000);
			
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[1]/td[15]")));
			Thread.sleep(1000);
			
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);		
			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);
			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);
			
	}
		@Test(priority = 30)
		public void Verify_The_DataType_Text_with_Numeric_Sample_Values() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[1]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
//			editSchemaName.clear();
//			editSchemaName.sendKeys("Product Brand");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "Priority" element and enter the value
			WebElement AttPriority = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='AttPriority']"));
			//AttPriority.clear();
			//AttPriority.sendKeys("");
			Thread.sleep(1000);
			//Enter sample Value
			WebElement sampleValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Sample']"));
			sampleValue.clear();
			sampleValue.sendKeys("12345");
			Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
//			lov.sendKeys("ABCD");
			Thread.sleep(1000);
			WebElement DefValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Def']"));
            DefValue.clear();
//            DefValue.sendKeys("ABC");
            Thread.sleep(1000);
            ////Select data type
			WebElement datatype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='pimdatatypeselect']")));
			datatype.click();
			Thread.sleep(2000);
			//Select drop down numeric option
			WebElement selectATT = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[contains(text(), 'String')]")));
			selectATT.click();
			Thread.sleep(2000);
			
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[1]/td[15]")));
			Thread.sleep(1000);
			
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);		
			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);
			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);
			
	}
		@Test(priority = 31)
		public void Verify_The_Missing_UOM() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[1]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
//			editSchemaName.clear();
//			editSchemaName.sendKeys("Product Brand");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "Priority" element and enter the value
			WebElement AttPriority = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='AttPriority']"));
			//AttPriority.clear();
			//AttPriority.sendKeys("");
			Thread.sleep(1000);
			//Enter sample Value
			WebElement sampleValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Sample']"));
			sampleValue.clear();
//			sampleValue.sendKeys("12345");
			Thread.sleep(1000);
			//def value
			WebElement DefValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Def']"));
            DefValue.clear();
//            DefValue.sendKeys("ABC");
            Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
//			lov.sendKeys("ABCD");
			Thread.sleep(1000);
			//Uom
			WebElement uom = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='UoM']"));
            uom.clear();
//            DefValue.sendKeys("ABC");
            Thread.sleep(1000);
			
            ////Select data type
			WebElement datatype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='pimdatatypeselect']")));
			datatype.click();
			Thread.sleep(2000);
			//Select drop down numeric option
			WebElement selectATT = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[contains(text(), 'Numeric - UOM')]")));
			selectATT.click();
			Thread.sleep(2000);
			
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[1]/td[15]")));
			Thread.sleep(1000);
			
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);		
			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);
			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);
			
	}
		@Test(priority = 32)
		public void Verify_The_LOV_Usage_Check() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			// Find the table container element
			WebElement tableContainer = driver.findElement(By.xpath("//*[@id='tablecontainer']"));
			// Scroll the table container horizontally to position 500 (adjust as needed)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 500;", tableContainer);
			Thread.sleep(1000);
			// Wait for the SKU name element to be visible
			WebElement skuname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[1]/td[2]")));
			skuname.click();
			Thread.sleep(1000);
			WebElement editSchemaName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='EditSchemaName'])[1]")));
//			editSchemaName.clear();
//			editSchemaName.sendKeys("Product Brand");
			Thread.sleep(1000);
			// Scroll the page up by 400 pixels
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
			// Find the "Priority" element and enter the value
			WebElement AttPriority = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='AttPriority']"));
			//AttPriority.clear();
			//AttPriority.sendKeys("");
			Thread.sleep(1000);
			//Enter sample Value
			WebElement sampleValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Sample']"));
			sampleValue.clear();
			sampleValue.sendKeys("Test");
			Thread.sleep(1000);
			//def value
			WebElement DefValue = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='Def']"));
            DefValue.clear();
//            DefValue.sendKeys("ABC");
            Thread.sleep(1000);
			// Find the "LOV" element and enter the value
			WebElement lov = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='LOV']"));
			lov.clear();
//			lov.sendKeys("ABCD");
			Thread.sleep(1000);
			//Uom
			WebElement uom = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='UoM']"));
            uom.clear();
//            DefValue.sendKeys("ABC");
            Thread.sleep(1000);
			
            ////Select data type
			WebElement datatype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='EditAttributeNodeForm']//*[@id='pimdatatypeselect']")));
			datatype.click();
			Thread.sleep(2000);
			//Select drop down numeric option
			WebElement selectATT = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[contains(text(), 'String')]")));
			selectATT.click();
			Thread.sleep(2000);
			
			// Find and scroll the save button into view without changing the table position
			WebElement saveButton = driver.findElement(By.xpath("//*[@id='EditAttributeNodeForm']//a[@class='button success' and contains(text(), 'Save')]"));
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -100)");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 100)");
			Thread.sleep(1000);
			// Wait for the save button to be clickable
			saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
			saveButton.click();
			Thread.sleep(1000);
			
			// Scroll horizontally to the right until the end of the table
			((JavascriptExecutor) driver).executeScript("document.getElementById('tablecontainer').scrollLeft = document.getElementById('tablecontainer').scrollWidth");
			Thread.sleep(1000);
			
			// Wait for the error message element to be visible
			WebElement querrormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tablecontainer']/table/tbody/tr[1]/td[15]")));
			Thread.sleep(1000);
			
			// Scroll the error message element into view without changing the table position
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(false);", querrormsg);
			Thread.sleep(1000);
			// *****Find the table element by its ID scroll slowly
			WebElement table = driver.findElement(By.id("tablecontainer"));
			// Get the width of the table
			int tableWidth = table.getSize().getWidth();
			// Set the initial scroll position to 0
			int scrollPosition = 0;
			// Define the scroll step (adjust as needed for the desired scrolling speed)
			int scrollStep = 20;
			// Scroll slowly from left to right
			while (scrollPosition < tableWidth) {
				// Execute JavaScript to scroll the table horizontally
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = " + scrollPosition + ";", table);
				// Wait for a brief moment to see the scrolling effect (adjust sleep time as
				// needed)
				Thread.sleep(100);
				// Increment the scroll position by the scroll step
				scrollPosition += scrollStep;
			}
			Thread.sleep(1000);		
			// Print the text of the error message
			String textc = querrormsg.getText();
			System.out.println("\n"+textc);
			Thread.sleep(1000);
			// Scroll back to the initial position (optional)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", table);
			Thread.sleep(1000);
//			close tab
			WebElement closetab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='closeicon']/img")));
			closetab.click();
			Thread.sleep(1000);
			// Switch back to the default content (main page)
			driver.switchTo().defaultContent();
		 // Click on home page
			WebElement homeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Home'][1]")));
			homeButton.click();
			Thread.sleep(2000);
			
	}
		
		@AfterSuite
	    public void closeBrowser() {
	        // Close the WebDriver instance
	        driver.quit();
		}
}

