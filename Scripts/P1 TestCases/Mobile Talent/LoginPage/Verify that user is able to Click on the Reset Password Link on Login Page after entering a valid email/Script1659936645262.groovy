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
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebDriver driver = DriverFactory.getWebDriver()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('LoginPage/resetTextLinkLocator'))

WebUI.sendKeys(findTestObject('LoginPage/emailInputBoxOnResetPasswordEmail'), GlobalVariable.userName)

WebUI.verifyElementPresent(findTestObject('LoginPage/resetPasswordButtonLocator'), 2)

WebUI.click(findTestObject('LoginPage/resetPasswordButtonLocator'))

successMessage = WebUI.getText(findTestObject('LoginPage/successMessageAfterReset'), FailureHandling.STOP_ON_FAILURE)
System.out.println(successMessage)
if (successMessage.contains('\n'))
{
	String [] a = successMessage.split('\n');
	for(String p:a)
	{
		System.out.println(p)
		if (p.equalsIgnoreCase('We have sent you an email with a link and information on how to reset your password.'))
		{
			System.out.println('Email_Sent')
			break
		}
	}	
}	
WebUI.closeBrowser()

