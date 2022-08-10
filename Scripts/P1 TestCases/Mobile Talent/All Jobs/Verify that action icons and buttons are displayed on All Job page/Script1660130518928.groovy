import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.util.concurrent.ConcurrentHashMap.KeySetView as KeySetView
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.remote.server.DriverFactory as DriverFactory
import org.openqa.selenium.support.ui.Select as Select
import org.testng.Assert as Assert
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

//




WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

Actions ac = new Actions(driver)

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'),
  GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'),
  GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

driver.findElement(By.xpath('//span[text()=\'All Jobs\']')).click()
List < WebElement > buttonsOnDashboard = driver.findElements(By.cssSelector('tbody > tr:nth-of-type(1) i[data-title]'))
int buttonsOnDashboardSize = buttonsOnDashboard.size()
System.out.println(buttonsOnDashboardSize)
for (int i = 0; i < buttonsOnDashboardSize; i++) {
  attribute = buttonsOnDashboard.get(i).getAttribute('data-title')

  System.out.println(attribute)

  if (attribute.equalsIgnoreCase("View Microsite")) {
    Assert.assertEquals(attribute, 'View Microsite', 'Attribute is not present')
  } else if (attribute.equalsIgnoreCase('Analytics')) {
    Assert.assertEquals(attribute, 'Analytics', 'Attribute is not present')
  } else if (attribute.equalsIgnoreCase('Edit Campaign')) {
    Assert.assertEquals(attribute, 'Edit Campaign', 'Attribute is not presentt')
  } 
  else if (attribute.equalsIgnoreCase('Duplicate Campaign')) {
    Assert.assertEquals(attribute, 'Duplicate Campaign', 'Attribute is not presentt')
  
  }
  else if (attribute.equalsIgnoreCase('Assign Job')) {
    Assert.assertEquals(attribute, 'Assign Job', 'Attribute is not present')
  } else if (attribute.equalsIgnoreCase('Complete Campaign')) {
    Assert.assertEquals(attribute, 'Complete Campaign', 'Attribute is not present')
  }  else if (attribute.equalsIgnoreCase('Manage Candidate Source')) {
    Assert.assertEquals(attribute, 'Manage Candidate Source', 'Attribute is not present')
  }
  else if(attribute.equalsIgnoreCase('Survey'))
  {
	  Assert.assertEquals(attribute, 'Survey', 'Attribute is not present')
	  break
	  }
else {
    throw new IOException('Attribute is not present ')
  }
}

List < WebElement > buttonsOnDashboardBoostSMS = driver.findElements(By.cssSelector('tbody > tr:nth-of-type(1) span'))
int buttonsOnDashboardBoostSMSSize = buttonsOnDashboardBoostSMS.size()
System.out.println(buttonsOnDashboardBoostSMSSize)
for (int j = 0; j < buttonsOnDashboardBoostSMSSize; j++) 

{
  text = buttonsOnDashboardBoostSMS.get(j).getText()
  System.out.println(text)
  if (text.equalsIgnoreCase('Boost')) 
{
    Assert.assertEquals(text, 'Boost', 'Attribute is not present')
} 
  
  else if (text.equalsIgnoreCase('Enabled') || (text.equalsIgnoreCase('Enable')))
	   {
         System.out.println('Attribute is present')
		 break
       }
  }
    WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))

    WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))
	WebUI.closeBrowser()
 