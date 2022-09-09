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
import org.apache.commons.lang3.RandomUtils as RandomUtils
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

WebUI.navigateToUrl(GlobalVariable.url)

Properties pro = new Properties()

Properties pro2 = new Properties()

Actions ac = new Actions(driver)

pro.load(new FileInputStream('job.properties'))

pro2.load(new FileInputStream('Files/interviewPortal.properties'))

keyValue = pro.getProperty('JobName')

panelistName = pro2.getProperty('PanelistName_1')
panelistEmail = pro2.getProperty('PanelistEmailName_1')

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

for (int l = 0; l <= 2; l++) {
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

interViewCad = ('A' + RandomStringUtils.randomAlphabetic(7))

interviewMail = (('IP1' + RandomStringUtils.randomAlphabetic(7)) + '@yopmail.com')

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_First Name_id5236'), 
    interViewCad)

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_Last Name_id5237'), 
    interViewCad)

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_Email_id5238'), 
    interviewMail)

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/div_Mobile Number_iti-flag mx'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/span_India ()'))

driver.findElement(By.cssSelector('input[question=\'Mobile Number\']')).sendKeys('112' + RandomStringUtils.randomNumeric(
        7))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/label_Do you have any degree , Choose one'))

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/selectFirstOptionFromDropdown'))

Thread.sleep(2000)

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/termsAndConditions'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/button_Connect Now'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/p_Thank you for completing this form We loo_f59a68'))

WebUI.verifyElementText(findTestObject('Registration/Page_Software_Testing_geuT_micrositeCapture/thankyouPopupContinueButton'), 
    'Continue')
WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

driver.findElement(By.cssSelector('.modal-dialog.modal-large .close')).click()

driver.findElement(By.cssSelector('a[title=\'Mobile Talent Pool\'] > .ng-scope')).click()

Thread.sleep(2000)

WebUI.click(findTestObject('MTP Locators/searchFilterOnCPPLocator'))

WebUI.scrollToElement(findTestObject('MTP Locators/filterByNameLocator'), 1)

WebUI.sendKeys(findTestObject('MTP Locators/filterByNameLocator'), interViewCad)

WebUI.scrollToElement(findTestObject('MTP Locators/searchLocator'), 1)

WebUI.click(findTestObject('MTP Locators/searchLocator'))

WebUI.scrollToElement(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/emailOnMTP'), 3)

for (int i = 0; i <= 4; i++) {
    ac.sendKeys(Keys.PAGE_DOWN).perform()
}

emailAddress = WebUI.getText(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/emailOnMTP'))

System.out.println(emailAddress)

if (emailAddress == interviewMail) {
    WebUI.scrollToElement(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/clickOnCandidateStatus'), 
        2)
}

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/clickOnCandidateStatus'))

List<WebElement> allStatus = driver.findElements(By.cssSelector('a span[class =\'value-text ng-scope\']'))

int count = allStatus.size()

System.out.println(count)

for (int j = 0; j <= count; j++) {
    status = allStatus.get(j).getText()

    System.out.println(status)

    if (status.equalsIgnoreCase('Shortlisted')) {
        allStatus.get(j).click()

        break
    }
}

Thread.sleep(10000)

WebUI.scrollToElement(findTestObject('MTP Locators/switchToInterviewPanelLocator'), 2)

WebUI.click(findTestObject('MTP Locators/switchToInterviewPanelLocator'))

WebUI.click(findTestObject('Object Repository/InterviewPortal/skypeCommunicationModeLocator'))

WebUI.verifyElementText(findTestObject('InterviewPortal/successMessageAfterChangingTheMode'), 'Interview comunication mode changed successfully.')

WebUI.sendKeys(findTestObject('Yopmail.com/interviewPanelistSearchLocator'), panelistName)

WebUI.click(findTestObject('InterviewPortal/selectFirstInterviewPanelistAfterSearching'))

List<WebElement> allbuttons = driver.findElements(By.cssSelector('button[type="button"]'))

int sizeNumber = allbuttons.size()

for (int k = 0; k < sizeNumber; k++) {
    String textOFbuttons = allbuttons.get(k).getText()

    System.out.println(textOFbuttons)

    if (textOFbuttons.equalsIgnoreCase('Schedule Interview')) {
        allbuttons.get(k).click()

        break
    }
}

WebUI.click(findTestObject('Object Repository/InterviewPortal/yesbuttonOnSceduleInterviewPopup'))

WebUI.scrollToElement(findTestObject('Object Repository/InterviewPortal/emailOfTheCandidateLocator'), 2)

//email = WebUI.getText(findTestObject('Object Repository/InterviewPortal/emailOfTheCandidateLocator'))

WebUI.verifyTextPresent('Interview booking link shared with candidate.', true)

    ((driver) as JavascriptExecutor).executeScript('window.open(arguments[0])', 'https://yopmail.com/en/')

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_YOPmail - Disposable Email Address/input_Type the Email name of your choice_login'), 
    interviewMail)

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_YOPmail - Disposable Email Address/i_'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/Page_Inbox/span_Show pictures'))

WebUI.switchToWindowTitle('Inbox')

WebUI.click(findTestObject('Object Repository/Yopmail.com/Page_Inbox/a_Book Now'))

WebUI.switchToWindowIndex(2)

Thread.sleep(18000)

WebUI.waitForElementClickable(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/dayLocatorOnCandidateStandelonePageForIP'), 
    8)

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/dayLocatorOnCandidateStandelonePageForIP'), 
    FailureHandling.STOP_ON_FAILURE)

for (int z= 0;z<=1;z++)
{
	WebUI.click(findTestObject('Yopmail.com/forwardIconLocator'))
}

WebUI.click(findTestObject('Yopmail.com/FirstSlotBooking'))

WebUI.sendKeys(findTestObject('InterviewPortal/skypeInputBoxOnCandidateStandelonePage'), '@AutoSkype')

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/div_Thank YouYour slot has been booked forJ_f0af19'))
WebUI.closeWindowIndex(2)
WebUI.closeWindowIndex(1)
WebUI.switchToWindowIndex(0)

driver.navigate().refresh()

List<WebElement> tabsOnInterviewPortal = driver.findElements(By.cssSelector('li[class="nav-item "]'))

int tabsOnInterviewPortalCount = tabsOnInterviewPortal.size()

for (int o = 0; o <= tabsOnInterviewPortalCount; o++) {
    tabsOnInterviewPortaltext = tabsOnInterviewPortal.get(o).getText()

    if (tabsOnInterviewPortaltext.equalsIgnoreCase('Candidates')) {
        tabsOnInterviewPortal.get(o).click()

        break
    }
}

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/button_Clear Filter(s)'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/i_Filters_fa fa-caret-down ml-3'))

WebUI.sendKeys(findTestObject('InterviewPortal/searchCandidateLocator'), interViewCad)

WebUI.selectOptionByValue(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/select_AllNot ScheduledCalendar SharedInter_ca03d5'), 
    'Interview Scheduled', true)

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/button_Apply'))

List<WebElement> candidateInformationElements = driver.findElements(By.cssSelector('div[class=\'td-text\']'))

int candidateInformationElementsCount = candidateInformationElements.size()

for (int r = 0; r <= candidateInformationElementsCount; r++) {
    candidateInformationElementsText = candidateInformationElements.get(r).getText()

    System.out.println(candidateInformationElementsText)

    if (candidateInformationElementsText.equalsIgnoreCase((interViewCad + ' ') + interViewCad)) {
        candidateInformationElements.get(r).click()

        break
    }
}
List<WebElement> allbuttonsa = driver.findElements(By.cssSelector('button[type="button"]'))

int sizeNumbera = allbuttonsa.size()
for (int a = 0; a < sizeNumbera; a++) {
	String textOFbuttonsa = allbuttonsa.get(a).getText()

	System.out.println(textOFbuttonsa)

	if (textOFbuttonsa.equalsIgnoreCase('Schedule Interview')) {
		 System.out.println(" Interview is not booked ")
		 
		 }else {
			 System.out.println(" Interview is booked ")
		 break
			 }
}
//WebUI.verifyElementNotPresent(findTestObject('InterviewPortal/scheduleButtonLocator'), 2)
((driver) as JavascriptExecutor).executeScript('window.open(arguments[0])', 'https://yopmail.com/en/')
WebUI.switchToWindowIndex(1)
WebUI.setText(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_YOPmail - Disposable Email Address/input_Type the Email name of your choice_login'),
	panelistEmail)
WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_YOPmail - Disposable Email Address/i_'))

WebUI.takeScreenshot('ScreenShots/InterviewPortalBookingEmail/Skype/screenshot_'+ System.currentTimeMillis() + '.jpg')
WebUI.switchToWindowIndex(0)
WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/h4_Atish Sharma'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/a_Logout'))

WebUI.closeBrowser()

