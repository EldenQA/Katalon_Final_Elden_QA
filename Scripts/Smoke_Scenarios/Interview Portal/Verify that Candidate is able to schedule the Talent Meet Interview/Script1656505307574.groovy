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
import org.testng.Assert as Assert
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

pro.load(new FileInputStream('Files/interviewPortal.properties'))

candidateName = pro.getProperty('InterviewPortalCandidateName')

penelistEmailName = pro.getProperty('PanelistEmailName_1')

penelistName = pro.getProperty('PanelistName_1')

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Mobile Recruitment/i_Mobile Recruitment Platform_fas fa-chevron-down'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Mobile Recruitment/a_Interview Portal'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/button_Clear Filter(s)'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/i_Filters_fa fa-caret-down ml-3'))

WebUI.sendKeys(findTestObject('InterviewPortal/searchCandidateLocator'), candidateName)

WebUI.selectOptionByValue(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/select_AllNot ScheduledCalendar SharedInter_ca03d5'), 
    'Not Scheduled', true)

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/button_Apply'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/div_dvicFyopmail.com'))

driver.findElement(By.cssSelector('input[title=\'Set as primary\']')).click()

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/TaletMeetCommunicationMode'))

WebUI.verifyElementText(findTestObject('InterviewPortal/successMessageAfterChangingTheMode'), 'Interview comunication mode changed successfully.')

List<WebElement> allbuttons = driver.findElements(By.cssSelector('[class="btn btn btn-primary ml-3"]'))

int sizeNumber = allbuttons.size()

for (int j = 0; j < sizeNumber; j++) {
    String textOFbuttons = allbuttons.get(j).getText()

    System.out.println(textOFbuttons)

    if (textOFbuttons.equalsIgnoreCase('Schedule Interview')) {
        allbuttons.get(j).click()

        break
    }
}

WebUI.click(findTestObject('Object Repository/InterviewPortal/yesbuttonOnSceduleInterviewPopup'))

WebUI.scrollToElement(findTestObject('Object Repository/InterviewPortal/emailOfTheCandidateLocator'), 2)

email = WebUI.getText(findTestObject('Object Repository/InterviewPortal/emailOfTheCandidateLocator'))

WebUI.verifyTextPresent('Interview booking link shared with candidate.', true)

    ((driver) as JavascriptExecutor).executeScript('window.open(arguments[0])', 'https://yopmail.com/en/')

WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl('https://yopmail.com/en/')

WebUI.setText(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_YOPmail - Disposable Email Address/input_Type the Email name of your choice_login'), 
    email)

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_YOPmail - Disposable Email Address/i_'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Inbox/span_Show pictures'))

WebUI.switchToWindowTitle('Inbox')

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Inbox/a_Book Now'))

WebUI.switchToWindowIndex(2)

Thread.sleep(18000)

WebUI.waitForElementClickable(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/dayLocatorOnCandidateStandelonePageForIP'), 
    8)

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/dayLocatorOnCandidateStandelonePageForIP'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Yopmail.com/forwardIconLocator'))

WebUI.click(findTestObject('Yopmail.com/FirstSlotBooking'))

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

WebUI.sendKeys(findTestObject('InterviewPortal/searchCandidateLocator'), candidateName)

WebUI.selectOptionByValue(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/select_AllNot ScheduledCalendar SharedInter_ca03d5'), 
    'Interview Scheduled', true)

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/button_Apply'))

List<WebElement> candidateInformationElements = driver.findElements(By.cssSelector('div[class=\'td-text\']'))

int candidateInformationElementsCount = candidateInformationElements.size()

for (int p = 0; p <= candidateInformationElementsCount; p++) {
    candidateInformationElementsText = candidateInformationElements.get(p).getText()

    System.out.println(candidateInformationElementsText)

    if (candidateInformationElementsText.equalsIgnoreCase((candidateName + ' ') + candidateName)) {
        candidateInformationElements.get(p).click()

        break
    }
}

WebUI.verifyElementNotPresent(findTestObject('InterviewPortal/scheduleButtonLocator'), 2)
((driver) as JavascriptExecutor).executeScript('window.open(arguments[0])', 'https://yopmail.com/en/')
WebUI.switchToWindowIndex(1)
WebUI.setText(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_YOPmail - Disposable Email Address/input_Type the Email name of your choice_login'),
	penelistEmailName)

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_YOPmail - Disposable Email Address/i_'))
WebUI.takeScreenshot('ScreenShots/InterviewPortalBookingEmail/TalentMeet/screenshot_'+ System.currentTimeMillis() + '.jpg')
WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/h4_Atish Sharma'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/a_Logout'))

WebUI.closeBrowser()

