import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.thoughtworks.selenium.webdriven.commands.Click as Click
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.remote.server.DriverFactory as DriverFactory
import org.openqa.selenium.remote.server.handler.SendKeys as SendKeys
import org.testng.Assert as Assert
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

JavascriptExecutor js = ((driver) as JavascriptExecutor)
Actions ac = new Actions(driver)
Robot rb = new Robot()

Properties pro = new Properties()
Properties pro3 = new Properties()

pro.load(new FileInputStream('job.properties'))
pro3.load(new FileInputStream('Files/interviewPortal.properties'))

InterviewPanelist = pro3.getProperty('PanelistEmailName_1')

Jobname = pro.getProperty('JobName')

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'), 
    InterviewPanelist)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.interviewPanelistPassword)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('InterviewPortal/navigatorDropdown'))

WebUI.click(findTestObject('InterviewPortal/selectReferalPortal'))

Thread.sleep(2000)

WebUI.click(findTestObject('Referal Portal/closeReferralPopup'))

WebUI.click(findTestObject('Referal Portal/UniversalLinkLocator'))

js.executeScript('window.open(arguments[0])', 'https://www.wikihow.com/Use-Google-to-Search-Within-a-Specific-Website')

WebUI.switchToWindowIndex(1)

driver.findElement(By.cssSelector('input[role= \'textbox\']')).click()

rb.keyPress(KeyEvent.VK_CONTROL)

rb.keyPress(KeyEvent.VK_V)

rb.keyRelease(KeyEvent.VK_V)

Thread.sleep(2000)

driver.findElement(By.cssSelector('button[type=\'submit\']')).click()

WebElement text = driver.findElement(By.cssSelector('input[role= \'textbox\']'))

link = text.getAttribute('value')

System.out.println(link)

js.executeScript('window.open(arguments[0])', link)

WebUI.switchToWindowIndex(2)

WebUI.sendKeys(findTestObject('CarrierPage/JobSearchLocator'), Jobname)

WebUI.click(findTestObject('CarrierPage/SearchLocator'))

WebUI.scrollToElement(findTestObject('CarrierPage/ReferAFriendButtonOuter'), 2)

WebUI.click(findTestObject('CarrierPage/ReferAFriendButtonOuter'))

email = (('refer' + RandomStringUtils.randomNumeric(4)) + '@yopmail.com')
UniversalName= 'Universal'+RandomStringUtils.randomNumeric(6)

System.out.println(email)

phoneNumber = ('1325' + RandomStringUtils.randomNumeric(6))

System.out.println(phoneNumber)

WebUI.sendKeys(findTestObject('CarrierPage/ReferOuterFirstName'), UniversalName)

WebUI.sendKeys(findTestObject('CarrierPage/ReferOuterLastName'), 'yadav')

WebUI.sendKeys(findTestObject('CarrierPage/ReferOuterEmail'), email)

WebUI.click(findTestObject('CarrierPage/SelectFlagLocator'))

WebUI.click(findTestObject('CarrierPage/IndiaLocator'))

WebUI.sendKeys(findTestObject('CarrierPage/phoneNumber'), phoneNumber)

WebUI.click(findTestObject('CarrierPage/SubmitButton'))

successMessage = WebUI.getText(findTestObject('CarrierPage/SuccessMessage'))

if (successMessage.equalsIgnoreCase('Details Submitted Successfully')) {
	System.out.println('Candidate is  refered')
	WebUI.click(findTestObject('CarrierPage/CancelPopup'))
	
}
else
{
	System.out.println('Candidate is not refered')
}
WebUI.click(findTestObject('CarrierPage/JobSearchLocator'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https:yopmail.com/en/')
WebDriver driver2 = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()
Actions ac2 = new Actions(driver2)
WebUI.setText(findTestObject('Object Repository/Yopmail.com/input_Type the Email name of your choice_login'),
	email)

WebUI.click(findTestObject('Object Repository/Yopmail/Page_YOPmail - Disposable Email Address/i_'))

WebUI.click(findTestObject('Object Repository/Yopmail/Page_Inbox/span_Show pictures'))

WebUI.switchToWindowTitle('Inbox')


//WebElement mailTitle = driver2.findElement(By.cssSelector("div[class='ellipsis nw b f18']"))
//mailTitleText= mailTitle.getText()
//System.out.println('Mail Title is =' + mailTitleText)
for (int j = 0; j <= 5; j++) {
	ac2.sendKeys(Keys.TAB).perform()
}

ac2.sendKeys(Keys.TAB.ENTER).perform()

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Registration/Page_Software_Testing_geuT_micrositeCapture/zipCodeLocator'), '100')

Thread.sleep(2000)

WebUI.click(findTestObject('Registration/Page_Software_Testing_geuT_micrositeCapture/zipLocationCheckBoxLocator'))

driver2.findElement(By.cssSelector('a[class=\'carrot-flat-button ng-scope\']')).click()

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_First Name_id5236'),
	UniversalName)

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_Last Name_id5237'),
	'yadav')


WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_Email_id5238'),
	email)

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/div_Mobile Number_iti-flag mx'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/span_India ()'))

driver2.findElement(By.cssSelector('input[question=\'Mobile Number\']')).sendKeys(phoneNumber)

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/label_Do you have any degree , Choose one'))

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/selectFirstOptionFromDropdown'))

Thread.sleep(2000)

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/termsAndConditions'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/button_Connect Now'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/p_Thank you for completing this form We loo_f59a68'))

WebUI.verifyElementText(findTestObject('Registration/Page_Software_Testing_geuT_micrositeCapture/thankyouPopupContinueButton'),
	'Continue')

WebUI.closeBrowser()
Thread.sleep(2000)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)
WebDriver driver3 = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()
WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'),
	GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'),
	GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

driver3.findElement(By.cssSelector('a[title=\'Mobile Talent Pool\'] > .ng-scope')).click()

Thread.sleep(2000)

WebUI.click(findTestObject('MTP Locators/searchFilterOnCPPLocator'))

WebUI.scrollToElement(findTestObject('MTP Locators/filterByNameLocator'), 1)

WebUI.sendKeys(findTestObject('MTP Locators/filterByNameLocator'), UniversalName)

WebUI.scrollToElement(findTestObject('MTP Locators/searchLocator'), 1)

WebUI.click(findTestObject('MTP Locators/searchLocator'))

WebUI.scrollToElement(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/clickOnCandidateStatus'), 2)

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/clickOnCandidateStatus'))

List<WebElement> allStatus = driver3.findElements(By.cssSelector('a span[class =\'value-text ng-scope\']'))

int count = allStatus.size()

System.out.println(count)

for (int j = 0; j <= count; j++) {
	status = allStatus.get(j).getText()

	System.out.println(status)

	if (status.equalsIgnoreCase('Joined')) {
		allStatus.get(j).click()

		break
	}
}
WebUI.scrollToElement(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/clickOnCandidateStatus'), 2)

WebUI.verifyElementText(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/clickOnCandidateStatus'), 'Joined')

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))
WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebDriver driver4 = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'), 
    InterviewPanelist)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.interviewPanelistPassword)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('InterviewPortal/navigatorDropdown'))

WebUI.click(findTestObject('InterviewPortal/selectReferalPortal'))

Thread.sleep(2000)

WebUI.click(findTestObject('Referal Portal/closeReferralPopup'))

List<WebElement> listOfAllElemenets = driver4.findElements(By.cssSelector('li[class=\'nav-item \']'))

int size = listOfAllElemenets.size()

for (int i = 0; i < size; i++) {
    textr = listOfAllElemenets.get(i).getText()

    if (textr.equalsIgnoreCase('Referral(s)')) {
        listOfAllElemenets.get(i).click()

        break
    }
}

WebUI.sendKeys(findTestObject('Referal Portal/searchJobLocator'), email)

WebElement listOfElements3 = driver4.findElement(By.cssSelector('tr:nth-of-type(1) > td:nth-of-type(7) > .badge.badge-primary'))

status = listOfElements3.getText()

System.out.println('Status of the Candidate' + status)

List<WebElement> listOfElements2 = driver4.findElements(By.cssSelector('tr>td:nth-of-type(4)'))

int sizeofElements = listOfElements2.size()

for (int j = 0; j < sizeofElements; j++) {
    textofElements = listOfElements2.get(j).getText()

    System.out.println(textofElements)

    if (textofElements.equalsIgnoreCase(email) && status.equalsIgnoreCase('Joined')) {
        driver4.findElement(By.cssSelector('.dropdown-toggle.pointer > h4')).click()
        driver4.findElement(By.cssSelector('.dropdown-item.pointer')).click()
		WebUI.closeBrowser()

        break
    } else {
        throw new IOException('Status is not same')
    }
}