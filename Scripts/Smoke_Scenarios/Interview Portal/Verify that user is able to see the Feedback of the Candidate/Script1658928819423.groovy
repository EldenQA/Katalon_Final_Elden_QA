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
import com.kms.katalon.entity.global.GlobalVariableEntity as GlobalVariableEntity
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.remote.server.DriverFactory as DriverFactory
import org.testng.Assert as Assert
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.apache.commons.lang3.RandomUtils as RandomUtils
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.event.KeyEvent as KeyEvent
import java.awt.datatransfer.StringSelection as StringSelection
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

WebUI.navigateToUrl(GlobalVariable.url)

Properties pro = new Properties()

pro.load(new FileInputStream('Files/interviewPortal.properties'))

candidateName = pro.getProperty('InterviewPortalCandidateName')
candidateEmail= pro.getProperty('InterviewPortalCandidateEmail')

penelistEmailName = pro.getProperty('PanelistEmailName_1')

penelistName = pro.getProperty('PanelistName_1')

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'),
	penelistEmailName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'),
GlobalVariable.interviewPanelistPassword)
//WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'),'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/button_Clear Filter(s)'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/i_Filters_fa fa-caret-down ml-3'))

WebUI.sendKeys(findTestObject('InterviewPortal/searchCandidateLocator'), candidateName)

WebUI.selectOptionByValue(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/select_AllNot ScheduledCalendar SharedInter_ca03d5'),
	'Hired', true)

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/button_Apply'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/div_dvicFyopmail.com'))

driver.findElement(By.xpath('//p[text()="HR Evaluation"]')).click()

List <WebElement> feedbackForm = driver.findElements(By.cssSelector('button[type=button]'))
int size= feedbackForm.size()
for (int q=0;q<size;q++)
{
	textFeedBackForm= feedbackForm.get(q).getText()
	System.out.println(textFeedBackForm)
	if(textFeedBackForm.equalsIgnoreCase('Selected'))
	{
		driver.findElement(By.xpath('//p[text()="Technical Evaluation"]')).click()
		break
	}
	else if(textFeedBackForm.equalsIgnoreCase(''))
	{
		driver.findElement(By.xpath('//p[text()="Technical Evaluation"]')).click()
		break
	}
	else {
		throw new IOException('User is not able to see the feedback')
	}
}


List <WebElement> feedbackForm2 = driver.findElements(By.cssSelector('button[type=button]'))
int size2= feedbackForm2.size()
for (int q2=0;q2<size2;q2++)
{
	textFeedBackForm2= feedbackForm2.get(q2).getText()
	System.out.println(textFeedBackForm2)
	if(textFeedBackForm2.equalsIgnoreCase('Selected'))
		{
			driver.findElement(By.xpath('//p[text()="Technical/Managerial Evaluation"]')).click()
			break
		}
		
		else if(textFeedBackForm2.equalsIgnoreCase(''))
			{
				driver.findElement(By.xpath('//p[text()="Technical/Managerial Evaluation"]')).click()
				break
			}
			else {
				throw new IOException('User is not able to see the feedback')
			}
}



List <WebElement> feedbackForm3 = driver.findElements(By.cssSelector('button[type=button]'))
int size3= feedbackForm3.size()
for (int q3=0;q3<size3;q3++)
{
	textFeedBackForm3= feedbackForm3.get(q3).getText()
	System.out.println(textFeedBackForm3)
	if(textFeedBackForm3.equalsIgnoreCase('Hired'))
		{
			System.out.println('User is able to see the Feedback of all rounds ')
			break
		}	
		else if(textFeedBackForm3.equalsIgnoreCase(''))
			{
				System.out.println('User is able to see the Feedback of all rounds')
				break
			}
			else {
				throw new IOException('User is not able to see the feedback')
			}
}
driver.findElement(By.xpath('//p[text()="Technical Evaluation"]')).click()
driver.findElement(By.xpath('//p[text()="HR Evaluation"]')).click()
WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/h4_Atish Sharma'))
WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/a_Logout'))
WebUI.closeBrowser()

