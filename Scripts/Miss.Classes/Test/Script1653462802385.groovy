import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.swing.ListSelectionModel as ListSelectionModel
import javax.swing.text.html.CSS as CSS
import javax.swing.text.html.FormView as FormView
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
import org.openqa.selenium.remote.DriverCommand as DriverCommand
import org.openqa.selenium.remote.server.DriverFactory as DriverFactory
import org.openqa.selenium.By.ByCssSelector as ByCssSelector
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import java.awt.List as List
import java.io.BufferedReader as BufferedReader
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.openBrowser('')

WebUI.navigateToUrl('https://motzie-staging.mobile-recruit.com/login')

WebUI.setText(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/input_Username_username'), 
    'romgupta@qasource.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    'kz7p4/CQ+93m2i5idrXw6Q==')

WebUI.click(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/span_Administration'))

WebUI.click(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/span_Manage Accounts'))

WebUI.setText(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/input_Create New Account_form-control ng-pr_ad5695'), 
    'Test Account')

WebUI.click(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/i_Create New Account_fa fa-search'))

WebUI.click(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/i_QA Testing Team_fa fa-cogs fa-lg icon-gre_e7871b'))

WebUI.click(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/label_No'))

