import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import com.kms.katalon.entity.global.GlobalVariableEntity

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.remote.server.DriverFactory
import org.testng.Assert
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.apache.commons.lang3.RandomUtils as RandomUtils
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

WebUI.navigateToUrl(GlobalVariable.url)

Properties pro = new Properties()
pro.load(new FileInputStream('Files/interviewPortal.properties'))
candidateName= pro.getProperty('InterviewPortalCandidateName')
penelistEmailName= pro.getProperty('PanelistEmailName_1')
penelistName= pro.getProperty('PanelistName_1')


//WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'),
//	penelistEmailName)
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'),
//	GlobalVariable.interviewPanelistPassword)

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'),
	'romgupta@qasource.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'),
	'kz7p4/CQ+93m2i5idrXw6Q==')

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))
WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Mobile Recruitment/i_Mobile Recruitment Platform_fas fa-chevron-down'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Mobile Recruitment/a_Interview Portal'))
WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/button_Clear Filter(s)'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/i_Filters_fa fa-caret-down ml-3'))

WebUI.sendKeys(findTestObject('InterviewPortal/searchCandidateLocator'),  'Simran@yopmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/select_AllNot ScheduledCalendar SharedInter_ca03d5'),
	'Interview Scheduled', true)

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/button_Apply'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/div_dvicFyopmail.com'))
Actions ac = new Actions(driver)

List <WebElement> superElement = driver.findElements(By.cssSelector(GlobalVariable.feedbackPerameterLocator))

//List <WebElement> superElement = driver.findElements(By.cssSelector('.showTab .row [class="form-group p-0"] div'))
int ct=superElement.size()

System.out.println(ct)
for ( WebElement s : superElement)
{
    m= s.getAttribute('class')
	System.out.println(m)
	if (m=='range-wrap') 
	{
	ac.clickAndHold(s).moveToElement(s, 10, 5).build().perform()
	}
	else if(m=='form-control')
    {
	driver.findElement(By.cssSelector(GlobalVariable.rangeRadioButton)).click()		
	}
}
	List <WebElement> TextPerameter = driver. findElements(By.cssSelector(GlobalVariable.feedbackPerameterTextLocator))	
	int countOfText= TextPerameter.size()
	System.out.println(countOfText)
	for (WebElement t: TextPerameter )
	{
		t.sendKeys('Yes')
	}



	
//for (WebElement e : superElement)
//	{
//		
//		if (e.)
//		{
//			ac.clickAndHold(e).moveToElement(e, 0, 0).build().perform()
//		}
//	}
//List <WebElement> elements = driver.findElements(By.cssSelector('input[type="range"]'))
//List <WebElement> elements2 = driver.findElements(By.cssSelector("textarea[class='form-control']"))
//
//
//
//int count = elements.size()
//System.out.println(count)
//for (WebElement e : elements)
//{
//	if (e.isDisplayed()==true)
//	{
//		ac.clickAndHold(e).moveToElement(e, 0, 0).build().perform()
//	} 		
//}
//
//List <WebElement> elements2 = driver.findElements(By.cssSelector("textarea[class='form-control']"))
//int count2 = elements2.size()
//System.out.println(count)
//for (WebElement f : elements2)
//	{
//		if (f.isDisplayed()==true)
//		{
//			f.sendKeys("Yes")
//		}
//	}
	
	
	