
package jmv;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DEmoaTest {
	private static String iframe;

	public static void main(String args[]) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		try {
			// Navigate to the URL
			driver.get("https://development.d36z6oo50ky8dh.amplifyapp.com/login");
			Thread.sleep(8000);
			driver.manage().window().maximize();

			// Print the title of the current page
			System.out.println("Page title: " + driver.getTitle());
			Thread.sleep(4000);
			driver.findElement(By.id("username")).sendKeys("aarushp123098@gmail.com");// Enter Gmail
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#password")).sendKeys("OLOtx095");// Password
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[type='button']")).click();// Login
			Thread.sleep(2000);
			Thread.sleep(8000);
//             

//             //click on  users tab
             WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
//             WebElement myElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[normalize-space()='Users'])[1]")));
//             myElement.click();
//             Thread.sleep(8000);
//             List<WebElement> usertable = driver.findElements(By.xpath("//div[@class=\"ReactVirtualized__Table__row\"]"));
////             for(WebElement e1 : usertable) {System.out.println(e1.getText());}
//             for (int i = 0; i < usertable.size(); i++) {
//            	    WebElement e1 = usertable.get(i);
//            	    Thread.sleep(3000);
//            	    if (e1.getText().trim().equalsIgnoreCase("as@gmail.com")) {
//            	        // Click on the delete button
//            	        driver.findElement(By.xpath("(//button[@aria-label='Delete User'])")).click();
//            	        System.out.println("Deleting as@gmail.com");
//            	    }
//            	    System.out.println(e1.getText());
//            	}

			// Create User Home page
			String UserName = "Aaatest123";
			// Click on the user tab
			driver.findElement(By.xpath("(//button[normalize-space()='Users'])[1]")).click();
			Thread.sleep(3000);
			// Click on the create users
			driver.findElement(By.xpath("(//button[normalize-space()='Create User'])[1]")).click();
			Thread.sleep(3000);
			// Create user window displayed
			driver.findElement(By.xpath("(//h2[normalize-space()='Create User'])[1]")).isDisplayed();
			Thread.sleep(2000);
			// Enter Name
			driver.findElement(By.xpath("(//input[@id='FullNamecreate-user'])[1]")).sendKeys(UserName);
			Thread.sleep(2000);
			// Enter email
			driver.findElement(By.xpath("(//input[@id='EmailAddresscreate-user'])[1]"))
					.sendKeys("Aaatest123@pivotree.com");
			Thread.sleep(2000);
			// Click on admin
			driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
			Thread.sleep(3000);
			// Click on the save
			driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
			Thread.sleep(4000);
			// Verify pop-up message
			WebElement elemento = driver
					.findElement(By.xpath("//div[contains(text(),'user_created_successfully')][1]"));
			String textcc = elemento.getText();
			System.out.println(textcc);
			Thread.sleep(8000);

			// Email verified.
			Thread.sleep(1000);
			WebElement emailElement = driver
					.findElement(By.xpath("(//div[@class='ReactVirtualized__Grid__innerScrollContainer'])[1]"));
			Thread.sleep(1000);
			// Check if the email element is displayed
			if (emailElement.isDisplayed()) {
				System.out.println("Email verified: Aaatest123@pivotree.com");
			} else {
				System.out.println("Email verification failed. Email not found: DEAutoA121@pivotree.com");
			}
			Thread.sleep(1000);

			// Click on the same email row 1 modified user
			// Locate the parent div class that contains all the project email
			WebElement parentDiv11w = driver
					.findElement(By.xpath("(//div[@class='ReactVirtualized__Grid__innerScrollContainer'])[1]"));
			Thread.sleep(2000);
			// Find the specific project email name within the parent div class
			WebElement project11w = parentDiv11w.findElement(By.xpath("(//div[@aria-label='row'])[1]"));
			Thread.sleep(2000);

			// modified user
			WebElement assignUserButton11n = project11w
					.findElement(By.xpath("(//button[@aria-label='Modify User'])[1]"));
			// Click on the modified button
			assignUserButton11n.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
			Thread.sleep(1000);
			// click on the save
			driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
			Thread.sleep(2000);
			// Verified message Modified sucessfully
			WebElement elemento1 = driver
					.findElement(By.xpath("//div[contains(text(),'user_modified_successfully')][1]"));
			String textcc1 = elemento1.getText();
			System.out.println(textcc1);
			Thread.sleep(6000);

			// Delete user for the user group
			// Locate the parent div class that contains all the project email
			WebElement parentDiv11w1 = driver
					.findElement(By.xpath("(//div[@class='ReactVirtualized__Grid__innerScrollContainer'])[1]"));
			Thread.sleep(2000);
			// Find the specific project email name within the parent div class
			WebElement project11w1 = parentDiv11w1.findElement(By.xpath("(//div[@aria-label='row'])[1]"));
			Thread.sleep(2000);
            // Click on the delete button
			WebElement assignUserButton11a1 = project11w1.findElement(By.xpath(
					"//div[@aria-label='grid']//div[@role='rowgroup']//div[1]//div[5]//td[1]//button[2]//*[name()='svg']"));
			// Click on the Assign User button
			assignUserButton11a1.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[normalize-space()='Yes'])[1]")).click();
			Thread.sleep(4000);
			// Verified message delete sucessfully
			WebElement elemento1q = driver
					.findElement(By.xpath("//div[contains(text(),'user_deleted_successfully')][1]"));
			String textcc1q = elemento1q.getText();
			System.out.println(textcc1q);
			Thread.sleep(8000);

			// Created Project On Home page
			driver.findElement(By.xpath(
					"//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-regular css-mwapoj']//div//div[1]//p[1]"))
					.click();
			Thread.sleep(2000);
			String projectName = "aarushCTT";
			// Create Project
			driver.findElement(By.xpath(
					"//button[contains(@class, 'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1a3o5vh') and text()='Projects']"))
					.click();// Click on the Project button
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[normalize-space()='Create Project']")).click();// Create project
			Thread.sleep(2000);
			driver.findElement(By.xpath("//h2[@id='customized-dialog-title']")).isDisplayed(); // verify create project
																								// screen display
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='Namecreate-user']")).sendKeys(projectName);// Enter Name
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='Descriptioncreate-user']")).sendKeys("aarushCTT");// Disc
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(
					":nth-child(3) > .MuiAutocomplete-root > .MuiFormControl-root > .MuiInputBase-root > #undefinedcreate-user"))
					.sendKeys("aarushp123098@gmail.com");// select project lead
			Thread.sleep(2000);
			driver.findElement(
					By.xpath("//li[@id='undefinedcreate-user-option-0' and contains(text(), 'aarushp123098@gmail.com')]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name=\"ProjectGroup\"][1]")).sendKeys("aarushCTT");// Project Group
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name=\"Domain\"][1]")).sendKeys("aarushCTT");// Project domain
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();// click on save button
			Thread.sleep(3000);
			// Verified Created project //Define the expected text
			String expectedText = projectName;
			// XPath to locate the <p> tag containing the expected text
			String xpathExpression = "//p[contains(text(), '" + projectName + "')]";
			// Find the element using XPath
			WebElement paragraphElement = driver.findElement(By.xpath(xpathExpression));
			// Get the text of the paragraph element
			String actualText = paragraphElement.getText();
			// Verify if the actual text matches the expected text
			if (actualText.equals(expectedText)) {
				System.out.println("Text verification successful!");
			} else {
				System.out.println(
						"Text verification failed. Expected text: " + projectName + ", Actual text: " + actualText);
			}
			Thread.sleep(2000);

			// Click on home page
			driver.findElement(By.xpath(
					"//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-regular css-mwapoj']//div//div[1]//p[1]"))
					.click();
			Thread.sleep(8000);
			// Open specific
			WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'aarushCTT')]"));
			element.click();
			Thread.sleep(20000);
			// Right-click on root node
			WebElement iframe = driver.findElement(By.xpath("(//iframe[@id='iframeD3'])[1]"));
			driver.switchTo().frame(iframe);
			Thread.sleep(4000);
			WebElement nodeTextElement = driver.findElement(By.className("nodeText"));
			// Perform a right-click using the Actions class
			Actions actions = new Actions(driver);
			actions.contextClick(nodeTextElement).perform();
			Thread.sleep(4000);
			// click on save job
			driver.findElement(By.xpath("//ul/li[contains(text(), 'Save JZON')]")).click();
			Thread.sleep(9000);
			// Switch to the alert
			System.out.println("");
			Alert alert1z1 = driver.switchTo().alert();
			System.out.println("");
			String ProjectJZONalertText16 = alert1z1.getText();
			System.out.println("Alert message: " + ProjectJZONalertText16);
			String expectedAlertText14 = "Project JZON saved successfully";
			Thread.sleep(5000);
			// Accept the alert (click OK or Yes)
			alert1z1.accept();
			Thread.sleep(4000);

			// verified current version
			WebElement element1 = driver.findElement(By.xpath("//*[@id='project_version']"));
			// Get the text content of the element
			String actualTextt = element1.getText();
			// Expected text
			String expectedTextr = "1.1";
			// Verify the text using assertions
			Assert.assertEquals(expectedTextr, actualTextt);
			Thread.sleep(4000);
			// Click on load jsON
			driver.findElement(By.cssSelector("#jsonfile"))
					.sendKeys("C:\\Users\\Abhijit.Jadhav\\eclipse-workspace\\VSGDoverProduct.jzon");
			Thread.sleep(6000);
			WebElement rootnode = driver.findElement(By.xpath("(//*[contains(text(),'VSGDoverProduct')])[1]"));
			Actions actionsz = new Actions(driver);
			actionsz.contextClick(rootnode).perform();
			Thread.sleep(4000);
			// click on save job
			driver.findElement(By.xpath("//ul/li[contains(text(), 'Save JZON')]")).click();
			Thread.sleep(8000);
	       // Handel Alert
			System.out.println("Checke_Rootnode");
			Thread.sleep(6000);
			Alert alert1 = driver.switchTo().alert();
			System.out.println("save or not");
			String AssignedNode1 = alert1.getText();
			System.out.println("Alert message: " + AssignedNode1);
			String expectedAlertText11 = "Project JZON saved successfully";
			alert1.accept();
			Thread.sleep(6000);
			
			// Switch back to the default content (main page)
			driver.switchTo().defaultContent();

			// Click on home page
			driver.findElement(By.xpath(
					"//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-regular css-mwapoj']//div//div[1]//p[1]"))
					.click();
			Thread.sleep(2000);
			// Open specific
			WebElement element11 = driver.findElement(By.xpath("//*[contains(text(), 'aarushCTT')]"));
			element11.click();
			Thread.sleep(20000);
			// Right-click on root node
			WebElement iframe1 = driver.findElement(By.xpath("(//iframe[@id='iframeD3'])[1]"));

			// Switch to the iframe
			driver.switchTo().frame(iframe1);
			Thread.sleep(1000);
			//Visible buttons checked on VIZ tool screen
			//click on the search off
			driver.findElement(By.xpath("//*[@id=\"SearchOnOff\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"SearchOnOff\"]")).click();
			Thread.sleep(2000);
			//Click on the sort path 
			driver.findElement(By.xpath("//*[@id=\"alphaSort\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"alphaSort\"]")).click();
			Thread.sleep(2000);
			//Click on the layout
			driver.findElement(By.xpath("//*[@id=\"reverseLayout\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"reverseLayout\"]")).click();
			Thread.sleep(2000);
			//Click on the Auto layout
			driver.findElement(By.xpath("//*[@id=\"adjustLayout\"]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"adjustLayout\"]")).click();
			Thread.sleep(4000);
			
			// Locate the node text element within the iframe
			WebElement nodeTextElement1 = driver
					.findElement(By.xpath("//*[contains(text(), 'Controls & Electrical Components')]"));
			nodeTextElement1.click();
			Thread.sleep(4000);
			
			// Click on the Switches node
			WebElement rootnode1 = driver.findElement(By.xpath("(//*[contains(text(),'Switches')])[1]"));
			Actions actionsz1 = new Actions(driver);
			actionsz1.contextClick(rootnode1).perform();
			Thread.sleep(4000);
			// click on Assign node
			driver.findElement(By.xpath("//ul/li[contains(text(), 'Assign Node to the Analyst')]")).click();
			Thread.sleep(4000);
			 // verified whether assigned node to analyst window open or not
			WebElement elementa = driver.findElement(By.xpath("//*[@id=\"assignNodeTitle\"]"));
			String text = elementa.getText();
			System.out.println(text);
			Thread.sleep(1000);
			// click on the drop-down
			driver.findElement(By.xpath("//*[@id=\"nodeToAnalyst\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"nodeToAnalyst\"]/option[2]")).click();
			Thread.sleep(1000);
             //click on the assigned node
			driver.findElement(By.xpath("//*[@id=\"confirmAssignNode\"]")).click();
			Thread.sleep(3000);
			// Handel Alert
			System.out.println();
			Alert alert11 = driver.switchTo().alert();
			System.out.println();
			// Get the text of the alert
			String AssignedNode11 = alert11.getText();
			System.out.println("Alert message: " + AssignedNode11);
			String expectedAlertText111 = "Successfully assigned node to the Analyst";
			// Accept the alert (click OK or Yes)
			alert11.accept();
			Thread.sleep(4000);				
			// Switch back to the default content (main page)
			driver.switchTo().defaultContent();

			Thread.sleep(4000);
			// Click on home page
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/header/div/div[1]/div[3]/div[1]/p/button[1]"))
					.click();
			Thread.sleep(6000);

			// Click on Add user
			// Locate the parent div class that contains all the project names
			WebElement parentDiv = driver.findElement(By.xpath("//div[@id='panel1bh-header']"));
			Thread.sleep(4000);
			// Find the specific project name within the parent div class
			WebElement project = parentDiv.findElement(By.xpath("//*[contains(text(), 'aarushCTT')]"));
			Thread.sleep(4000);
			//Assuming the Assign User button is a sibling of the project name, you can use XPath to find it
			WebElement assignUserButton = project
					.findElement(By.xpath("following::button[@aria-label='Assign Users'][1]"));
			// Click on the Assign User button
			assignUserButton.click();
			Thread.sleep(4000);

			// Add user click
			driver.findElement(By.xpath("(//button[normalize-space()='Add User'])[1]")).click();
			Thread.sleep(3000);

			// Add user select Email
			// Send keys to the input field
			driver.findElement(By
					.cssSelector("div.MuiFormControl-root.MuiFormControl-fullWidth.MuiTextField-root.css-e48aov input"))
					.sendKeys("niveditha.raguraman@pivotree.com");
			Thread.sleep(2000);
			//   Click on the dropdown option
			driver.findElement(By.xpath("/html/body/div[5]/div/ul/li[1]")).click();
			Thread.sleep(2000);
			  //Select role
			WebElement roleInput = driver.findElement(By.cssSelector("input[name='Role']"));
			roleInput.sendKeys("Analyst");
			Thread.sleep(2000);
			 //  Choose the option from the dropdown
			driver.findElement(By.xpath("//li[@id='undefinedcreate-user-option-1' and contains(text(), 'Analyst')]"))
					.click();
			Thread.sleep(2000);
			// click on the save button
			driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
			Thread.sleep(2000);
			// Verify text and user
			WebElement elementB = driver.findElement(By.xpath("(//div[@role='alert'])[1]"));
			String textB = elementB.getText();
			System.out.println(textB);
			Thread.sleep(2000);
			 //  user verify
			WebElement userListElement = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div")); // Change the
																										// locator as
																										// per your HTML
																										// structure

			// Extract the text or attributes that uniquely identify the added user
			String addedUserName = "Niveditha Raguraman"; // Example: Name of the user you added
			String addedUserEmail = "niveditha.raguraman@pivotree.com"; // Example: Email of the user you added

			// Check if the expected user information matches the actual user information displayed
			String userListText = userListElement.getText();
			boolean isUserAdded = userListText.contains(addedUserName) && userListText.contains(addedUserEmail);
			Thread.sleep(1000);
			if (isUserAdded) {
				System.out.println("User has been successfully added.");
			} else {
				System.out.println("User has not been added or not found in the list.");
			}
			Thread.sleep(2000);

			//Close the pop-up window
			driver.findElement(By.xpath("(//button[@aria-label='close'])[1]")).click();
			Thread.sleep(2000);

			//Open the same project 
			WebElement element111 = driver.findElement(By.xpath("//*[contains(text(), 'aarushCTT')]"));
			element111.click();
			Thread.sleep(20000);
	    //Right-click on the root node
			WebElement iframe11 = driver.findElement(By.xpath("(//iframe[@id='iframeD3'])[1]"));
			driver.switchTo().frame(iframe11);
			WebElement nodeTextElement11 = driver
					.findElement(By.xpath("//*[contains(text(), 'Controls & Electrical Components')]"));
			nodeTextElement11.click();
			Thread.sleep(4000);
			//  Click on the  node 
			WebElement rootnode11 = driver.findElement(By.xpath("(//*[contains(text(),'Electronic Components')])[1]"));
			Actions actions1 = new Actions(driver);
			actions1.contextClick(rootnode11).perform();
			Thread.sleep(4000);
			//  click on Assign node
			driver.findElement(By.xpath("//ul/li[contains(text(), 'Assign Node to the Analyst')]")).click();
			Thread.sleep(4000);
			//  verified whether assigned node to analyst window open or not
			WebElement element11a = driver.findElement(By.xpath("//*[@id=\"assignNodeTitle\"]"));
			String text1 = element11a.getText();
			System.out.println(text1);
			Thread.sleep(1000);
			  //click on the drop-down
			driver.findElement(By.xpath("//*[@id=\"nodeToAnalyst\"]")).click();
			Thread.sleep(1000);
			 // select assign node name
			driver.findElement(By.xpath("//*[@id=\"nodeToAnalyst\"]/option[2]")).click();
			Thread.sleep(1000);
           // click on the assigned node
			driver.findElement(By.xpath("//*[@id=\"confirmAssignNode\"]")).click();
			Thread.sleep(3000);
          //Handel Alert
			System.out.println();
			Alert alert111 = driver.switchTo().alert();
			System.out.println();
 	      // Get the text of the alert
			String AssignedNode111 = alert111.getText();
			System.out.println("Alert message: " + AssignedNode111);
			String expectedAlertText11b = "Successfully assigned node to the Analyst";
    	  //Accept the alert (click OK or Yes)
			alert111.accept();
			Thread.sleep(2000);
			// Switch back to the default content (main page)
			driver.switchTo().defaultContent();

  	     // Click on home page
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/header/div/div[1]/div[3]/div[1]/p/button[1]")).click();
			Thread.sleep(2000);			
			//click on the same project drop down and open assign node
			// Locate the parent div class that contains all the project names
			WebElement parentDiv11w11 = driver.findElement(By.xpath("//div[@id='panel1bh-header']"));
			Thread.sleep(4000);
			// Find the specific project name within the parent div class
			WebElement project11e = parentDiv11w11.findElement(By.xpath("//*[contains(text(), 'aarushCTT')]"));
			Thread.sleep(4000);
			//Click on the drop down
			WebElement assignUserButton11e = project11e.findElement(By.xpath("following::div[@class='MuiAccordionSummary-expandIconWrapper css-1fx8m19']"));
				assignUserButton11e.click();
			Thread.sleep(4000);
			// Click on the specific node (e.g., "Switches")
			List<WebElement> TestAb = driver.findElements(By.xpath("(//*[contains(text(),'Switches')])"));
			
			for(
				WebElement ele1 : TestAb
			) 
			{
				
				if(ele1.getText().equalsIgnoreCase("Switches"))
				{
					
					ele1.click();
				}
			}
			
			Thread.sleep(4000);


		  //Right-click on root node
			WebElement iframe111 = driver.findElement(By.xpath("(//iframe[@id='iframeD3'])[1]"));
			Thread.sleep(4000);
			//   Switch to the iframe
			driver.switchTo().frame(iframe111);
			Thread.sleep(4000);
			 //  Locate the node text element within the iframe
			WebElement nodeTextElement1b = driver.findElement(By.className("nodeText"));
			// Perform a right-click using the Actions class
			Actions actionsc = new Actions(driver);
			actionsc.contextClick(nodeTextElement1b).perform();
			Thread.sleep(4000);
			//  click on Add child name
			driver.findElement(By.xpath("//ul/li[contains(text(), 'Add child node...')]")).click();
			Thread.sleep(4000);
			 // add child node name
			driver.findElement(By.xpath("//*[@id=\"CreateNodeName\"]")).sendKeys("DemoTest");
			Thread.sleep(4000);
			// click on the Create button
			driver.findElement(By.xpath("//*[@id=\"CreateNodeForm\"]/div[2]/div[2]/a[2]")).click();
			Thread.sleep(4000);
			//click on Save close name
			WebElement nodeTextElement1bc = driver.findElement(By.className("nodeText"));
			// Perform a right-click using the Actions class
			Actions actions1c = new Actions(driver);
			actions1c.contextClick(nodeTextElement1bc).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//ul/li[contains(text(), 'Save & Close JZON')]")).click();
			Thread.sleep(4000);
			//verified current version
			WebElement element111q = driver.findElement(By.xpath("//*[@id='project_version']"));
			String actualText1 = element111q.getText();
        // Expected text
			String expectedText1 = "2.0";
		    //  Verify the text using assertions
			Assert.assertEquals(expectedText1, actualText1);
			Thread.sleep(3000);
		   //Switch back to the default content (main page)
			driver.switchTo().defaultContent();

			// Click on home page
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/header/div/div[1]/div[3]/div[1]/p/button[1]"))
					.click();
			Thread.sleep(6000);
			// Click on same project and check node as completed
			// Locate the parent div class that contains all the project names
			WebElement parentDiv1 = driver.findElement(By.xpath("//div[@id='panel1bh-header']"));
			Thread.sleep(4000);
			// Find the specific project name within the parent div class
			WebElement project1 = parentDiv1.findElement(By.xpath("//*[contains(text(), 'aarushCTT')]"));
			Thread.sleep(4000);
			//Click on the drop down
			WebElement assignUserButton1 = project1.findElement(
					By.xpath("following::div[@class='MuiAccordionSummary-expandIconWrapper css-1fx8m19']"));
			// Click on the Assign User button
			assignUserButton1.click();
			Thread.sleep(6000);
		//node staus as completd or not 
			WebElement element1d = driver.findElement(By.xpath("(//p[contains(text(),'Completed')])"));
			String text11 = element1d.getText();
			System.out.println(text11);
			Thread.sleep(2000);
			// Open specific
			WebElement element11z = driver.findElement(By.xpath("//*[contains(text(), 'aarushCTT')]"));
			element11z.click();
			Thread.sleep(20000);
			// Right-click on root node
			// Locate the iframe using CSS selector
			WebElement iframe1z = driver.findElement(By.xpath("(//iframe[@id='iframeD3'])[1]"));
			driver.switchTo().frame(iframe1z);
			// Locate the node text element within the iframe
			WebElement nodeTextElement1z = driver
					.findElement(By.xpath("//*[contains(text(), 'Controls & Electrical Components')]"));
			nodeTextElement1z.click();
			Thread.sleep(8000);
			// Click on the Switches node
			WebElement rootnode11s = driver.findElement(By.xpath("(//*[contains(text(),'Switches')])[1]"));
			Actions actionsq = new Actions(driver);
			actionsq.contextClick(rootnode11s).perform();
			Thread.sleep(4000);
			// click on reintegrated node
			driver.findElement(By.xpath("//ul/li[contains(text(), 'Reintegrate Node')]")).click();
			Thread.sleep(8000);
			 // Handel alert
			System.out.println();
			Alert alert11s = driver.switchTo().alert();
			System.out.println();
		     // Get the text of the alert
			String ProjectJZONalertText1s = alert11s.getText();
			System.out.println("Alert message: " + ProjectJZONalertText1s);
			String expectedAlertText1s = "All data in the node including SKUs will be lost";
		    // Accept the alert (click OK or Yes)
			alert11s.accept();
			Thread.sleep(10000);

			// Handel Alert
			System.out.println();
			Alert alert1d = driver.switchTo().alert();
			System.out.println();
		   // Get the text of the alert
			String ProjectJZONalertText11d = alert1d.getText();
			System.out.println("Alert message: " + ProjectJZONalertText11d);
			String expectedAlertText11f = "Node Reintegrated Successfully";
			//Accept the alert (click OK or Yes)
			alert1d.accept();
			Thread.sleep(10000);

			// Handel Alert
			System.out.println();
			Alert alert1111 = driver.switchTo().alert();
			System.out.println();
			// Get the text of the alert
			String ProjectJZONalertText11 = alert1111.getText();
			System.out.println("Alert message: " + ProjectJZONalertText11);
			String expectedAlertText1011 = "Project JZON saved successfully";
			// Accept the alert (click OK or Yes)
			alert1111.accept();
			 Thread.sleep(6000);
			// Mouse over to the battery node
			WebElement batteryNode = driver.findElement(By.xpath("(//*[contains(text(),'Switches')])[1]"));
			Actions actionsA = new Actions(driver);
			actionsA.moveToElement(batteryNode).perform();
			Thread.sleep(2000); // Wait for the menu to appear, adjust time as needed
			// Scroll to the right (if needed)
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(-200, 0)");
			Thread.sleep(6000);
			// Now perform the actions you need after the mouse hover
			WebElement element11A = driver.findElement(By.xpath("//*[contains(text(),'Node status: Reintegrated')]"));
			String text111 = element11A.getText();
			System.out.println(text111);
			Thread.sleep(2000);

			// verified current version
			WebElement element111n = driver.findElement(By.xpath("//*[@id='project_version']"));
			String actualText1w = element111n.getText();
	        // Expected text
			String expectedText1w = "1.3";
		     // Verify the text using assertions
			Assert.assertEquals(expectedText1w, actualText1w);
			Thread.sleep(3000);
			// Switch back to the default content (main page)
			driver.switchTo().defaultContent();

			// Click on home page
			driver.findElement(By.xpath("//button[normalize-space()='Home'][1]")).click();
			Thread.sleep(8000);

			// Click on the same project dropdown and check node is reintegrtaed or not
			// Locate the parent div class that contains all the project names
			WebElement parentDiv11 = driver.findElement(By.xpath("//div[@id='panel1bh-header']"));
			Thread.sleep(4000);
			// Find the specific project name within the parent div class
			WebElement project11 = parentDiv11.findElement(By.xpath("//*[contains(text(), 'aarushCTT')]"));
			Thread.sleep(4000);
			 // Click on the drop down
			WebElement assignUserButton11 = project11.findElement(
					By.xpath("following::div[@class='MuiAccordionSummary-expandIconWrapper css-1fx8m19']"));
			// Click on the Assign User button
			assignUserButton11.click();
			Thread.sleep(6000);
			// node staus as completd or not
			WebElement element1111s = driver.findElement(By.xpath("(//p[contains(text(),'Reintegrated')])"));
			String text11A = element1111s.getText();
			System.out.println(text11A);
			Thread.sleep(6000);
			
			// Open specific
			WebElement element11z1 = driver.findElement(By.xpath("//*[contains(text(), 'aarushCTT')]"));
			element11z1.click();
			Thread.sleep(20000);
			// Right-click on root node
			// Locate the iframe using CSS selector
			WebElement iframe1z1 = driver.findElement(By.xpath("(//iframe[@id='iframeD3'])[1]"));
			driver.switchTo().frame(iframe1z1);
			// Locate the node text element within the iframe
			WebElement nodeTextElement1z1 = driver
			.findElement(By.xpath("//*[contains(text(), 'Controls & Electrical Components')]"));
			nodeTextElement1z1.click();
		   Thread.sleep(8000);
			// Click on the Switches node
			WebElement rootnode11s1 = driver.findElement(By.xpath("(//*[contains(text(),'Switches')])[1]"));
			Actions actionsq1 = new Actions(driver);
			actionsq1.contextClick(rootnode11s1).perform();
			Thread.sleep(4000);
			//click on reintegrated node
			driver.findElement(By.xpath("//ul/li[contains(text(), 'Assign Node to the Analyst')]")).click();
			Thread.sleep(8000);
			
		 //verified whether assigned node to analyst window open or not
				WebElement elementa2 = driver.findElement(By.xpath("//*[@id=\"assignNodeTitle\"]"));
				String text2 = elementa2.getText();
				System.out.println(text2);
				Thread.sleep(1000);
				// click on the drop-down
				driver.findElement(By.xpath("//*[@id=\"nodeToAnalyst\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"nodeToAnalyst\"]/option[2]")).click();
				Thread.sleep(1000);
	            // click on the assigned node
				driver.findElement(By.xpath("//*[@id=\"confirmAssignNode\"]")).click();
				Thread.sleep(3000);
				// Handel Alert
				System.out.println();
				Alert alert115 = driver.switchTo().alert();
				System.out.println();
				// Get the text of the alert
				String AssignedNode115 = alert115.getText();
				System.out.println("Alert message: " + AssignedNode115);
				String expectedAlertText1115 = "Successfully assigned node to the Analyst";
				// Accept the alert (click OK or Yes)
				alert115.accept();
				Thread.sleep(4000);				
				// Switch back to the default content (main page)
				driver.switchTo().defaultContent();
				Thread.sleep(1000);
				// Click on home page
				driver.findElement(By.xpath("//button[normalize-space()='Home'][1]")).click();
				Thread.sleep(4000);
				
				
				//open dropdown
				//Locate the parent div class that contains all the project names
				WebElement parentDiv11t = driver.findElement(By.xpath("//div[@id='panel1bh-header']"));
				Thread.sleep(4000);
				// Find the specific project name within the parent div class
				WebElement project11t = parentDiv11t.findElement(By.xpath("//*[contains(text(), 'aarushCTT')]"));
				Thread.sleep(4000);
				 // Click on the drop down
				WebElement assignUserButton11t = project11t.findElement(
						By.xpath("following::div[@class='MuiAccordionSummary-expandIconWrapper css-1fx8m19']"));
				// Click on the Assign User button
				assignUserButton11t.click();
				Thread.sleep(6000);
				// node staus as completd or not
				WebElement element1111st = driver.findElement(By.xpath("(//p[contains(text(),'Assigned')])"));
				String text11At = element1111st.getText();
				System.out.println(text11At);
				Thread.sleep(6000);

		} finally {
//            // Close the WebDriver instance
//			driver.quit();
		}
//
	}
}
//
