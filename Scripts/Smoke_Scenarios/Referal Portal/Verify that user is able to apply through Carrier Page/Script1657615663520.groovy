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
import internal.GlobalVariable
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.commons.lang.RandomStringUtils
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebDriver driver = DriverFactory.getWebDriver()

Actions ac = new Actions(driver)

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

Properties pro = new Properties()

pro.load(new FileInputStream('job.properties'))

Jobname = pro.getProperty('JobName')

WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Mobile Talent  Mobile Recruitment/input_Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Account_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

//WebElement drop = driver.findElement(By.cssSelector("a[title='Administration']"))
driver.findElement(By.cssSelector('a[title=\'Administration\']')).click()

//action.moveToElement(drop).perform()
List<WebElement> dropdownValues = driver.findElements(By.cssSelector('ul[class=\'dropdown-menu\'] li a'))

int dropdownValuesCount = dropdownValues.size()

for (int i = 0; i < dropdownValuesCount; i++) {
    dropdownText = dropdownValues.get(i).getText()

    if (dropdownText.equalsIgnoreCase('Manage Career Page')) {
        dropdownValues.get(i).click()

        break
    }
}

WebUI.click(findTestObject('CarrierPage/PreviewCarrierPageLocator'))

WebUI.switchToWindowIndex(1)

WebUI.sendKeys(findTestObject('CarrierPage/JobSearchLocator'), Jobname)

WebUI.click(findTestObject('CarrierPage/SearchLocator'))

WebUI.scrollToElement(findTestObject('CarrierPage/ApplyButtonLocator'), 2)

WebUI.click(findTestObject('CarrierPage/ApplyButtonLocator'))

WebUI.switchToWindowIndex(2)

WebUI.setText(findTestObject('Registration/Page_Software_Testing_geuT_micrositeCapture/zipCodeLocator'), '100')

Thread.sleep(2000)

WebUI.click(findTestObject('Registration/Page_Software_Testing_geuT_micrositeCapture/zipLocationCheckBoxLocator'))

driver.findElement(By.cssSelector('a[class=\'carrot-flat-button ng-scope\']')).click()
CarrierPageCandidate = (('carrier' + RandomStringUtils.randomAlphabetic(4)))
WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_First Name_id5236'),
	CarrierPageCandidate)

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_Last Name_id5237'),
	'CarrierPage')

email = (('carrier' + RandomStringUtils.randomAlphabetic(4)) + '@yopmail.com')

System.out.println(CarrierPageCandidate)
System.out.println(email)
WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_Email_id5238'),
	email)

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/div_Mobile Number_iti-flag mx'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/span_India ()'))

driver.findElement(By.cssSelector('input[question=\'Mobile Number\']')).sendKeys('1325' + RandomStringUtils.randomNumeric(
		6))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/label_Do you have any degree , Choose one'))

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/selectFirstOptionFromDropdown'))

Thread.sleep(2000)

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/termsAndConditions'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/button_Connect Now'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/p_Thank you for completing this form We loo_f59a68'))

WebUI.verifyElementText(findTestObject('Registration/Page_Software_Testing_geuT_micrositeCapture/thankyouPopupContinueButton'),
	'Continue')

WebUI.switchToWindowIndex(0)

//driver.findElement(By.cssSelector('.modal-dialog.modal-large .close')).click()

driver.findElement(By.cssSelector('a[title=\'Mobile Talent Pool\'] > .ng-scope')).click()

Thread.sleep(2000)

driver.findElement(By.cssSelector('span[data-title= "Search"]')).click()

WebUI.scrollToElement(findTestObject('Send Message(Bot-ON)/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/filterByNameLocator'),
	2)

WebUI.sendKeys(findTestObject('Send Message(Bot-ON)/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/filterByNameLocator'),
	CarrierPageCandidate)

WebUI.scrollToElement(findTestObject('Send Message(Bot-ON)/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/searchLocator'),
	2)

WebUI.click(findTestObject('Send Message(Bot-ON)/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/searchLocator'))

WebUI.scrollToElement(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/emailOnMTP'), 3)

for (int k = 0; k <= 4; k++) {
	ac.sendKeys(Keys.PAGE_DOWN).perform()
}

emailAddress = WebUI.getText(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/emailOnMTP'))

System.out.println(emailAddress)

if (emailAddress == email) {
System.out.println('Test Case passed ')
WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/i_Romit Romit_fas fa-caret-down caret-down-arrow'))
WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/span_Logout'))
WebUI.closeBrowser()
}
else {
	System.out.println('Test Case not passed ')	
}
