
package jmv;




import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class Test {

private static String iframe;

public static void main(String args[]) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        try {
            // Navigate to the URL
            driver.get("https://development.d36z6oo50ky8dh.amplifyapp.com/login");
            Thread.sleep(6000);
            driver.manage().window().maximize();
            
            // Print the title of the current page
            System.out.println("Page title: " + driver.getTitle());
            Thread.sleep(4000);
//            driver.findElement(By.cssSelector("#username")).sendKeys("aarushwagh133@gmail.com");
            driver.findElement(By.id("username")).sendKeys("abcdt274@gmail.com");//Enter Gmail
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#password")).sendKeys("ZVQdo769");// Password
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("button[type='button']")).click();//Login
            Thread.sleep(2000);
//             driver.findElement(By.cssSelector(".MuiButton-contained")).click();
//             Thread.sleep(3000);
//             driver.findElement(By.cssSelector(":nth-child(1) > :nth-child(1) > :nth-child(1) > :nth-child(1) > form > div > .btn")).click();
//             Thread.sleep(3000);
//             driver.findElement(By.cssSelector("#okta-signin-username")).sendKeys("abhijit.jadhav@pivotree.com");
//             driver.findElement(By.cssSelector("#okta-signin-password")).sendKeys("Abhi4321$#@!");
//             driver.findElement(By.cssSelector("#okta-signin-submit")).click();
//             Thread.sleep(3000);
////             driver.findElement(By.cssSelector(".o-form-input-name-autoPush > .custom-checkbox > label")).click();
//             driver.findElement(By.cssSelector(".button")).click();
             Thread.sleep(14000);
            String projectName = "TestAutomationAF";
            		
             driver.findElement(By.xpath("//button[contains(@class, 'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1a3o5vh') and text()='Projects']")).click();// Click on the Project button
//             driver.findElement(By.xpath("//button[normalize-space()='Projects']")).click();
             Thread.sleep(3000);
//             driver.findElement(By.xpath("//button[normalize-space()='Create Project']")).click();// Create project
//             Thread.sleep(2000);
//             driver.findElement(By.xpath("//h2[@id='customized-dialog-title']")).isDisplayed(); // verify create project screen display
//             Thread.sleep(2000);
//             driver.findElement(By.xpath("//input[@id='Namecreate-user']")).sendKeys(projectName);// Enter Name
//             Thread.sleep(2000);
//             driver.findElement(By.xpath("//input[@id='Descriptioncreate-user']")).sendKeys("ABC_TEST");// Disc
//             Thread.sleep(2000);
//             driver.findElement(By.cssSelector(":nth-child(3) > .MuiAutocomplete-root > .MuiFormControl-root > .MuiInputBase-root > #undefinedcreate-user")).sendKeys("abcdt274@gmail.com");// select project lead
//             Thread.sleep(2000);
//             driver.findElement(By.xpath("//li[@id='undefinedcreate-user-option-0' and contains(text(), 'abcdt274@gmail.com')]")).click();
//             Thread.sleep(2000);
//             driver.findElement(By.cssSelector("body > div:nth-child(5) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("AutomationProject");//Project domain
//             Thread.sleep(2000);
//             driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();// click on save button
//             Thread.sleep(3000);
//             
//          // Verified Created project //Define the expected text
//             String expectedText = projectName;
//
//		             // XPath to locate the <p> tag containing the expected text
//		             String xpathExpression = "//p[contains(text(), '" + projectName + "')]";
//		
//		             // Find the element using XPath
//		             WebElement paragraphElement = driver.findElement(By.xpath(xpathExpression));
//		
//		             // Get the text of the paragraph element
//		             String actualText = paragraphElement.getText();
//		
//		             // Verify if the actual text matches the expected text
//		             if (actualText.equals(expectedText)) {
//		                 System.out.println("Text verification successful!");
//		             } else {
//		                 System.out.println("Text verification failed. Expected text: " + projectName + ", Actual text: " + actualText);
//		             }
//             Thread.sleep(2000);
//		    
//		 // Click on home page
//		  driver.findElement(By.xpath("//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-regular css-mwapoj']//div//div[1]//p[1]")).click();
//		  Thread.sleep(2000);
//	// Open specific
//		  WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'TestAutomationAF')]"));
//		  element.click();
//		  Thread.sleep(10000);
//    //Right-click on root node
//		// Locate the iframe using CSS selector
//		  WebElement iframe = driver.findElement(By.xpath("(//iframe[@id='iframeD3'])[1]"));
//
//		  // Switch to the iframe
//		  driver.switchTo().frame(iframe);
//
//		  // Locate the node text element within the iframe
//		  WebElement nodeTextElement = driver.findElement(By.className("nodeText"));
//
//		  // Perform a right-click using the Actions class
//		  Actions actions = new Actions(driver);
//		  actions.contextClick(nodeTextElement).perform();
//		  Thread.sleep(4000);
//		  //click on save job
//		  driver.findElement(By.xpath("//ul/li[contains(text(), 'Save JZON')]")).click();
//		  Thread.sleep(4000);
//		  // Handel Alert
//		  Alert alert = driver.switchTo().alert();
//	        // Get the text of the alert
//	        String ProjectJZONalertText = alert.getText();
//	        System.out.println("Alert message: " + ProjectJZONalertText);
//	        String expectedAlertText = "Project JZON saved successfully";
//	        // Accept the alert (click OK or Yes)
//	        alert.accept();
//	        Thread.sleep(4000);
//	        //verified current version
//	        WebElement element1 = driver.findElement(By.xpath("//*[@id='project_version']"));
//
//	     // Get the text content of the element
//	     String actualText = element1.getText();
//
//	     // Expected text
//	     String expectedText = "2.1";
//
//	     // Verify the text using assertions
//	     Assert.assertEquals(expectedText, actualText);
//	     
//	     // Click on load jsON
//	     driver.findElement(By.cssSelector("#jsonfile")).sendKeys("C:\\Users\\Abhijit.Jadhav\\eclipse-workspace\\VSGDoverProduct.jzon");
//	     Thread.sleep(2000);
//	   WebElement rootnode = driver.findElement(By.xpath("(//*[contains(text(),'VSGDoverProduct')])[1]"));
//	   Actions actions = new Actions(driver);
//	   actions.contextClick(rootnode).perform();
//		  Thread.sleep(4000);
//		  //click on save job
//		  driver.findElement(By.xpath("//ul/li[contains(text(), 'Save JZON')]")).click();
//		  Thread.sleep(4000);
//		  // Handel Alert
//		  Alert alert1 = driver.switchTo().alert();
//	        // Get the text of the alert
//	        String ProjectJZONalertText1 = alert1.getText();
//	        System.out.println("Alert message: " + ProjectJZONalertText1);
//	        String expectedAlertText1 = "Project JZON saved successfully";
//	        // Accept the alert (click OK or Yes)
//	        alert1.accept();
//	        Thread.sleep(4000);
	        
//	     // Click on home page
//			  driver.findElement(By.xpath("//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-regular css-mwapoj']//div//div[1]//p[1]")).click();
//			  Thread.sleep(2000);
//		// Open specific
//			  WebElement element11 = driver.findElement(By.xpath("//*[contains(text(), 'TestAutomationAF')]"));
//			  element11.click();
//			  Thread.sleep(20000);
//	    //Right-click on root node
//			// Locate the iframe using CSS selector
//			  WebElement iframe1 = driver.findElement(By.xpath("(//iframe[@id='iframeD3'])[1]"));
//
//			  // Switch to the iframe
//			  driver.switchTo().frame(iframe1);
//
//			  // Locate the node text element within the iframe
//			  WebElement nodeTextElement1 = driver.findElement(By.xpath("//*[contains(text(), 'Controls & Electrical Components')]"));
//			  nodeTextElement1.click();
//			  Thread.sleep(4000);
//			  //Click on the battery node 
//			  WebElement rootnode1 = driver.findElement(By.xpath("(//*[contains(text(),'Switches')])[1]"));
//			  Actions actions = new Actions(driver);
//		      actions.contextClick(rootnode1).perform();
//			  Thread.sleep(4000);
//				  //click on Assign node
//			  driver.findElement(By.xpath("//ul/li[contains(text(), 'Assign Node to the Analyst')]")).click();
//			  Thread.sleep(4000);
////			  verified whether assigned node to analyst window open or not
//			  WebElement element = driver.findElement(By.xpath("//*[@id=\"assignNodeTitle\"]"));
//			  String text = element.getText();
//			  System.out.println(text);
//			  Thread.sleep(1000);
//			  //click on the drop-down
//			  driver.findElement(By.xpath("//*[@id=\"nodeToAnalyst\"]")).click();
//			  Thread.sleep(1000);
//			  driver.findElement(By.xpath("//*[@id=\"nodeToAnalyst\"]/option[3]")).click();
//              Thread.sleep(1000);
//              //click on the assigned node
//              driver.findElement(By.xpath("//*[@id=\"confirmAssignNode\"]")).click();
//              Thread.sleep(3000);
//           // Handel Alert
//    		  Alert alert1 = driver.switchTo().alert();
//   	      // Get the text of the alert
//    	      String AssignedNode1 = alert1.getText();
//    	      System.out.println("Alert message: " + AssignedNode1);
//    	      String expectedAlertText1 = "Successfully assigned node to the Analyst";
//    	      // Accept the alert (click OK or Yes)
//    	      alert1.accept();
//    	      Thread.sleep(6000);
//    	   // Click on home page
//			  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/header/div/div[1]/div[3]/div[1]/p/button[1]")).click();
//			  Thread.sleep(2000);
//			// Click on Add user
//			  driver.findElement(By.xpath("(//button[@aria-label='Assign Users'])[1]")).click();
//			  Thread.sleep(2000);
//            //Add user Window open and verified
//			  WebElement elementA = driver.findElement(By.xpath("(//button[@aria-label='Assign Users'])[1]"));
//			  String textA = elementA.getText();
//			  System.out.println(textA);
//			  Thread.sleep(3000);
//			  //Add user click 
//			  driver.findElement(By.xpath("(//button[normalize-space()='Add User'])[1]")).click();
//			  Thread.sleep(3000);
//			  
//              //Add user select Email
//			// Send keys to the input field
//			  driver.findElement(By.cssSelector("div.MuiFormControl-root.MuiFormControl-fullWidth.MuiTextField-root.css-e48aov input")).sendKeys("niveditha.raguraman@pivotree.com");
//			  Thread.sleep(2000);
//			  // Click on the dropdown option
//			  driver.findElement(By.xpath("/html/body/div[5]/div/ul/li[1]")).click();
//			  Thread.sleep(2000);
//			  //Select role
//			  WebElement roleInput = driver.findElement(By.cssSelector("input[name='Role']"));
//			  roleInput.sendKeys("Analyst");
//			  Thread.sleep(2000);
//			  // Choose the option from the dropdown
//			  driver.findElement(By.xpath("//li[@id='undefinedcreate-user-option-1' and contains(text(), 'Analyst')]")).click();
//			  Thread.sleep(2000);
//            //click on the save button
//            driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
//			 Thread.sleep(2000);
//			 //Verify text and user
//			 WebElement elementB = driver.findElement(By.xpath("(//div[@role='alert'])[1]"));
//			  String textB = elementB.getText();
//			  System.out.println(textB);
//			  Thread.sleep(2000);
//			   //user verify
//			  WebElement userListElement = driver.findElement(By.xpath("(//tr[@role='checkbox'])[7]")); // Change the locator as per your HTML structure
//
//			// Step 2: Extract the text or attributes that uniquely identify the added user
//			String addedUserName = "Niveditha Raguraman"; // Example: Name of the user you added
//			String addedUserEmail = "niveditha.raguraman@pivotree.com"; // Example: Email of the user you added
//
//			// Step 3: Check if the expected user information matches the actual user information displayed
//			String userListText = userListElement.getText();
//			boolean isUserAdded = userListText.contains(addedUserName) && userListText.contains(addedUserEmail);
//			Thread.sleep(1000);
//			if (isUserAdded) {
//			    System.out.println("User has been successfully added.");
//			} else {
//			    System.out.println("User has not been added or not found in the list.");
//			}
//			Thread.sleep(2000);
//			
//			//Close the pop-up window
//			driver.findElement(By.xpath("(//button[@aria-label='close'])[1]")).click();
//			Thread.sleep(2000);
//			
//			
//			
//			
//			//Open the same project 
//			// Open specific
//			  WebElement element111 = driver.findElement(By.xpath("//*[contains(text(), 'TestAutomationAF')]"));
//			  element111.click();
//			  Thread.sleep(20000);
//	    //Right-click on the root node
//			// Locate the iframe using CSS selector
//			  WebElement iframe11 = driver.findElement(By.xpath("(//iframe[@id='iframeD3'])[1]"));
//
//			  // Switch to the iframe
//			  driver.switchTo().frame(iframe11);
//
//			  // Locate the node text element within the iframe
//			  WebElement nodeTextElement11 = driver.findElement(By.xpath("//*[contains(text(), 'Controls & Electrical Components')]"));
//			  nodeTextElement11.click();
//			  Thread.sleep(4000);
//			  //Click on the  node 
//			  WebElement rootnode11 = driver.findElement(By.xpath("(//*[contains(text(),'Electronic Components')])[1]"));
//			  Actions actions1 = new Actions(driver);
//		      actions1.contextClick(rootnode11).perform();
//			  Thread.sleep(4000);
//				  //click on Assign node
//			  driver.findElement(By.xpath("//ul/li[contains(text(), 'Assign Node to the Analyst')]")).click();
//			  Thread.sleep(4000);
////			  verified whether assigned node to analyst window open or not
//			  WebElement element1 = driver.findElement(By.xpath("//*[@id=\"assignNodeTitle\"]"));
//			  String text1 = element1.getText();
//			  System.out.println(text1);
//			  Thread.sleep(1000);
//			  //click on the drop-down
//			  driver.findElement(By.xpath("//*[@id=\"nodeToAnalyst\"]")).click();
//			  Thread.sleep(1000);
//			  //select assign node name
//			  driver.findElement(By.xpath("//*[@id=\"nodeToAnalyst\"]/option[2]")).click();
//            Thread.sleep(1000);
//            //click on the assigned node
//            driver.findElement(By.xpath("//*[@id=\"confirmAssignNode\"]")).click();
//            Thread.sleep(3000);
//         // Handel Alert
//  		  Alert alert11 = driver.switchTo().alert();
// 	      // Get the text of the alert
//  	      String AssignedNode11 = alert11.getText();
//  	      System.out.println("Alert message: " + AssignedNode11);
//  	      String expectedAlertText11 = "Successfully assigned node to the Analyst";
//  	      // Accept the alert (click OK or Yes)
//  	      alert11.accept();
//  	      Thread.sleep(2000);
//  	   // Click on home page
//  	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/header/div/div[1]/div[3]/div[1]/p/button[1]")).click();
//		  Thread.sleep(2000);
//
//		//Click on the same project dropdown	
//		  driver.findElement(By.xpath("(//div[@class='MuiAccordionSummary-expandIconWrapper css-1fx8m19'])[2]")).click();
//		  Thread.sleep(8000);
//		//click on the specific node
//		  WebElement element111 = driver.findElement(By.xpath("(//button[contains(text(),'Batteries')])[2]"));
//		  element111.click();
//		  Thread.sleep(15000);
//		  
//		  //Right-click on root node
////			// Locate the iframe using the CSS selector
//			  WebElement iframe = driver.findElement(By.xpath("(//iframe[@id='iframeD3'])[1]"));
//			  Thread.sleep(4000);
////			  // Switch to the iframe
//			  driver.switchTo().frame(iframe);
//			  Thread.sleep(4000);
////			  // Locate the node text element within the iframe
//			  WebElement nodeTextElement = driver.findElement(By.className("nodeText"));
//	//
////			  // Perform a right-click using the Actions class
//			  Actions actions = new Actions(driver);
//			  actions.contextClick(nodeTextElement).perform();
//			  Thread.sleep(4000);
////			  //click on Add child name
//			  driver.findElement(By.xpath("//ul/li[contains(text(), 'Add child node...')]")).click();
//			  Thread.sleep(4000);
//			  //add child node name
//			  driver.findElement(By.xpath("//*[@id=\"CreateNodeName\"]")).sendKeys("DemoTest");
//			  Thread.sleep(4000);
//			  //click on the Create button
//			  driver.findElement(By.xpath("//*[@id=\"CreateNodeForm\"]/div[2]/div[2]/a[2]")).click();
//			  Thread.sleep(4000);
//			//click on Save close name
//			// Perform a right-click using the Actions class
//			  Actions actions1 = new Actions(driver);
//			  actions1.contextClick(nodeTextElement).perform();
//			  Thread.sleep(2000);
//			  driver.findElement(By.xpath("//ul/li[contains(text(), 'Save & Close JZON')]")).click();
//			  Thread.sleep(4000);
//			//verified current version
//		        WebElement element1 = driver.findElement(By.xpath("//*[@id='project_version']"));
//	//
////		     // Get the text content of the element
//		     String actualText = element1.getText();
////		     // Expected text
//		     String expectedText = "2.0";
//		     // Verify the text using assertions
//		     Assert.assertEquals(expectedText, actualText);
		     Thread.sleep(2000);
		  // Click on home page
		  	   driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/header/div/div[1]/div[3]/div[1]/p/button[1]")).click();
				Thread.sleep(6000);

//		//Click on the same project dropdown	
//			driver.findElement(By.xpath("(//div[@class='MuiAccordionSummary-expandIconWrapper css-1fx8m19'])[2]")).click();
//			Thread.sleep(12000);
//		//node staus as completd or not 
//		WebElement element1 = driver.findElement(By.xpath("(//p[contains(text(),'Completed')])[3]"));
//		 String text1 = element1.getText();
//		System.out.println(text1);
//		Thread.sleep(2000);
		// Open specific
		  WebElement element11 = driver.findElement(By.xpath("//*[contains(text(), 'TestAutomationAF')]"));
		  element11.click();
		  Thread.sleep(20000);
//  //Right-click on root node
//		// Locate the iframe using CSS selector
		  WebElement iframe1 = driver.findElement(By.xpath("(//iframe[@id='iframeD3'])[1]"));
//
//		  // Switch to the iframe
		  driver.switchTo().frame(iframe1);
//
//		  // Locate the node text element within the iframe
		  WebElement nodeTextElement1 = driver.findElement(By.xpath("//*[contains(text(), 'Controls & Electrical Components')]"));
		  nodeTextElement1.click();
		  Thread.sleep(8000);
////		  //Click on the battery node 
//		  WebElement rootnode1 = driver.findElement(By.xpath("(//*[contains(text(),'Monitors & Keyboards')])[1]"));
//		  Actions actions = new Actions(driver);
//	      actions.contextClick(rootnode1).perform();
//		  Thread.sleep(4000);
////			  //click on reintegrated node
//		  driver.findElement(By.xpath("//ul/li[contains(text(), 'Reintegrate Node')]")).click();
//		  Thread.sleep(8000);
////			  // Handel Alert
//			  Alert alert = driver.switchTo().alert();
////		        // Get the text of the alert
//		        String ProjectJZONalertText = alert.getText();
//		        System.out.println("Alert message: " + ProjectJZONalertText);
//		        String expectedAlertText = "All data in the node including SKUs will be lost";
////		        // Accept the alert (click OK or Yes)
//		        alert.accept();
//		        Thread.sleep(10000);
//		        
//		        // Handel Alert
//				  Alert alert1 = driver.switchTo().alert();
////			        // Get the text of the alert
//			        String ProjectJZONalertText1 = alert1.getText();
//			        System.out.println("Alert message: " + ProjectJZONalertText1);
//			        String expectedAlertText1 = "Node Reintegrated Successfully";
////			        // Accept the alert (click OK or Yes)
//			        alert1.accept();
//			        Thread.sleep(10000);
//		        
//			     // Handel Alert
//					  Alert alert11 = driver.switchTo().alert();
////				        // Get the text of the alert
//				        String ProjectJZONalertText11 = alert11.getText();
//				        System.out.println("Alert message: " + ProjectJZONalertText11);
//				        String expectedAlertText11 = "Project JZON saved successfully";
////				        // Accept the alert (click OK or Yes)
//				        alert11.accept();
//				        Thread.sleep(6000);
				  //Mouse over to the battery node      
				  WebElement batteryNode = driver.findElement(By.xpath("(//*[contains(text(),'Monitors & Keyboards')])[1]"));
				  Actions actionsA = new Actions(driver);
				actionsA.moveToElement(batteryNode).perform();
				Thread.sleep(2000); // Wait for the menu to appear, adjust time as needed
				// Scroll to the right (if needed)
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(-100, 0)");
				Thread.sleep(6000);
				// Now perform the actions you need after the mouse hover
				WebElement element11A = driver.findElement(By.xpath("//*[contains(text(),'Node status: Reintegrated')]"));
				String text11 = element11A.getText();
				System.out.println(text11);
				Thread.sleep(2000);
		        
////		        //verified current version
//		        WebElement element111 = driver.findElement(By.xpath("//*[@id='project_version']"));
//		     String actualText = element111.getText();
//		     // Expected text
//		     String expectedText = "2.2";
//		     // Verify the text using assertions
//		     Assert.assertEquals(expectedText, actualText);
		     Thread.sleep(3000);
		// Switch back to the default content (main page)
		  driver.switchTo().defaultContent();
		     
		  // Click on home page
		  driver.findElement(By.xpath("//button[normalize-space()='Home'][1]")).click();
		  Thread.sleep(8000);

		//Click on the same project dropdown	
			driver.findElement(By.xpath("(//div[@class='MuiAccordionSummary-expandIconWrapper css-1fx8m19'])[2]")).click();
			Thread.sleep(12000);
		//node staus as completd or not 
		WebElement element1111 = driver.findElement(By.xpath("(//p[contains(text(),'Reintegrated')])[3]"));
		 String text11A = element1111.getText();
		System.out.println(text11A);
		Thread.sleep(2000);
			
			
   }  
        finally {
            // Close the WebDriver instance
            driver.quit();
        }

}
}





