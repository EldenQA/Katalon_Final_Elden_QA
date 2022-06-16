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
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.WebDriver as WebDriver
WebUI.openBrowser('')

WebUI.navigateToUrl('https://mobile-recruit.com/')
WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()
Actions ac = new Actions(driver)
WebUI.setText(findTestObject('Object Repository/Candidate_Status/Page_Mobile Talent  Mobile Recruitment/input_Username_username'), 
    'romgupta@qasource.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Candidate_Status/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    'kz7p4/CQ+93m2i5idrXw6Q==')

WebUI.click(findTestObject('Object Repository/Candidate_Status/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('Object Repository/Candidate_Status/Page_Mobile Talent  Mobile Recruitment/span_Mobile Talent Pool'))

WebUI.click(findTestObject('Object Repository/Candidate_Status/Page_Mobile Talent  Mobile Recruitment/i_All Candidates_fa fa-search'))

WebUI.click(findTestObject('Object Repository/Candidate_Status/Page_Mobile Talent  Mobile Recruitment/ul_Status_multiselect-search-list_1_2'))

ac.sendKeys(Keys.PAGE_DOWN).perform()
WebUI.click(findTestObject('Object Repository/Candidate_Status/Page_Mobile Talent  Mobile Recruitment/li_Contacted'))
ac.sendKeys(Keys.PAGE_DOWN).perform()
WebUI.click(findTestObject('Object Repository/Candidate_Status/Page_Mobile Talent  Mobile Recruitment/i_Search_fa fa-search'))
Thread.sleep(2000)
ac.sendKeys(Keys.PAGE_UP).perform()

//WebUI.click(findTestObject('Object Repository/Candidate_Status/Page_Mobile Talent  Mobile Recruitment/button_Load more'))

email= WebUI.getText(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/emailLocatorOfNewlyAddedCandidateOnMTP'))
System.out.println(email)

//WebUI.click(findTestObject('Object Repository/Candidate_Status/Page_Mobile Talent  Mobile Recruitment/i_Current Status_fas fa-pen'))


