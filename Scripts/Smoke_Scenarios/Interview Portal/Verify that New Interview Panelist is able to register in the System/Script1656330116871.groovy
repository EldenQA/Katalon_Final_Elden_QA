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
import internal.GlobalVariable as GlobalVariable
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.apache.commons.lang.math.RandomUtils as RandomUtils
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions

WebUI.callTestCase(findTestCase('Smoke_Scenarios/Interview Portal/Dependent TestCases/Verify that user is able to Shortlist the Candidate'), 
[:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

Properties pro = new Properties()
pro.load(new FileInputStream('Files/interviewPortal.properties'))
candidateName= pro.getProperty('InterviewPortalCandidateName')
penelistEmailName= pro.getProperty('PanelistEmailName_1')
penelistName= pro.getProperty('PanelistName_1')
WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

Actions ac = new Actions(driver)

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

WebUI.click(findTestObject('Yopmail.com/interviewPanelistSearchLocator'))

WebUI.setText(findTestObject('Yopmail.com/interviewPanelistSearchLocator'),penelistName )

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

WebUI.setText(findTestObject('Object Repository/InterviewPanelistInvitation/Page_Mobile Talent  Interview Portal/input__firstName'), 
    penelistName)

WebUI.setText(findTestObject('Object Repository/InterviewPanelistInvitation/Page_Mobile Talent  Interview Portal/input__lastName'), 
    penelistName)

WebUI.setText(findTestObject('Object Repository/InterviewPanelistInvitation/Page_Mobile Talent  Interview Portal/input__phone'), 
    '113' + RandomStringUtils.randomNumeric(7))

WebUI.setEncryptedText(findTestObject('Object Repository/InterviewPanelistInvitation/Page_Mobile Talent  Interview Portal/input__password'), 
    'p4y+y39Ir5OTdtOb306gDg==')

WebUI.setEncryptedText(findTestObject('Object Repository/InterviewPanelistInvitation/Page_Mobile Talent  Interview Portal/input__confPassword'), 
    'p4y+y39Ir5OTdtOb306gDg==')

WebUI.click(findTestObject('Object Repository/InterviewPanelistInvitation/Page_Mobile Talent  Interview Portal/input__termsConditions'))

WebUI.click(findTestObject('Object Repository/InterviewPanelistInvitation/Page_Mobile Talent  Interview Portal/input__btn btn-primary w-50 m-auto'))

Thread.sleep(5000)

textOnPage = WebUI.getText(findTestObject('Object Repository/InterviewPanelistInvitation/Page_Mobile Talent  Interview Portal/h2_You have successfully Registered'))

System.out.println(textOnPage)

WebUI.switchToWindowIndex(0)

driver.navigate().refresh()

List<WebElement> allInterviewPanelist = driver.findElements(By.cssSelector('label[for=\'{user.firstName} {user.lastName}\']'))

int sizeNumber = allInterviewPanelist.size()

for (int i = 0; i < sizeNumber; i++) {
    String textOFInterviewPanelist = allInterviewPanelist.get(i).getText()

    System.out.println(textOFInterviewPanelist)

    if (textOFInterviewPanelist.equalsIgnoreCase((penelistName + ' ') + penelistName)) {
        System.out.println('Interview Panelsit Added Successfully')
		WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/h4_Atish Sharma'))
		WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/a_Logout'))
        WebUI.closeBrowser()

        break
    }
}

