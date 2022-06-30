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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.remote.server.DriverFactory as DriverFactory
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.navigateToUrl('https://yopmail.com/en/')

//WebUI.navigateToUrl('https://yopmail.com/en/')

WebUI.setText(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_YOPmail - Disposable Email Address/input_Type the Email name of your choice_login'),
	"dahsd@yopmail.com")

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_YOPmail - Disposable Email Address/i_'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Inbox/span_Show pictures'))

WebUI.switchToWindowTitle('Inbox')

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Inbox/a_Book Now'))

WebUI.switchToWindowIndex(1)

//window= WebUI.getWindowTitle()
//WebUI.navigateToUrl("https://mobile-recruit.com/interview-portal/candidate-calendar?token=2293746f11")


Thread.sleep(15000)

WebUI.waitForElementClickable(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/div_271100 AMBusy'),
	5)

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/div_271100 AMBusy'),
	FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Yopmail.com/forwardIconLocator'))

WebUI.click(findTestObject('Yopmail.com/FirstSlotBooking'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/div_Thank YouYour slot has been booked forJ_f0af19'))

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/div_Interview booked at  June 27th 2022 fro_9e7afc'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/h4_Atish Sharma'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/a_Logout'))