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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

Properties pro = new Properties()

Actions ac = new Actions(driver)

pro.load(new FileInputStream('job.properties'))

keyValue = pro.getProperty('JobName')


Properties pro2 = new Properties()
FileWriter fw2 = new FileWriter("Files/interviewPortal.properties");
penelistEmailName = (('IP1' + RandomStringUtils.randomAlphabetic(7)) + '@yopmail.com')
penelistName = ('A' + RandomStringUtils.randomAlphabetic(7))
penelistEmailName_2 = (('IP2' + RandomStringUtils.randomAlphabetic(7)) + '@yopmail.com')
penelistName_2 = ('A2' + RandomStringUtils.randomAlphabetic(7))
pro2.setProperty("PanelistEmailName_1" ,penelistEmailName )
pro2.setProperty("PanelistName_1" ,penelistName )
pro2.setProperty("InterviewPortalCandidateName" ,'A' + RandomStringUtils.randomAlphabetic(7) )
pro2.setProperty("InterviewPortalCandidateEmail" ,('Int' + RandomStringUtils.randomAlphabetic(6)) + '@yopmail.com' )
pro2.store(fw2, "comments")
pro2.load(new FileInputStream('Files/interviewPortal.properties'))
interviewPortalCandidateName = pro2.getProperty('InterviewPortalCandidateName');
interviewPortalCandidateEmail =pro2.getProperty('InterviewPortalCandidateEmail');


WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

driver.findElement(By.xpath('//span[text()=\'All Jobs\']')).click()

Thread.sleep(2000)

driver.findElement(By.cssSelector('span[data-title=\'Search\']')).click()

WebElement element2 = driver.findElement(By.xpath('//*[@id=\'jobTitle\']'))

element2.sendKeys(keyValue)

for (int i = 0; i <= 2; i++) {
    ac.sendKeys(Keys.PAGE_DOWN).perform()
}

WebUI.click(findTestObject('Object Repository/Registration/Page_Mobile Talent  Mobile Recruitment/i_Search_fa fa-search'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Mobile Talent  Mobile Recruitment/div_Software_Testing_geuT'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Mobile Talent  Mobile Recruitment/micrositeLinkLocator'))

WebUI.switchToWindowIndex(1)

ac.sendKeys(Keys.PAGE_DOWN).perform()

WebUI.setText(findTestObject('Registration/Page_Software_Testing_geuT_micrositeCapture/zipCodeLocator'), '100')

Thread.sleep(2000)

WebUI.click(findTestObject('Registration/Page_Software_Testing_geuT_micrositeCapture/zipLocationCheckBoxLocator'))

driver.findElement(By.cssSelector('a[class=\'carrot-flat-button ng-scope\']')).click()

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_First Name_id5236'), 
    interviewPortalCandidateName)

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_Last Name_id5237'), 
    interviewPortalCandidateName)


WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_Email_id5238'), 
    interviewPortalCandidateEmail)

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/div_Mobile Number_iti-flag mx'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/span_India ()'))

driver.findElement(By.cssSelector('input[question=\'Mobile Number\']')).sendKeys('01970' + RandomStringUtils.randomNumeric(
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

driver.findElement(By.cssSelector('.modal-dialog.modal-large .close')).click()

driver.findElement(By.cssSelector('a[title=\'Mobile Talent Pool\'] > .ng-scope')).click()

Thread.sleep(2000)

WebUI.scrollToElement(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/emailOnMTP'), 3)

for (int i = 0; i <= 4; i++) {
    ac.sendKeys(Keys.PAGE_DOWN).perform()
}

emailAddress = WebUI.getText(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/emailOnMTP'))

System.out.println(emailAddress)

if (emailAddress == interviewPortalCandidateEmail) {
    WebUI.scrollToElement(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/clickOnCandidateStatus'), 
        2)
}

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/clickOnCandidateStatus'))

List<WebElement> allStatus = driver.findElements(By.cssSelector('a span[class =\'value-text ng-scope\']'))

int count = allStatus.size()

System.out.println(count)

for (int i = 0; i <= count; i++) {
    status = allStatus.get(i).getText()

    System.out.println(status)

    if (status.equalsIgnoreCase('Shortlisted')) {
        allStatus.get(i).click()

        break
    }
}
Thread.sleep(10000)
WebUI.scrollToElement(findTestObject('MTP Locators/switchToInterviewPanelLocator'), 2)

WebUI.click(findTestObject('MTP Locators/switchToInterviewPanelLocator'))

WebUI.verifyElementText(findTestObject('Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/CalanderLinkOnIP'), 
    'Calendar')

WebUI.closeBrowser()

