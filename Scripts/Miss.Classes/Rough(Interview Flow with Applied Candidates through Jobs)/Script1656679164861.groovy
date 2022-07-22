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

WebUI.callTestCase(findTestCase('Smoke_Scenarios/Interview Portal/Dependent TestCases/Verify that user is able to Shortlist the Candidate'), 
[:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()
Properties pro = new Properties()

pro.load(new FileInputStream('job.properties'))

keyValue = pro.getProperty('JobName')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Mobile Recruitment/i_Mobile Recruitment Platform_fas fa-chevron-down'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Mobile Recruitment/a_Interview Portal'))

WebUI.click(findTestObject('InterviewPortal/JobsLocator'))

WebUI.click(findTestObject('InterviewPortal/searchJobLocator'))

WebUI.setText(findTestObject('InterviewPortal/searchJobLocator'), keyValue)

Thread.sleep(3000)

WebUI.click(findTestObject('InterviewPortal/AppliedCandidate'))

WebUI.click(findTestObject('InterviewPortal/ViewFirstCandidate'))

WebUI.click(findTestObject('Yopmail.com/interviewPanelistSearchLocator'))

penelistEmailName = (('Auto' + RandomStringUtils.randomAlphabetic(4)) + '@yopmail.com')

System.out.println(penelistEmailName)

WebUI.setText(findTestObject('Yopmail.com/interviewPanelistSearchLocator'), RandomStringUtils.randomAlphabetic(4))

WebUI.click(findTestObject('Yopmail.com/sendPenelistInviteLocator'))

WebUI.click(findTestObject('Yopmail.com/sendInterviewInviteEmail'))

WebUI.setText(findTestObject('Yopmail.com/sendInterviewInviteEmail'), penelistEmailName)

WebUI.click(findTestObject('Yopmail.com/InterviewPortal/inviteButtonLocator'))

    ((driver) as JavascriptExecutor).executeScript('window.open(arguments[0])', 'https://yopmail.com/en/')

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_YOPmail - Disposable Email Address/input_Type the Email name of your choice_login'), 
    penelistEmailName)

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_YOPmail - Disposable Email Address/i_'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Inbox/span_Show pictures'))

WebUI.click(findTestObject('Object Repository/InterviewPanelistInvitation/Page_Inbox/a_Register'))

WebUI.switchToWindowIndex(2)

penelistName = ('A' + RandomStringUtils.randomAlphabetic(4))

System.out.println(penelistName)

WebUI.setText(findTestObject('Object Repository/InterviewPanelistInvitation/Page_Mobile Talent  Interview Portal/input__firstName'), 
    penelistName)

WebUI.setText(findTestObject('Object Repository/InterviewPanelistInvitation/Page_Mobile Talent  Interview Portal/input__lastName'), 
    penelistName)

WebUI.setText(findTestObject('Object Repository/InterviewPanelistInvitation/Page_Mobile Talent  Interview Portal/input__phone'), 
    '1325' + RandomStringUtils.randomNumeric(6))

WebUI.setEncryptedText(findTestObject('Object Repository/InterviewPanelistInvitation/Page_Mobile Talent  Interview Portal/input__password'), 
    'RAIVpflpDOg=')

WebUI.setEncryptedText(findTestObject('Object Repository/InterviewPanelistInvitation/Page_Mobile Talent  Interview Portal/input__confPassword'), 
    'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/InterviewPanelistInvitation/Page_Mobile Talent  Interview Portal/input__termsConditions'))

WebUI.click(findTestObject('Object Repository/InterviewPanelistInvitation/Page_Mobile Talent  Interview Portal/input__btn btn-primary w-50 m-auto'))

Thread.sleep(10000)

textOnPage = WebUI.getText(findTestObject('Object Repository/InterviewPanelistInvitation/Page_Mobile Talent  Interview Portal/h2_You have successfully Registered'))

System.out.println(textOnPage)

WebUI.switchToWindowIndex(0)

driver.navigate().refresh()

WebUI.scrollToElement(findTestObject('InterviewPortal/logoutDropdown'), 1)

WebUI.click(findTestObject('InterviewPortal/logoutDropdown'))

WebUI.click(findTestObject('InterviewPortal/logoutButon'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'),
	GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'),
	GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Mobile Recruitment/i_Mobile Recruitment Platform_fas fa-chevron-down'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Mobile Recruitment/a_Interview Portal'))

WebUI.click(findTestObject('InterviewPortal/JobsLocator'))

WebUI.click(findTestObject('InterviewPortal/searchJobLocator'))

WebUI.setText(findTestObject('InterviewPortal/searchJobLocator'), keyValue)

Thread.sleep(3000)

WebUI.click(findTestObject('InterviewPortal/AppliedCandidate'))

WebUI.click(findTestObject('InterviewPortal/ViewFirstCandidate'))

driver.findElement(By.cssSelector('input[title=\'Set as primary\']')).click()

WebUI.click(findTestObject('InterviewPortal/InPersonCommunicationMode'))

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

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/div_Interview booked at  June 27th 2022 fro_9e7afc'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/h4_Atish Sharma'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/a_Logout'))

WebUI.closeBrowser()