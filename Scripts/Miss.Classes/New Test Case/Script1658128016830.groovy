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
import java.io.BufferedWriter as BufferedWriter

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://mobile-recruit.com/login')

WebUI.setText(findTestObject('Object Repository/french/Page_Mobile Talent  Mobile Recruitment/input_Username_username'), 
    'atsharma@qasource.com')

WebUI.setEncryptedText(findTestObject('Object Repository/french/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    'p4y+y39Ir5NjfX6yBiU+Hw==')

WebUI.click(findTestObject('Object Repository/french/Page_Mobile Talent  Mobile Recruitment/span_Login'))

WebUI.click(findTestObject('Object Repository/french/Page_Mobile Talent  Mobile Recruitment/span_Launch New Job'))

WebUI.setText(findTestObject('Object Repository/french/Page_Mobile Talent  Mobile Recruitment/input__campaignName'), 'firefox')

WebUI.click(findTestObject('Object Repository/french/Page_Mobile Talent  Mobile Recruitment/span_English'))

WebUI.click(findTestObject('Object Repository/french/Page_Mobile Talent  Mobile Recruitment/div_French (FR)'))

