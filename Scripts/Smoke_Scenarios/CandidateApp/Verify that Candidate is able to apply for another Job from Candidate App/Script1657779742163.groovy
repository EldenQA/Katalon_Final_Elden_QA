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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.transform.ThreadInterrupt as ThreadInterrupt
import groovy.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.testng.Assert as Assert
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

Properties pro = new Properties()

JavascriptExecutor js = ((driver) as JavascriptExecutor)

Actions ac = new Actions(driver)

pro.load(new FileInputStream('job.properties'))

JobToApply = pro.getProperty('JobName')

WebUI.setText(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/input_Username_username'), 
    GlobalVariable.candidateAppUser)

WebUI.setEncryptedText(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.candidateAppPassword)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.sendKeys(findTestObject('candidate App/jobSearchLocator'), JobToApply)

WebUI.click(findTestObject('candidate App/searchLocator'))

Thread.sleep(3000)

driver.findElement(By.cssSelector('mat-card-title[class="mat-card-title"]')).click()

driver.findElement(By.xpath('//span[text()=\'Apply Now\']')).click()

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Registration/Page_Software_Testing_geuT_micrositeCapture/zipCodeLocator'), '100')

Thread.sleep(2000)

WebUI.click(findTestObject('Registration/Page_Software_Testing_geuT_micrositeCapture/zipLocationCheckBoxLocator'))

driver.findElement(By.cssSelector('a[class=\'carrot-flat-button ng-scope\']')).click()

CandidateToBeApplied = ('CandidateApp' + RandomStringUtils.randomAlphabetic(4))

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_First Name_id5236'), 
    CandidateToBeApplied)

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_Last Name_id5237'), 
    'AppApply')

email = (('candidateApp' + RandomStringUtils.randomNumeric(4)) + '@yopmail.com')

phoneNumber = ('1325' + RandomStringUtils.randomNumeric(6))

System.out.println(email)

System.out.println(phoneNumber)

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_Email_id5238'), 
    email)

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/div_Mobile Number_iti-flag mx'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/span_India ()'))

driver.findElement(By.cssSelector('input[question=\'Mobile Number\']')).sendKeys(phoneNumber)

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/label_Do you have any degree , Choose one'))

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/selectFirstOptionFromDropdown'))

Thread.sleep(2000)

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/termsAndConditions'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/button_Connect Now'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/p_Thank you for completing this form We loo_f59a68'))

WebUI.verifyElementText(findTestObject('Registration/Page_Software_Testing_geuT_micrositeCapture/thankyouPopupContinueButton'), 
    'Continue')

//js.executeScript('window.open(arguments[0])', GlobalVariable.url)
WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('candidate App/Page_/hambergerIconOnCandidateAppLocator'))

List<WebElement> allListElements = driver.findElements(By.cssSelector('div[class=\'mat-list-text\']'))

int listCount = allListElements.size()

for (int i = 0; i < listCount; i++) {
    textOfALLOptions = allListElements.get(i).getText()

    if (textOfALLOptions.equalsIgnoreCase('Log Out')) {
        allListElements.get(i).click()

        break
    }
}

WebUI.click(findTestObject('candidate App/LoginAfterLogoutLocator'))

WebUI.setText(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/input_Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

driver.findElement(By.cssSelector('a[title=\'Mobile Talent Pool\'] > .ng-scope')).click()

Thread.sleep(2000)

driver.findElement(By.cssSelector('span[data-title= "Search"]')).click()

WebUI.scrollToElement(findTestObject('Send Message(Bot-ON)/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/filterByNameLocator'), 
    2)

WebUI.sendKeys(findTestObject('Send Message(Bot-ON)/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/filterByNameLocator'), 
    CandidateToBeApplied)

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
} else {
    System.out.println('Test Case not passed ')
}

